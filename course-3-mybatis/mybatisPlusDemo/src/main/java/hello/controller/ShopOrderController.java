package hello.controller;


import com.alibaba.fastjson.JSON;
import hello.entity.SimpleShopOrder;
import hello.entity.SimpleShopOrderDetail;
import hello.service.ShopCreateOrderRecordService;
import hello.service.ShopOrderService;
import hello.util.DateUtil;
import hello.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lv-success
 * @since 2018-09-10
 */
@Controller
@RequestMapping("/shopOrder")
public class ShopOrderController {
    @Autowired
    private ShopCreateOrderRecordService shopCreateOrderRecordService;
    @Autowired
    private ShopOrderService shopOrderService;

    /**
     * 同步数据时每页条数
     */
//    private static final Integer PAGE_SIZE = 1;
      private static final Integer PAGE_SIZE = 200;
    /**
     *  订单同步
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/syncOrderRecord.do")
    public String syncOrderRecord() {
        long startTime = System.currentTimeMillis();
        System.out.println("开始时间=" + DateUtil.formatDate(new Date()));
//        查询出所有的订单记录(PC商城)
        try {
            {
                List<SimpleShopOrder> orderList = shopOrderService.selectOrders("0");
                if (CollectionUtils.isEmpty(orderList)) {
                    return JSON.toJSONString(ResultData.fail("订单列表为空"));
                }
                saveOrderR(orderList);
            }
//        查询出所有的订单记录（WAP商城）
            {
                List<SimpleShopOrder> orderList = shopOrderService.selectOrders("2");
                if (CollectionUtils.isEmpty(orderList)) {
                    return JSON.toJSONString(ResultData.fail("订单列表为空"));
                }
                saveOrderR(orderList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(DateUtil.formatDate(new Date())+" 订单同步失败={}");
        }
        long spendTime = (System.currentTimeMillis() - startTime)/1000;
        System.out.println("同步数据总耗时=" + spendTime+"秒");
        return JSON.toJSONString(ResultData.success());
    }
    private void saveOrderR(List<SimpleShopOrder> orderList) {
        List<SimpleShopOrder> simpleShopOrderList = new ArrayList<SimpleShopOrder>(PAGE_SIZE);
        List<SimpleShopOrderDetail> detailList = new ArrayList<SimpleShopOrderDetail>(PAGE_SIZE);
        List<String> orderIdStr = new ArrayList<String>();
        int j = 0;
        for (int i = 0; i <= orderList.size() - 1; i++) {
            SimpleShopOrder simpleShopOrder = orderList.get(i);
            orderIdStr.add(simpleShopOrder.getcOrderid());
            simpleShopOrderList.add(simpleShopOrder);
            if (i + 1 >= PAGE_SIZE && (i + 1) % PAGE_SIZE == 0) {
                j++;
                detailList = shopOrderService.getDetailById(orderIdStr);
                orderIdStr.clear();
                System.out.println("同步订单第"+j+"次");
                shopCreateOrderRecordService.saveOrderRecord(simpleShopOrderList, detailList);
            }
        }
    }
}

