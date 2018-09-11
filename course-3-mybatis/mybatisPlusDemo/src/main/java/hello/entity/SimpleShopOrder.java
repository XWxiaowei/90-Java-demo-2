package hello.entity;

import java.util.Date;

/**
 * @author xiang.wei
 * @create 2018/9/6 10:45
 */
public class SimpleShopOrder {
    private String cBuyerid;

    private String buyerName;

    private String cBuyercompanyname;
    private Date dtAdddate;
    private String cCompanyid;
    private String cCompanyname;

    /**
     * 来源
     */
    private String cOrderorigin;
    /**
     * 订单id
     */
    private String cOrderid;
    public String getcBuyerid() {
        return cBuyerid;
    }

    public void setcBuyerid(String cBuyerid) {
        this.cBuyerid = cBuyerid;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getcBuyercompanyname() {
        return cBuyercompanyname;
    }

    public void setcBuyercompanyname(String cBuyercompanyname) {
        this.cBuyercompanyname = cBuyercompanyname;
    }

    public Date getDtAdddate() {
        return dtAdddate;
    }

    public void setDtAdddate(Date dtAdddate) {
        this.dtAdddate = dtAdddate;
    }

    public String getcCompanyid() {
        return cCompanyid;
    }

    public void setcCompanyid(String cCompanyid) {
        this.cCompanyid = cCompanyid;
    }

    public String getcCompanyname() {
        return cCompanyname;
    }

    public void setcCompanyname(String cCompanyname) {
        this.cCompanyname = cCompanyname;
    }

    public String getcOrderorigin() {
        return cOrderorigin;
    }

    public void setcOrderorigin(String cOrderorigin) {
        this.cOrderorigin = cOrderorigin;
    }

    public String getcOrderid() {
        return cOrderid;
    }

    public void setcOrderid(String cOrderid) {
        this.cOrderid = cOrderid;
    }
}
