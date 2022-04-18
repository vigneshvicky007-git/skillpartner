package com.flexcub.resourseplanning.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="SkillPartner")
@Entity
public class SkillPartner {

//    @Id
//    @Column(name = "id", nullable = false)
//    private Long id;
    @Id
    @Column(name = "id", nullable = false)
    private int skillPartnerId;

    @Column(name = "businessName",nullable = false)
    private String businessName;

    @Column(name = "address",nullable = false)
    private String address;

    @Column(name = "phone",nullable = false,columnDefinition = "text")
    private String phone;

    @Column(name = "email",nullable = false,columnDefinition = "text")
    private String email;

    @Column(name = "taxIdBusinessLicense",nullable = false)
    private int taxIdBusinessLicense;

    @Column(name = "primaryContactFullName",nullable = false)
    private String primaryContactFullName;

    @Column(name = "primaryContactEmail",nullable = false,columnDefinition = "text")
    private String primaryContactEmail;

    @Column(name = "primaryContactPhone",nullable = false,columnDefinition = "text")
    private String primaryContactPhone;

    @Column(name = "secondaryContactFullName")
    private String secondaryContactFullName;

    @Column(name = "secondaryContactEmail",columnDefinition = "text")
    private String secondaryContactEmail;

    @Column(name = "secondaryContactPhone",columnDefinition = "text")
    private String secondaryContactPhone;


}
