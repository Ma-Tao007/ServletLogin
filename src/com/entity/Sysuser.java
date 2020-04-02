package com.entity;

//用户
public class Sysuser {
    private Integer id;
    private String persname;//真实姓名
    private String username;
    private String password;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPersname() {
        return persname;
    }
    public void setPersname(String persname) {
        this.persname = persname;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Sysuser [id=" + id + ", persname=" + persname + ", username=" + username + ", password=" + password
                + "]";
    }
}
