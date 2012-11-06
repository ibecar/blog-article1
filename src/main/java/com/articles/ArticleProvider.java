package com.articles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.articles.model.Article;

@ApplicationScoped
@ManagedBean(name = "provider")
public class ArticleProvider {
	
	private List<Article> articles;
	
	@PostConstruct
	private void initialize(){
		int i = 0;
		articles.add(new Article(i++, "JavaServer Faces Technology","Developed through the Java Community Process under JSR - 314, JavaServer Faces technology establishes the standard for building server-side user interfaces. With the contributions of the expert group, the JavaServer Faces APIs are being designed so that they can be leveraged by tools that will make web application development even easier. Several respected tools vendors were members of the JSR-314 expert group, which developed the JavaServer Faces 1.0 specification. These vendors are committed to supporting the JavaServer Faces technology in their tools, thus promoting the adoption of the JavaServer Faces technology standard.",new Date()));
		articles.add(new Article(i++, "Training","Developing Web Applications using JSF Technologies: This three-day course covers an in-depth look at JSF 2.0 technology, including templating, Ajax, validation, conversion, working with data sources, composite components, and much more. With this course you will gain the skills necessary to build rich web-based applications with the JavaServer Faces framework.",new Date()));
		articles.add(new Article(i++, "Community","Forum : Drop in to the webtier forum (webtier@glassfish.java.net) to discuss JavaServerFaces technology. To subscribe to the mailing list please visit - https://glassfish.java.net/servlets/ProjectMailingListList and scroll down and click on subscribe. Post to the forum here.",new Date()));
		articles.add(new Article(i++, "Join us in the chat room","at irc.freenode.net Converse with members of the team working on JavaServer Faces technology by joining our public chat, reachable with any IRC client. Join us in the ##jsf chat room at irc.freenode.net",new Date()));
		articles.add(new Article(i++, "The Java Enterprise Community","on java.net The Java Enterprise Community is a gathering place for developers working with Java EE technologies.",new Date()));
		articles.add(new Article(i++, "Java EE at a Glance","Java Platform, Enterprise Edition (Java EE) 6 is the industry standard for enterprise Java computing. Utilize the new, lightweight Java EE 6 Web Profile to create next-generation web applications, and the full power of the Java EE 6 platform for enterprise applications. Developers will benefit from productivity improvements with more annotations, more POJOs, simplified packaging, and less XML configuration. ",new Date()));
		articles.add(new Article(i++, "What's New","GlassFish Server 3.1.2.2 delivers important bug fixes that impacts GlassFish developers.",new Date()));
		articles.add(new Article(i++, "Spotlight","Quickly understand the new features in GlassFish Server.  Topics include clustering, administration console, security, and more.",new Date()));
		articles.add(new Article(i++, "Support","Oracle GlassFish Server is the first commercial Java EE 6 product available.  Experience the value of Oracle Premier support with access to experienced support representatives, patches, product updates, and more.",new Date()));
	}
	
	public ArticleProvider(){
		articles = new ArrayList<Article>();
		initialize();
	}
	
	public List<Article> getArticles(){
		return articles;
	}
	
	public List<Article> getArticlesContainingText(String text){
		List<Article> filtered = new ArrayList<Article>();
		for(Article article: getArticles()){
			if(article.getTitle().contains(text) || article.getBody().contains(text)){
				filtered.add(article);
			}
		}
		return filtered.isEmpty() ? Collections.EMPTY_LIST : filtered;
	}
}
