package com.jay.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jay.xiang
 * @since 2018-09-17
 */
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    @TableField("userName")
    private String userName;
    /**
     * 密码
     */
    @TableField("passWord")
    private String passWord;
    @TableField("user_sex")
    private String userSex;
    @TableField("nick_name")
    private String nickName;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "users{" +
        ", userName=" + userName +
        ", passWord=" + passWord +
        ", userSex=" + userSex +
        ", nickName=" + nickName +
        "}";
    }
}
