package com.xxm.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-13 22:06:06 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//主键id
    @Column
    private String username;//用户名
    @Column
    private String password;//密码
    @Column
    private String name;//姓名
    @Column
    private Integer age;//年龄
    @Column
    private Integer sex;//性别
    @Column// 1男性，2女性
    private Date birthday; //出生日期
    @Column
    private Date created; //创建时间
    @Column
    private Date updated; //更新时间
    @Column
    private String note;//备注

    public User() {
    }

    public User(Integer id, String username, String password, String name, Integer age, Integer sex, Date birthday, Date created, Date updated, String note) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
        this.created = created;
        this.updated = updated;
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
