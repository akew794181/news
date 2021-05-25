package com.test.news.model;

import lombok.Data;

/**
 * @author zengliming
 * @date 2018/3/20 17:42
 */
@Data
public class NewsComment {
    private Integer id;//id
    private Integer newsId; //新闻
    private String content;//内容
    private Boolean isShow;//是否显示
    private Integer userId;//用户id
    private Integer toUserId;//回复的用户Id
}
