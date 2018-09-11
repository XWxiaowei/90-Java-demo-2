package hello.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lv-success
 * @since 2018-09-10
 */
@TableName("shop_order_detail")
public class ShopOrderDetail extends Model<ShopOrderDetail> {

    private static final long serialVersionUID = 1L;

    @TableId("c_detailid")
    private String cDetailid;
    /**
     * 订单ID
     */
    @TableField("c_orderid")
    private String cOrderid;
    /**
     * 商品ID
     */
    @TableField("c_goodsdetailid")
    private String cGoodsdetailid;
    /**
     * 商品数量
     */
    @TableField("i_goodsnum")
    private Integer iGoodsnum;
    /**
     * 成本价
     */
    @TableField("f_costprice")
    private Double fCostprice;
    /**
     * 销售价
     */
    @TableField("f_sellprice")
    private Double fSellprice;
    /**
     * 市场价
     */
    @TableField("f_marketprice")
    private Double fMarketprice;
    /**
     * 应付金额
     */
    @TableField("f_totalpaymoney")
    private Double fTotalpaymoney;
    /**
     * 商品税率
     */
    @TableField("f_taxRate")
    private Double fTaxrate;
    /**
     * 商品名称
     */
    @TableField("c_goodsname")
    private String cGoodsname;
    /**
     * 优惠金额（促销活动）
     */
    @TableField("f_activemoney")
    private Double fActivemoney;
    /**
     * 1为满减；2为满增；3为换购；4组合套餐；5为限时抢购；6为秒杀 7会员折扣
     */
    @TableField("c_activitytype")
    private String cActivitytype;
    /**
     * 促销活动id(不必填)
     */
    @TableField("c_activityid")
    private String cActivityid;
    /**
     * 促销活动名称
     */
    @TableField("c_activityname")
    private String cActivityname;
    /**
     * 订单状态
     */
    @TableField("c_status")
    private String cStatus;
    /**
     * 同步状态
     */
    @TableField("c_syncstate")
    private String cSyncstate;
    /**
     * 修改金额后单价
     */
    @TableField("f_discountprice")
    private Double fDiscountprice;
    /**
     * f_sellprice * i_goodsnum
     */
    @TableField("f_goodsmoney")
    private Double fGoodsmoney;
    /**
     * 备注:促销活动+优惠活动
     */
    @TableField("c_note")
    private String cNote;
    /**
     * 积分订单总计
     */
    @TableField("f_needscore")
    private Double fNeedscore;
    /**
     * 活动规则id(不必填)
     */
    @TableField("c_acitvityruleid")
    private String cAcitvityruleid;
    /**
     * 是否(其他,非促销配置)秒杀商品
     */
    @TableField("c_issecondskill")
    private String cIssecondskill;
    /**
     * 是否(其他,非促销配置)赠品或换购（0赠品，1换购）
     */
    @TableField("c_isgifts")
    private String cIsgifts;
    /**
     * 套餐价格
     */
    @TableField("f_packageprice")
    private Double fPackageprice;
    /**
     * 使用优惠劵id(不必填)
     */
    @TableField("c_couponid")
    private String cCouponid;
    /**
     * 分站商品编码
     */
    @TableField("c_dealcode")
    private String cDealcode;
    /**
     * 商品图片
     */
    @TableField("c_image")
    private String cImage;
    /**
     * 商品编号
     */
    @TableField("c_dealno")
    private String cDealno;
    /**
     * 订单获取积分
     */
    @TableField("i_score")
    private Integer iScore;


    public String getcDetailid() {
        return cDetailid;
    }

    public void setcDetailid(String cDetailid) {
        this.cDetailid = cDetailid;
    }

    public String getcOrderid() {
        return cOrderid;
    }

    public void setcOrderid(String cOrderid) {
        this.cOrderid = cOrderid;
    }

    public String getcGoodsdetailid() {
        return cGoodsdetailid;
    }

    public void setcGoodsdetailid(String cGoodsdetailid) {
        this.cGoodsdetailid = cGoodsdetailid;
    }

    public Integer getiGoodsnum() {
        return iGoodsnum;
    }

    public void setiGoodsnum(Integer iGoodsnum) {
        this.iGoodsnum = iGoodsnum;
    }

    public Double getfCostprice() {
        return fCostprice;
    }

    public void setfCostprice(Double fCostprice) {
        this.fCostprice = fCostprice;
    }

    public Double getfSellprice() {
        return fSellprice;
    }

    public void setfSellprice(Double fSellprice) {
        this.fSellprice = fSellprice;
    }

    public Double getfMarketprice() {
        return fMarketprice;
    }

    public void setfMarketprice(Double fMarketprice) {
        this.fMarketprice = fMarketprice;
    }

    public Double getfTotalpaymoney() {
        return fTotalpaymoney;
    }

    public void setfTotalpaymoney(Double fTotalpaymoney) {
        this.fTotalpaymoney = fTotalpaymoney;
    }

