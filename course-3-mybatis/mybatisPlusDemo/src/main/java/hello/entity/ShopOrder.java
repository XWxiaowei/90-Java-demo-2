package hello.entity;

import java.util.Date;
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
@TableName("shop_order")
public class ShopOrder extends Model<ShopOrder> {

    private static final long serialVersionUID = 1L;

    @TableId("c_orderid")
    private String cOrderid;
    /**
     * 卖家ID
     */
    @TableField("c_companyid")
    private String cCompanyid;
    /**
     * 收货人地址
     */
    @TableField("c_address")
    private String cAddress;
    /**
     * 优惠活动
     */
    @TableField("c_activityname")
    private String cActivityname;
    /**
     * 订单销售价
     */
    @TableField("f_goodsmoney")
    private Double fGoodsmoney;
    /**
     * 优惠金额(促销活动)
     */
    @TableField("f_activemoney")
    private Double fActivemoney;
    /**
     * 运费
     */
    @TableField("f_excost")
    private Double fExcost;
    /**
     * 订单应付金额
     */
    @TableField("f_totalpaymoney")
    private Double fTotalpaymoney;
    /**
     * 订单已付金额
     */
    @TableField("f_alreadypaymoney")
    private Double fAlreadypaymoney;
    /**
     * 支付类型：{"0", "在线支付"},{"1", "货到付款"},{"2", "积分支付"},{"3","抽奖订单"},{"4","个人网银"},{"5","企业网银"},{"6","快捷支付"},{"7","支付宝"},{"8","微信支付"},{"9","账期支付"},{"10","上海第三方"},{"11","免支付"},{"12","现金"}
     */
    @TableField("c_paytype")
    private String cPaytype;
    /**
     * 订单配送方式
     */
    @TableField("c_sendtype")
    private String cSendtype;
    /**
     * 买家ID-shop_buyer
     */
    @TableField("c_buyerid")
    private String cBuyerid;
    /**
     * 下单时间
     */
    @TableField("dt_adddate")
    private Date dtAdddate;
    @TableField("c_payinfo")
    private String cPayinfo;
    /**
     * {"0", "已下单"},{"1", "已付款"},{"2", "订单关闭"},{"3", "已正在派送"},
{"4", "退货待审核"},{"5", "换货待审核"},{"6", "完成发货"},{"7", "订单完成"},,{"9","准备发货"},{"11","待派送"},
{"12","审核成功(退货)"},{"13","审核成功(换货)"}, {"14","审核失败（退货）"},{"15","审核失败（换货）"},
{"16","退货"},,{"18","已退货"}
     */
    @TableField("c_status")
    private String cStatus;
    /**
     * 买家留言
     */
    @TableField("c_buyernote")
    private String cBuyernote;
    /**
     * 买家操作备注
     */
    @TableField("c_sellernote")
    private String cSellernote;
    @TableField("c_invoiceid")
    private String cInvoiceid;
    /**
     * 订单编号
     */
    @TableField("c_dealno")
    private String cDealno;
    /**
     * 快递公司
     */
    @TableField("c_exid")
    private String cExid;
    /**
     * 快递号
     */
    @TableField("c_exno")
    private String cExno;
    /**
     * 收货人姓名
     */
    @TableField("c_consignee")
    private String cConsignee;
    /**
     * 收货人电话
     */
    @TableField("c_mobile")
    private String cMobile;
    /**
     * 收货人电话
     */
    @TableField("c_phone")
    private String cPhone;
    /**
     * 同步CRM状态
     */
    @TableField("c_syncstate")
    private String cSyncstate;
    @TableField("c_chargecity")
    private String cChargecity;
    /**
     * 支付时间
     */
    @TableField("dt_paydate")
    private Date dtPaydate;
    /**
     * 优惠金额(后台修改订单价格)
     */
    @TableField("f_cheapmoney")
    private Double fCheapmoney;
    /**
     * 配送时间 1=仅限工作日送货
     */
    @TableField("c_takeperiod")
    private String cTakeperiod;
    /**
     * 买家区域
     */
    @TableField("c_buyerareaid")
    private String cBuyerareaid;
    /**
     * 买家地址
     */
    @TableField("c_detailaddr")
    private String cDetailaddr;
    /**
     * 交易号
     */
    @TableField("c_tradeno")
    private String cTradeno;
    /**
     * 交易状态
     */
    @TableField("c_tradestate")
    private String cTradestate;
    /**
     * 交易信息
     */
    @TableField("c_trademessage")
    private String cTrademessage;
    /**
     * 支付流水号
     */
    @TableField("c_payno")
    private String cPayno;
    /**
     * 是否评价
     */
    @TableField("c_isEvaluate")
    private String cIsevaluate;
    /**
     * 订单结算状态
     */
    @TableField("c_settlestatus")
    private String cSettlestatus;
    /**
     * 订单结束时间
     */
    @TableField("dt_enddate")
    private Date dtEnddate;
    /**
     * 是否延迟发货
     */
    @TableField("c_isdelay")
    private String cIsdelay;
    /**
     * 退款金额
     */
    @TableField("f_refundMoney")
    private Double fRefundmoney;
    /**
     * 技服人员
     */
    @TableField("c_servicer")
    private String cServicer;
    /**
     * 支付总积分
     */
    @TableField("f_paytotalscore")
    private Double fPaytotalscore;
    /**
     * 积分抵扣金额
     */
    @TableField("f_scoremoney")
    private Double fScoremoney;
    /**
     * 会员折扣金额
     */
    @TableField("f_vipdiscountprice")
    private Double fVipdiscountprice;
    /**
     * 是否赠品订单
     */
    @TableField("c_isgift")
    private String cIsgift;
    /**
     * 订单结算时间
     */
    @TableField("dt_settledate")
    private Date dtSettledate;
    /**
     * 发货省市区
     */
    @TableField("c_sendGoodsCity")
    private String cSendgoodscity;
    /**
     * 代金券数
     */
    @TableField("i_cashNum")
    private Integer iCashnum;
    /**
     * 代金券
     */
    @TableField("c_cashNum")
    private String cCashnum;
    /**
     * 订单平台类型0,商城;1,积分馆;2,抽奖订单;4,企业超市;5,诺诺服务,6是云记账
     */
    @TableField("c_platformtype")
    private String cPlatformtype;
    /**
     * 商家ID(分站下引入的商家)
     */
    @TableField("c_merchantid")
    private String cMerchantid;
    /**
     * 优惠券金额
     */
    @TableField("f_totalcoupon")
    private Double fTotalcoupon;
    /**
     * 使用优惠劵id
     */
    @TableField("c_usecouponinfoid")
    private String cUsecouponinfoid;
    /**
     * 购买公司税号
     */
    @TableField("c_taxnum")
    private String cTaxnum;
    /**
     * 企业名称
     */
    @TableField("c_buyerCompanyname")
    private String cBuyercompanyname;
    /**
     * 买家留言
     */
    @TableField("c_buyWords")
    private String cBuywords;
    /**
     * 配送方式:0--技服配送;1--上门自提
     */
    @TableField("c_deliveryType")
    private String cDeliverytype;
    /**
     * 订单类型,0:普通订单,1:定期购订单,2:账期购还款订单，3：服务订单，4：企业自办订单,5：虚拟商品订单, 6 : 金税盘分机订单7:技服o2o订单 8:点下户金税盘订单 9:运营支撑平台订单 10:众包平台订单
     */
    @TableField("c_shopType")
    private String cShoptype;
    /**
     * 分期，几期 例如2-0,2-1,2-2
     */
    @TableField("c_frequency")
    private String cFrequency;
    /**
     * 卖家名称
     */
    @TableField("c_companyname")
    private String cCompanyname;
    /**
     * 买家名
     */
    @TableField("buyer_name")
    private String buyerName;
    /**
     * 技服工号
     */
    @TableField("c_servicernum")
    private String cServicernum;
    /**
     * 技服名称
     */
    @TableField("c_cname")
    private String cCname;
    /**
     * 支付完成跳转链接
     */
    @TableField("c_returnurl")
    private String cReturnurl;
    /**
     * 0是pc端订单 1 APP 2 WAP 3WEIXIN  4APPH5
     */
    @TableField("c_orderorigin")
    private String cOrderorigin;
    /**
     * 0：未同步，1：未更新，2：已同步, -1：失败
     */
    @TableField("c_migratestate")
    private String cMigratestate;
    /**
     * 支付完成后是否自动订单完成:0--否;1--是
     */
    @TableField("c_iscomplete")
    private String cIscomplete;
    /**
     * 税盘编号
     */
    @TableField("c_taxplate_num")
    private String cTaxplateNum;
    /**
     * 商家名称
     */
    @TableField("c_merchantname")
    private String cMerchantname;
    /**
     * 自提点id
     */
    @TableField("c_selfsite_id")
    private String cSelfsiteId;
    /**
     * 自提点名称
     */
    @TableField("c_selfsite_name")
    private String cSelfsiteName;


