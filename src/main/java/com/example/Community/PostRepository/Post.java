package com.example.Community.PostRepository;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;




@Entity
@IdClass(PostPrimarykey.class)
public class Post{
	
	
	@Id
	@Column(name="TITLEID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long titleid;
	
	@Id
	@Column(name="POSTUSERID")
	private String postuserid;
	

	
	
	@Column(name="TITLE")
	private String title;
	@Column(name="CONTENT")
	private String content;
	
	
	
	
	
	public String getPostuserid() {
		return postuserid;
	}
	public void setPostuserid(String postuserid) {
		this.postuserid = postuserid;
	}
	public Long getTitleid() {
		return titleid;
	}
	public void setTitleid(Long titleid) {
		this.titleid = titleid;
	}

	
	
	

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	 
	

}
