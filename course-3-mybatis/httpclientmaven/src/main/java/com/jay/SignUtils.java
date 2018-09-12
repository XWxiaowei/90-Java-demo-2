package com.thinkgem.jeesite.modules.app.utils;

import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * SignUtils
 *
 * @author kai.liu
 * @date 2018/08/09
 */
public class SignUtils {

    private static final String SYMBOLS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final Random RANDOM = new SecureRandom();

    /**
     * 生成 HMACSHA256
     *
     * @param data 待处理数据
     * @param key  密钥
     * @return 加密结果
     * @throws Exception
     */
    private static String HMACSHA256(String data, String key) throws Exception {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        sha256_HMAC.init(secret_key);
        byte[] array = sha256_HMAC.doFinal(data.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();
    }

    /**
     * 生成签名.
     *
     * @param data 待签名数据
     * @param key  API密钥
     * @return 签名
     */
    public static String generateSignature(Map<String, String> data, String key) throws Exception {
        Set<String> keySet = data.keySet();
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        Arrays.sort(keyArray);
        StringBuilder sb = new StringBuilder();
        for (String k : keyArray) {
            if (data.get(k).trim().length() > 0) {
                // 参数值为空，则不参与签名
                sb.append(k).append("=").append(data.get(k).trim()).append("&");
            }
        }
        sb.append("key=").append(key);
        return HMACSHA256(sb.toString(), key);
    }

    /**
     * 获取随机字符串 Nonce Str
     *
     * @return String 随机字符串
     */
    public static String generateNonceStr() {
        char[] nonceChars = new char[32];
        for (int index = 0; index < nonceChars.length; ++index) {
            nonceChars[index] = SYMBOLS.charAt(RANDOM.nextInt(SYMBOLS.length()));
        }
        return new String(nonceChars);
    }

    public static void main(String[] args) {
        //System.out.println(generateNonceStr());
//        String displayName, String cellphone, String cardNo, String appId, String nonceStr

        String key = "22380C492CD44FCBB1796389E2D9F649";

        Map<String, String> ret = new HashMap<String, String>();
        String displayName = "刘凯";
        String cellphone = "15801817832";
        String cardNo = "360822198609284091";
        String appId = "3F733E7DFFF740469C32F43A16FF818B";
        String nonceStr = "zZH5U3R84IDo4efR5zqBs7cnSSJmao4F";
        ret.put("displayName", displayName);
        ret.put("cellphone", cellphone);
        ret.put("cardNo", cardNo);
        ret.put("appId", appId);
        ret.put("nonceStr", nonceStr);
        /*try {
            String sign = generateSignature(ret, key);
            System.out.println(sign);
        } catch (Exception e) {
            e.printStackTrace();
        }*/       
    }
    

}
