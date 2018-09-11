package hello.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 下单记录表
 * </p>
 *
 * @author lv-success
 * @since 2018-09-10
 */
@TableName("shop_create_order_record")
public class ShopCreateOrderRecord extends Model<ShopCreateOrderRecord> {

    private static final long serialVersionUID = 1L;
    /**
     * 订单明细id
     */
    @TableId(type = IdType.UUID)
    private String id;

    /**
     * 订单明细id
     */
    @TableField("c_detailid")
    private String cDetailid;
    /**
     * 商品编号
     */
    @TableField("c_dealno")
    private String cDealno;
    /**
     * 商品id
     */
    @TableField("goods_id")
    private String goodsId;
    /**
     * 商品名称
     */
    @TableField("goods_name")
    private String goodsName;
    /**
     * 用户id
     */
    @TableField("user_id")
    private String userId;
    /**
     * 用户名称
     */
    @TableField("user_name")
    private String userName;
    /**
     * 用户类型（0 个人用户，1 企业用户）
     */
    @TableField("register_type")
    private String registerType;
    /**
     * 数据来源(1 PC,2  WAP)
     */
    private String origin;
    /**
     * 下单数量
     */
    @TableField("order_num")
    private Integer orderNum;
    /**
     * 分站id
     */
    @TableField("company_id")
    private String companyId;
    /**
     * 分站名称
     */
    @TableField("company_name")
    private String companyName;
    /**
     * 下单开始时间
     */
    private Date adddate;
    /**
     * 最近编辑时间
     */
    private Date editdate;
    /**
     * 下单企业名称（企业用户才会显示）
     */
    @TableField("buyer_companyname")
    private String buyerCompanyname;


    public String getcDetailid() {
        return cDetailid;
    }

    public void setcDetailid(String cDetailid) {
        this.cDetailid = cDetailid;
    }

    public String getcDealno() {
        return cDealno;
    }

    public void setcDealno(String cDealno) {
        this.cDealno = cDealno;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public Date getEditdate() {
        return editdate;
    }

    public void setEditdate(Date editdate) {
        this.editdate = editdate;
    }

    public String getBuyerCompanyname() {
        return buyerCompanyname;
    }

    public void setBuyerCompanyname(String buyerCompanyname) {
        this.buyerCompanyname = buyerCompanyname;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ShopCreateOrderRecord{" +
        ", cDetailid=" + cDetailid +
        ", cDealno=" + cDealno +
        ", goodsId=" + goodsId +
        ", goodsName=" + goodsName +
        ", userId=" + userId +
        ", userName=" + userName +
        ", registerType=" + registerType +
        ", origin=" + origin +
        ", orderNum=" + orderNum +
        ", companyId=" + companyId +
        ", companyName=" + companyName +
        ", adddate=" + adddate +
        ", editdate=" + editdate +
        ", buyerCompanyname=" + buyerCompanyname +
        "}";
    }
}