    public Double getfTaxrate() {
        return fTaxrate;
    }

    public void setfTaxrate(Double fTaxrate) {
        this.fTaxrate = fTaxrate;
    }

    public String getcGoodsname() {
        return cGoodsname;
    }

    public void setcGoodsname(String cGoodsname) {
        this.cGoodsname = cGoodsname;
    }

    public Double getfActivemoney() {
        return fActivemoney;
    }

    public void setfActivemoney(Double fActivemoney) {
        this.fActivemoney = fActivemoney;
    }

    public String getcActivitytype() {
        return cActivitytype;
    }

    public void setcActivitytype(String cActivitytype) {
        this.cActivitytype = cActivitytype;
    }

    public String getcActivityid() {
        return cActivityid;
    }

    public void setcActivityid(String cActivityid) {
        this.cActivityid = cActivityid;
    }

    public String getcActivityname() {
        return cActivityname;
    }

    public void setcActivityname(String cActivityname) {
        this.cActivityname = cActivityname;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }

    public String getcSyncstate() {
        return cSyncstate;
    }

    public void setcSyncstate(String cSyncstate) {
        this.cSyncstate = cSyncstate;
    }

    public Double getfDiscountprice() {
        return fDiscountprice;
    }

    public void setfDiscountprice(Double fDiscountprice) {
        this.fDiscountprice = fDiscountprice;
    }

    public Double getfGoodsmoney() {
        return fGoodsmoney;
    }

    public void setfGoodsmoney(Double fGoodsmoney) {
        this.fGoodsmoney = fGoodsmoney;
    }

    public String getcNote() {
        return cNote;
    }

    public void setcNote(String cNote) {
        this.cNote = cNote;
    }

    public Double getfNeedscore() {
        return fNeedscore;
    }

    public void setfNeedscore(Double fNeedscore) {
        this.fNeedscore = fNeedscore;
    }

    public String getcAcitvityruleid() {
        return cAcitvityruleid;
    }

    public void setcAcitvityruleid(String cAcitvityruleid) {
        this.cAcitvityruleid = cAcitvityruleid;
    }

    public String getcIssecondskill() {
        return cIssecondskill;
    }

    public void setcIssecondskill(String cIssecondskill) {
        this.cIssecondskill = cIssecondskill;
    }

    public String getcIsgifts() {
        return cIsgifts;
    }

    public void setcIsgifts(String cIsgifts) {
        this.cIsgifts = cIsgifts;
    }

    public Double getfPackageprice() {
        return fPackageprice;
    }

    public void setfPackageprice(Double fPackageprice) {
        this.fPackageprice = fPackageprice;
    }

    public String getcCouponid() {
        return cCouponid;
    }

    public void setcCouponid(String cCouponid) {
        this.cCouponid = cCouponid;
    }

    public String getcDealcode() {
        return cDealcode;
    }

    public void setcDealcode(String cDealcode) {
        this.cDealcode = cDealcode;
    }

    public String getcImage() {
        return cImage;
    }

    public void setcImage(String cImage) {
        this.cImage = cImage;
    }

    public String getcDealno() {
        return cDealno;
    }

    public void setcDealno(String cDealno) {
        this.cDealno = cDealno;
    }

    public Integer getiScore() {
        return iScore;
    }

    public void setiScore(Integer iScore) {
        this.iScore = iScore;
    }

    @Override
    protected Serializable pkVal() {
        return this.cDetailid;
    }

    @Override
    public String toString() {
        return "ShopOrderDetail{" +
        ", cDetailid=" + cDetailid +
        ", cOrderid=" + cOrderid +
        ", cGoodsdetailid=" + cGoodsdetailid +
        ", iGoodsnum=" + iGoodsnum +
        ", fCostprice=" + fCostprice +
        ", fSellprice=" + fSellprice +
        ", fMarketprice=" + fMarketprice +
        ", fTotalpaymoney=" + fTotalpaymoney +
        ", fTaxrate=" + fTaxrate +
        ", cGoodsname=" + cGoodsname +
        ", fActivemoney=" + fActivemoney +
        ", cActivitytype=" + cActivitytype +
        ", cActivityid=" + cActivityid +
        ", cActivityname=" + cActivityname +
        ", cStatus=" + cStatus +
        ", cSyncstate=" + cSyncstate +
        ", fDiscountprice=" + fDiscountprice +
        ", fGoodsmoney=" + fGoodsmoney +
        ", cNote=" + cNote +
        ", fNeedscore=" + fNeedscore +
        ", cAcitvityruleid=" + cAcitvityruleid +
        ", cIssecondskill=" + cIssecondskill +
        ", cIsgifts=" + cIsgifts +
        ", fPackageprice=" + fPackageprice +
        ", cCouponid=" + cCouponid +
        ", cDealcode=" + cDealcode +
        ", cImage=" + cImage +
        ", cDealno=" + cDealno +
        ", iScore=" + iScore +
        "}";
    }
}
