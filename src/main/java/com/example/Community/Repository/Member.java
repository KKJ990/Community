package com.example.Community.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="MEMBER")
public class Member {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long memberid;
	
	
	
	@Column(name="USERID")
	private String userid;
	@Column(name="NAME")
	private String name;
	@Column(name="PHONE")
	private String phone;
	@Column(name="PW")
	private String pw;

   
    public long getMemberid() {
		return memberid;
	}

	public void setMemberid(long memberid) {
		this.memberid = memberid;
	}
	
	
	
    public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
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
 


    
}
