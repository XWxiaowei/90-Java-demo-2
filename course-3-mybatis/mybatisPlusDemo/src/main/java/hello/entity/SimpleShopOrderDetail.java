package hello.entity;

/**
 * @author xiang.wei
 * @create 2018/9/6 10:49
 */
public class SimpleShopOrderDetail {
    /**
     * 订单id
     */
    private String cOrderid;
    /**
     * 订单详情id
     */
    private String cDetailid;

    /**
     * 商品详情id
     */
    private String cGoodsdetailid;
    /**
     * 商品名称
     */
    private String cGoodsname;
    /**
     * 商品编号
     */
    private String cDealno;
    /**
     * 购买商品数量
     */
    private Integer iGoodsnum;

    public String getcDetailid() {
        return cDetailid;
    }

    public void setcDetailid(String cDetailid) {
        this.cDetailid = cDetailid;
    }

    public String getcGoodsdetailid() {
        return cGoodsdetailid;
    }

    public void setcGoodsdetailid(String cGoodsdetailid) {
        this.cGoodsdetailid = cGoodsdetailid;
    }

    public String getcGoodsname() {
        return cGoodsname;
    }

    public void setcGoodsname(String cGoodsname) {
        this.cGoodsname = cGoodsname;
    }

    public String getcDealno() {
        return cDealno;
    }

    public void setcDealno(String cDealno) {
        this.cDealno = cDealno;
    }

    public Integer getiGoodsnum() {
        return iGoodsnum;
    }

    public void setiGoodsnum(Integer iGoodsnum) {
        this.iGoodsnum = iGoodsnum;
    }

    public String getcOrderid() {
        return cOrderid;
    }

    public void setcOrderid(String cOrderid) {
        this.cOrderid = cOrderid;
    }
}
