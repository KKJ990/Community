package com.example.Community.PostRepository;
//package PostRepository;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class PostPrimarykey implements Serializable {
	
	
	@Id
	private String postuserid;
	@Id
	private Long titleid;
	
	
	
	public String getPostuserid() {
		return postuserid;
	}
	public void setPostuserid(String postuserid) {
		this.postuserid = postuserid;
	}
	public long getTitleid() {
		return titleid;
	}
	public void setTitleid(long titleid) {
		this.titleid = titleid;
	}
	
	

	
	
	
}
