package com.articles;

import java.util.Date;
import junit.framework.TestCase;
import org.testng.annotations.Test;
import com.articles.model.Article;

public class ArticleTest extends TestCase {

	@Test
	public void testArticleWriteRead() {
		Article article = new Article(0, "TEST1", "BODY1", new Date());
		assert "TEST1".equals(article.getTitle());
		assert "BODY1".equals(article.getBody());
		assert article.getCreated() != null;
   }
   
}
