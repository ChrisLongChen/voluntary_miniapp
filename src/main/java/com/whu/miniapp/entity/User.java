package com.whu.miniapp.entity;

import javax.persistence.*;

/**
 * Author: 胡龙晨
 * Date: 2021-01-02
 */

@Entity
@Table(name = "user")
public class User {
    @Id//主键注解
    @GeneratedValue(strategy=GenerationType.IDENTITY)//主键自增
    @Column(name = "user_id")//对应表中的列
    private Integer user_id;
    @Column(name = "user_name")
    private String user_name; //用户名
    @Column(name = "user_passcode")
    private String user_passcode;//密码
    @Column(name = "user_gender")
    private String user_gender;//性别
    @Column(name = "user_age")
    private Integer user_age;//年龄
    @Column(name = "user_career")
    private String user_career;//职业
    @Column(name = "user_phone")
    private String user_phone;//电话
    @Column(name = "user_addr")
    private String user_addr;//地址
    @Column(name = "wechat_id")
    private String wechat_id;//微信号
    @Column(name = "wechat_pic")
    private String wechat_pic;//微信头像
    @Column(name = "user_status")
    private Integer user_status;//用户状态
    @Column(name = "ban_time")
    private Integer ban_time;//禁用时长
    @Column(name = "ban_unit")
    private String ban_unit;//禁用单位
    @Column(name = "user_type")
    private Integer user_type;//用户类别
    @Column(name = "team_phone")
    private String team_phone;//机构联系方式
    @Column(name = "team_addr")
    private String team_addr;//机构地址
    @Column(name = "team_name")
    private String team_name;//社团/机构/组织名称
    @Column(name = "team_picture")
    private String team_picture;//证明文件图片
    @Column(name = "team_info")
    private String team_info;//认证说明
    @Column(name = "team_status")
    private Integer team_status;//是否认证
    @Column(name = "login_time")
    private String login_time;//登陆时间

    public Integer getUser_id(){
        return user_id;
    }

    public void setUser_id(Integer user_id){
        this.user_id = user_id;
    }

    public String getUser_name(){
        return user_name;
    }

    public void setUser_name(String user_name){
        this.user_name = user_name;
    }

    public String getUser_passcode(){
        return user_passcode;
    }

    public void setUser_passcode(String user_passcode){
        this.user_passcode = user_passcode;
    }

    public String getUser_gender(){
        return user_gender;
    }

    public void setUser_gender(String user_gender){
        this.user_gender = user_gender;
    }

    public Integer getUser_age(){
        return user_age;
    }

    public void setUser_age(Integer user_age){
        this.user_age = user_age;
    }

    public String getUser_career(){
        return user_career;
    }

    public void setUser_career(String user_career){
        this.user_career = user_career;
    }

    public String getUser_phone(){
        return user_phone;
    }

    public void setUser_phone(String user_phone){
        this.user_phone = user_phone;
    }

    public String getUser_addr(){
        return user_addr;
    }

    public void setUser_addr(String user_addr){
        this.user_addr = user_addr;
    }

    public String getWechat_id(){
        return wechat_id;
    }

    public void setWechat_id(String wechat_id){
        this.wechat_id = wechat_id;
    }

    public String getWechat_pic(){
        return wechat_pic;
    }

    public void setWechat_pic(String wechat_pic){
        this.wechat_pic = wechat_pic;
    }

    public Integer getUser_status(){
        return user_status;
    }

    public void setUser_status(Integer user_status){
        this.user_status = user_status;
    }

    public Integer getBan_time(){
        return ban_time;
    }

    public void setBan_time(Integer ban_time){
        this.ban_time = ban_time;
    }

    public String getBan_unit(){
        return ban_unit;
    }

    public void setBan_unit(String ban_unit){
        this.ban_unit = ban_unit;
    }

    public Integer getUser_type(){
        return user_type;
    }

    public void setUser_type(Integer user_type){
        this.user_type = user_type;
    }

    public String getTeam_phone(){
        return team_phone;
    }

    public void setTeam_phone(String team_phone){
        this.team_phone = team_phone;
    }

    public String getTeam_addr(){
        return team_addr;
    }

    public void setTeam_addr(String team_addr){
        this.team_addr = team_addr;
    }

    public String getTeam_name(){
        return team_name;
    }

    public void setTeam_name(String team_name){
        this.team_name = team_name;
    }

    public String getTeam_picture(){
        return team_picture;
    }

    public void setTeam_picture(String team_picture){
        this.team_picture = team_picture;
    }

    public String getTeam_info(){
        return team_info;
    }

    public void setTeam_info(String team_info){
        this.team_info = team_info;
    }

    public Integer getTeam_status(){
        return team_status;
    }

    public void setTeam_status(Integer team_status){
        this.team_status = team_status;
    }

    public String getLogin_time(){
        return login_time;
    }

    public void setLogin_time(String login_time){
        this.login_time = login_time;
    }
}
