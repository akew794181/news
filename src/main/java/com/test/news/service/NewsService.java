package com.test.news.service;

import com.test.news.dao.NewsRepository;
import com.test.news.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zengliming
 * @date 2018/3/22 17:06
 */
@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<News> findAll(){
        Sort sort = new Sort(Sort.Direction.DESC, "date");
        return newsRepository.findAll(sort);
    }

    public void delete(Integer id){
        newsRepository.delete(id);
    }


    public void save(News news){
        newsRepository.save(news);
    }

    public News getOne(Integer id){
        return newsRepository.findOne(id);
    }

}
