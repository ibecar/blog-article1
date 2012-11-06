package com.articles;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.CloseEvent;

import com.articles.model.Article;

@ViewScoped
@ManagedBean
public class ArticleHome implements Serializable{
	
	private static final long serialVersionUID = -3758905083799188203L;

	private Article selected1;
	private Article selected2;
	private String searchCriteria1;
	private String searchCriteria2;

	private ArticleProvider articleProvider;
	private List<Article> filteredList1 = Collections.EMPTY_LIST;
	private List<Article> filteredList2 = Collections.EMPTY_LIST;
	
	@PostConstruct
	public void initialize(){
		this.selected1 = new Article();
		this.selected2 = new Article();
		this.articleProvider = new ArticleProvider();
	}

	public Article getSelected1() {
		return selected1;
	}

	public void setSelected1(Article selected1) {
		this.selected1 = selected1;
	}

	public Article getSelected2(){
		return selected2;
	}
	
	public String getSearchCriteria1() {
		return searchCriteria1;
	}

	public void setSearchCriteria1(String searchCriteria1) {
		this.searchCriteria1 = searchCriteria1;
	}

	public String getSearchCriteria2() {
		return searchCriteria2;
	}

	public void setSearchCriteria2(String searchCriteria2) {
		this.searchCriteria2 = searchCriteria2;
	}

	public List<Article> getFilteredList1() {
		return filteredList1;
	}
	
	public List<Article> getFilteredList2() {
		return filteredList2;
	}
	
	public ArticleHome(){
	}
	
	public void selectArticle1() {
		filteredList1 = articleProvider.getArticlesContainingText(searchCriteria1);
	}
	
	public void selectArticle2() {
		filteredList2 = articleProvider.getArticlesContainingText(searchCriteria2);
	}
	
	public void closeListener1(CloseEvent event) {
		filteredList1 = Collections.EMPTY_LIST;
		searchCriteria1 = "";
	}
	 
	public void closeListener2(CloseEvent event) {
		filteredList2 = Collections.EMPTY_LIST;
		searchCriteria2 = "";
	}
}
