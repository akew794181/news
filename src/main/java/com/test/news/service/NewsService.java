package com.test.news.service;

import com.test.news.dao.NewsRepository;
import com.test.news.dao.NewsTipRepository;
import com.test.news.model.News;
import com.test.news.model.NewsTip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zengliming
 * @date 2018/3/22 17:06
 */
@Service
@Transactional
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private NewsTipRepository newsTipRepository;

    public List<News> findAll(){
        Sort sort = new Sort(Sort.Direction.DESC, "date");
        return newsRepository.findAll(sort);
    }


    public void delete(Integer id){
        newsRepository.delete(id);
    }


    public void save(News news,String []tips){
        news = newsRepository.save(news);
        if(tips!=null){
            for (String tip : tips) {
                NewsTip newsTip = new NewsTip();
                newsTip.setNewsId(news.getId());
                newsTip.setTip(tip);
                newsTipRepository.save(newsTip);
            }
        }
    }

    public News getOne(Integer id){
        News news =  newsRepository.findOne(id);
        return news;
    }

}
