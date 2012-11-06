package com.articles.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.articles.ArticleProvider;

@ManagedBean
public class Article implements Serializable{
	
	private static final long serialVersionUID = -854917885680741774L;

	private Integer id;
	
	private String title;
	
	private String body;
	
	private Date created;
	
	public Article(){}
	
	public Article(Integer id, String title, String body, Date created) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.created = created;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Article [title=" + title + ", body=" + body
				+ ", created=" + created + "]";
	}
	
}
