package com.test.news.dao;

import com.test.news.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zengliming
 * @date 2018/3/22 17:02
 */
@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {


}
