package fr.wcs.wildemo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.wcs.wildemo.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
