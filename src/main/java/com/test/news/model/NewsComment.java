package com.test.news.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author zengliming
 * @date 2018/3/20 17:42
 */
@Data
@Entity
public class NewsComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;//id
    private Integer newsId; //新闻
    private String content;//内容
    private Boolean isShow;//是否显示
    private Integer userId;//用户id
    private Integer toUserId;//回复的用户Id
}
