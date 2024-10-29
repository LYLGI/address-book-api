package com.pika.demoapi.demos.web.entity;

import com.baomidou.mybatisplus.annotation.TableId;

import java.sql.Timestamp;

/**
 * 联系人实体类
 */
public class Contact {

    // 主键，自增ID
    @TableId
    private int id;

    // 联系人姓名
    private String name;

    // 联系人电话
    private String phone;

    // 联系人地址
    private String address;

    // 联系人电子邮件
    private String email;

    // 记录创建时间
    private Timestamp createdAt;

    // 记录最后更新时间
    private Timestamp updatedAt;

    // 构造方法
    public Contact() {}

    public Contact(int id, String name, String phone, String address, String email, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getter 和 Setter 方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}