    public String getcOrderid() {
        return cOrderid;
    }

    public void setcOrderid(String cOrderid) {
        this.cOrderid = cOrderid;
    }

    public String getcCompanyid() {
        return cCompanyid;
    }

    public void setcCompanyid(String cCompanyid) {
        this.cCompanyid = cCompanyid;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcActivityname() {
        return cActivityname;
    }

    public void setcActivityname(String cActivityname) {
        this.cActivityname = cActivityname;
    }

    public Double getfGoodsmoney() {
        return fGoodsmoney;
    }

    public void setfGoodsmoney(Double fGoodsmoney) {
        this.fGoodsmoney = fGoodsmoney;
    }

    public Double getfActivemoney() {
        return fActivemoney;
    }

    public void setfActivemoney(Double fActivemoney) {
        this.fActivemoney = fActivemoney;
    }

    public Double getfExcost() {
        return fExcost;
    }

    public void setfExcost(Double fExcost) {
        this.fExcost = fExcost;
    }

    public Double getfTotalpaymoney() {
        return fTotalpaymoney;
    }

    public void setfTotalpaymoney(Double fTotalpaymoney) {
        this.fTotalpaymoney = fTotalpaymoney;
    }

    public Double getfAlreadypaymoney() {
        return fAlreadypaymoney;
    }

    public void setfAlreadypaymoney(Double fAlreadypaymoney) {
        this.fAlreadypaymoney = fAlreadypaymoney;
    }

    public String getcPaytype() {
        return cPaytype;
    }

    public void setcPaytype(String cPaytype) {
        this.cPaytype = cPaytype;
    }

    public String getcSendtype() {
        return cSendtype;
    }

    public void setcSendtype(String cSendtype) {
        this.cSendtype = cSendtype;
    }

    public String getcBuyerid() {
        return cBuyerid;
    }

    public void setcBuyerid(String cBuyerid) {
        this.cBuyerid = cBuyerid;
    }

    public Date getDtAdddate() {
        return dtAdddate;
    }

    public void setDtAdddate(Date dtAdddate) {
        this.dtAdddate = dtAdddate;
    }

    public String getcPayinfo() {
        return cPayinfo;
    }

    public void setcPayinfo(String cPayinfo) {
        this.cPayinfo = cPayinfo;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }

    public String getcBuyernote() {
        return cBuyernote;
    }

    public void setcBuyernote(String cBuyernote) {
        this.cBuyernote = cBuyernote;
    }

    public String getcSellernote() {
        return cSellernote;
    }

    public void setcSellernote(String cSellernote) {
        this.cSellernote = cSellernote;
    }

    public String getcInvoiceid() {
        return cInvoiceid;
    }

    public void setcInvoiceid(String cInvoiceid) {
        this.cInvoiceid = cInvoiceid;
    }

    public String getcDealno() {
        return cDealno;
    }

    public void setcDealno(String cDealno) {
        this.cDealno = cDealno;
    }

    public String getcExid() {
        return cExid;
    }

    public void setcExid(String cExid) {
        this.cExid = cExid;
    }

    public String getcExno() {
        return cExno;
    }

    public void setcExno(String cExno) {
        this.cExno = cExno;
    }

    public String getcConsignee() {
        return cConsignee;
    }

    public void setcConsignee(String cConsignee) {
        this.cConsignee = cConsignee;
    }

    public String getcMobile() {
        return cMobile;
    }

    public void setcMobile(String cMobile) {
        this.cMobile = cMobile;
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public String getcSyncstate() {
        return cSyncstate;
    }

    public void setcSyncstate(String cSyncstate) {
        this.cSyncstate = cSyncstate;
    }

    public String getcChargecity() {
        return cChargecity;
    }

    public void setcChargecity(String cChargecity) {
        this.cChargecity = cChargecity;
    }

    public Date getDtPaydate() {
        return dtPaydate;
    }

    public void setDtPaydate(Date dtPaydate) {
        this.dtPaydate = dtPaydate;
    }

    public Double getfCheapmoney() {
        return fCheapmoney;
    }

    public void setfCheapmoney(Double fCheapmoney) {
        this.fCheapmoney = fCheapmoney;
    }

    public String getcTakeperiod() {
        return cTakeperiod;
    }

    public void setcTakeperiod(String cTakeperiod) {
        this.cTakeperiod = cTakeperiod;
    }

    public String getcBuyerareaid() {
        return cBuyerareaid;
    }

    public void setcBuyerareaid(String cBuyerareaid) {
        this.cBuyerareaid = cBuyerareaid;
    }

    public String getcDetailaddr() {
        return cDetailaddr;
    }

    public void setcDetailaddr(String cDetailaddr) {
        this.cDetailaddr = cDetailaddr;
    }

    public String getcTradeno() {
        return cTradeno;
    }

    public void setcTradeno(String cTradeno) {
        this.cTradeno = cTradeno;
    }

    public String getcTradestate() {
        return cTradestate;
    }

    public void setcTradestate(String cTradestate) {
        this.cTradestate = cTradestate;
    }

    public String getcTrademessage() {
        return cTrademessage;
    }

    public void setcTrademessage(String cTrademessage) {
        this.cTrademessage = cTrademessage;
    }

    public String getcPayno() {
        return cPayno;
    }

    public void setcPayno(String cPayno) {
        this.cPayno = cPayno;
    }

    public String getcIsevaluate() {
        return cIsevaluate;
    }

    public void setcIsevaluate(String cIsevaluate) {
        this.cIsevaluate = cIsevaluate;
    }

    public String getcSettlestatus() {
        return cSettlestatus;
    }

    public void setcSettlestatus(String cSettlestatus) {
        this.cSettlestatus = cSettlestatus;
    }

    public Date getDtEnddate() {
        return dtEnddate;
    }

    public void setDtEnddate(Date dtEnddate) {
        this.dtEnddate = dtEnddate;
    }

    public String getcIsdelay() {
        return cIsdelay;
    }

    public void setcIsdelay(String cIsdelay) {
        this.cIsdelay = cIsdelay;
    }

    public Double getfRefundmoney() {
        return fRefundmoney;
    }

    public void setfRefundmoney(Double fRefundmoney) {
        this.fRefundmoney = fRefundmoney;
    }

    public String getcServicer() {
        return cServicer;
    }

    public void setcServicer(String cServicer) {
        this.cServicer = cServicer;
    }

    public Double getfPaytotalscore() {
        return fPaytotalscore;
    }

    public void setfPaytotalscore(Double fPaytotalscore) {
        this.fPaytotalscore = fPaytotalscore;
    }

    public Double getfScoremoney() {
        return fScoremoney;
    }

    public void setfScoremoney(Double fScoremoney) {
        this.fScoremoney = fScoremoney;
    }

    public Double getfVipdiscountprice() {
        return fVipdiscountprice;
    }

    public void setfVipdiscountprice(Double fVipdiscountprice) {
        this.fVipdiscountprice = fVipdiscountprice;
    }

    public String getcIsgift() {
        return cIsgift;
    }

    public void setcIsgift(String cIsgift) {
        this.cIsgift = cIsgift;
    }

    public Date getDtSettledate() {
        return dtSettledate;
    }

    public void setDtSettledate(Date dtSettledate) {
        this.dtSettledate = dtSettledate;
    }

    public String getcSendgoodscity() {
        return cSendgoodscity;
    }

    public void setcSendgoodscity(String cSendgoodscity) {
        this.cSendgoodscity = cSendgoodscity;
    }

    public Integer getiCashnum() {
        return iCashnum;
    }

    public void setiCashnum(Integer iCashnum) {
        this.iCashnum = iCashnum;
    }

    public String getcCashnum() {
        return cCashnum;
    }

    public void setcCashnum(String cCashnum) {
        this.cCashnum = cCashnum;
    }

    public String getcPlatformtype() {
        return cPlatformtype;
    }

    public void setcPlatformtype(String cPlatformtype) {
        this.cPlatformtype = cPlatformtype;
    }

    public String getcMerchantid() {
        return cMerchantid;
    }

    public void setcMerchantid(String cMerchantid) {
        this.cMerchantid = cMerchantid;
    }

    public Double getfTotalcoupon() {
        return fTotalcoupon;
    }

    public void setfTotalcoupon(Double fTotalcoupon) {
        this.fTotalcoupon = fTotalcoupon;
    }

    public String getcUsecouponinfoid() {
        return cUsecouponinfoid;
    }

    public void setcUsecouponinfoid(String cUsecouponinfoid) {
        this.cUsecouponinfoid = cUsecouponinfoid;
    }

    public String getcTaxnum() {
        return cTaxnum;
    }

    public void setcTaxnum(String cTaxnum) {
        this.cTaxnum = cTaxnum;
    }

    public String getcBuyercompanyname() {
        return cBuyercompanyname;
    }

    public void setcBuyercompanyname(String cBuyercompanyname) {
        this.cBuyercompanyname = cBuyercompanyname;
    }

    public String getcBuywords() {
        return cBuywords;
    }

    public void setcBuywords(String cBuywords) {
        this.cBuywords = cBuywords;
    }

    public String getcDeliverytype() {
        return cDeliverytype;
    }

    public void setcDeliverytype(String cDeliverytype) {
        this.cDeliverytype = cDeliverytype;
    }

    public String getcShoptype() {
        return cShoptype;
    }

    public void setcShoptype(String cShoptype) {
        this.cShoptype = cShoptype;
    }

    public String getcFrequency() {
        return cFrequency;
    }

    public void setcFrequency(String cFrequency) {
        this.cFrequency = cFrequency;
    }

    public String getcCompanyname() {
        return cCompanyname;
    }

    public void setcCompanyname(String cCompanyname) {
        this.cCompanyname = cCompanyname;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getcServicernum() {
        return cServicernum;
    }

    public void setcServicernum(String cServicernum) {
        this.cServicernum = cServicernum;
    }

    public String getcCname() {
        return cCname;
    }

    public void setcCname(String cCname) {
        this.cCname = cCname;
    }

    public String getcReturnurl() {
        return cReturnurl;
    }

    public void setcReturnurl(String cReturnurl) {
        this.cReturnurl = cReturnurl;
    }

    public String getcOrderorigin() {
        return cOrderorigin;
    }

    public void setcOrderorigin(String cOrderorigin) {
        this.cOrderorigin = cOrderorigin;
    }

    public String getcMigratestate() {
        return cMigratestate;
    }

    public void setcMigratestate(String cMigratestate) {
        this.cMigratestate = cMigratestate;
    }

    public String getcIscomplete() {
        return cIscomplete;
    }

    public void setcIscomplete(String cIscomplete) {
        this.cIscomplete = cIscomplete;
    }

    public String getcTaxplateNum() {
        return cTaxplateNum;
    }

    public void setcTaxplateNum(String cTaxplateNum) {
        this.cTaxplateNum = cTaxplateNum;
    }

    public String getcMerchantname() {
        return cMerchantname;
    }

    public void setcMerchantname(String cMerchantname) {
        this.cMerchantname = cMerchantname;
    }

    public String getcSelfsiteId() {
        return cSelfsiteId;
    }

    public void setcSelfsiteId(String cSelfsiteId) {
        this.cSelfsiteId = cSelfsiteId;
    }

    public String getcSelfsiteName() {
        return cSelfsiteName;
    }

    public void setcSelfsiteName(String cSelfsiteName) {
        this.cSelfsiteName = cSelfsiteName;
    }

    @Override
    protected Serializable pkVal() {
        return this.cOrderid;
    }

    @Override
    public String toString() {
        return "ShopOrder{" +
        ", cOrderid=" + cOrderid +
        ", cCompanyid=" + cCompanyid +
        ", cAddress=" + cAddress +
        ", cActivityname=" + cActivityname +
        ", fGoodsmoney=" + fGoodsmoney +
        ", fActivemoney=" + fActivemoney +
        ", fExcost=" + fExcost +
        ", fTotalpaymoney=" + fTotalpaymoney +
        ", fAlreadypaymoney=" + fAlreadypaymoney +
        ", cPaytype=" + cPaytype +
        ", cSendtype=" + cSendtype +
        ", cBuyerid=" + cBuyerid +
        ", dtAdddate=" + dtAdddate +
        ", cPayinfo=" + cPayinfo +
        ", cStatus=" + cStatus +
        ", cBuyernote=" + cBuyernote +
        ", cSellernote=" + cSellernote +
        ", cInvoiceid=" + cInvoiceid +
        ", cDealno=" + cDealno +
        ", cExid=" + cExid +
        ", cExno=" + cExno +
        ", cConsignee=" + cConsignee +
        ", cMobile=" + cMobile +
        ", cPhone=" + cPhone +
        ", cSyncstate=" + cSyncstate +
        ", cChargecity=" + cChargecity +
        ", dtPaydate=" + dtPaydate +
        ", fCheapmoney=" + fCheapmoney +
        ", cTakeperiod=" + cTakeperiod +
        ", cBuyerareaid=" + cBuyerareaid +
        ", cDetailaddr=" + cDetailaddr +
        ", cTradeno=" + cTradeno +
        ", cTradestate=" + cTradestate +
        ", cTrademessage=" + cTrademessage +
        ", cPayno=" + cPayno +
        ", cIsevaluate=" + cIsevaluate +
        ", cSettlestatus=" + cSettlestatus +
        ", dtEnddate=" + dtEnddate +
        ", cIsdelay=" + cIsdelay +
        ", fRefundmoney=" + fRefundmoney +
        ", cServicer=" + cServicer +
        ", fPaytotalscore=" + fPaytotalscore +
        ", fScoremoney=" + fScoremoney +
        ", fVipdiscountprice=" + fVipdiscountprice +
        ", cIsgift=" + cIsgift +
        ", dtSettledate=" + dtSettledate +
        ", cSendgoodscity=" + cSendgoodscity +
        ", iCashnum=" + iCashnum +
        ", cCashnum=" + cCashnum +
        ", cPlatformtype=" + cPlatformtype +
        ", cMerchantid=" + cMerchantid +
        ", fTotalcoupon=" + fTotalcoupon +
        ", cUsecouponinfoid=" + cUsecouponinfoid +
        ", cTaxnum=" + cTaxnum +
        ", cBuyercompanyname=" + cBuyercompanyname +
        ", cBuywords=" + cBuywords +
        ", cDeliverytype=" + cDeliverytype +
        ", cShoptype=" + cShoptype +
        ", cFrequency=" + cFrequency +
        ", cCompanyname=" + cCompanyname +
        ", buyerName=" + buyerName +
        ", cServicernum=" + cServicernum +
        ", cCname=" + cCname +
        ", cReturnurl=" + cReturnurl +
        ", cOrderorigin=" + cOrderorigin +
        ", cMigratestate=" + cMigratestate +
        ", cIscomplete=" + cIscomplete +
        ", cTaxplateNum=" + cTaxplateNum +
        ", cMerchantname=" + cMerchantname +
        ", cSelfsiteId=" + cSelfsiteId +
        ", cSelfsiteName=" + cSelfsiteName +
        "}";
    }
}
