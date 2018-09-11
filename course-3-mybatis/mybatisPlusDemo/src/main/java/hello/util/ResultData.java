package hello.util;

/**
 * 接口快速返回
 *
 * @author xiang.wei
 * @create 2017/12/14 10:56
 */
public class ResultData {
    private boolean result;
    private String msg;
    private String error;
    private Object data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 快速返回失败
     *
     * @param msg
     * @return
     */
    public static ResultData fail(String msg) {
        ResultData resultData = new ResultData();
        resultData.setResult(false);
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * 快速返回成功
     *
     * @return
     */
    public static ResultData success() {
        ResultData resultData = new ResultData();
        resultData.setResult(true);
        return resultData;
    }

    /**
     * 快速返回异常
     * @param error
     * @param msg
     * @return
     */
    public static ResultData error(String error, String msg) {
        ResultData resultData = new ResultData();
        resultData.setResult(false);
        resultData.setError(error);
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * 快速返回成功
     * @param data
     * @return
     */
    public static ResultData success(Object data) {
        ResultData resultData = new ResultData();
        resultData.setResult(true);
        resultData.setData(data);
        return resultData;
    }
}
