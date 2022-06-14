package com.esprit.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esprit.article.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{
	
}
