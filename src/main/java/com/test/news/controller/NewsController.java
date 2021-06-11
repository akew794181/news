package com.test.news.controller;

import com.test.news.model.News;
import com.test.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zengliming
 * @date 2018/3/22 17:12
 */
@Controller
@RequestMapping("news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @RequestMapping("list.htm")
    public String newsList(Model model)throws Exception{
        List<News> news = newsService.findAll();
        model.addAttribute("newsList",news);
        return "news/list";
    }

    @RequestMapping("savePage.htm")
    public String savePage(Model model,Integer id)throws Exception{
        model.addAttribute("id",id);
        model.addAttribute("news",newsService.getOne(id));
        return "news/save";
    }


    @RequestMapping("savePage.htm")
    public String save(Model model,News news)throws Exception{
        newsService.save(news);
        return newsList(model);
    }


    @RequestMapping("delete.htm")
    public String save(Model model,Integer id)throws Exception{
        newsService.delete(id);
        return newsList(model);
    }


    @RequestMapping("info.htm")
    public String info(Model model,Integer id)throws Exception{
        model.addAttribute("news",newsService.getOne(id));
        return "news/info";
    }


}
