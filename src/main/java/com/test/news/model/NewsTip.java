package com.test.news.model;

import lombok.Data;

/**
 * @author zengliming
 * @date 2018/3/20 17:36
 */
@Data
public class NewsTip {
    private Integer id;//id
    private String newsId;//newsid
    private String tip;//分词
}
