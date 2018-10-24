package com.jay.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 分站域名表
 * </p>
 *
 * @author jay.xiang
 * @since 2018-10-24
 */
@TableName("shop_area_domain")
public class ShopAreaDomain extends Model<ShopAreaDomain> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;
    /**
     * 区域id
     */
    @TableField("area_id")
    private String areaId;
    /**
     * 区域拼音
     */
    @TableField("area_pinyin")
    private String areaPinyin;
    /**
     * 分站域名
     */
    @TableField("area_domain")
    private String areaDomain;
    /**
     * 是否上线 1:上线，0:未上线
     */
    private String isopen;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaPinyin() {
        return areaPinyin;
    }

    public void setAreaPinyin(String areaPinyin) {
        this.areaPinyin = areaPinyin;
    }

    public String getAreaDomain() {
        return areaDomain;
    }

    public void setAreaDomain(String areaDomain) {
        this.areaDomain = areaDomain;
    }

    public String getIsopen() {
        return isopen;
    }

    public void setIsopen(String isopen) {
        this.isopen = isopen;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ShopAreaDomain{" +
        ", id=" + id +
        ", areaId=" + areaId +
        ", areaPinyin=" + areaPinyin +
        ", areaDomain=" + areaDomain +
        ", isopen=" + isopen +
        "}";
    }
}
