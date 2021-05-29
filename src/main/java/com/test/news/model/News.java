package com.test.news.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author zengliming
 * @date 2018/3/20 17:36
 */
@Data
@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;//id
    private String title;//标题
    private String content;//内容
    private String date;//时间
    private Integer num;//评论数量
    private Integer typeId;//大类型ID
    private String author;//作者
    private Boolean isTop;//是否置顶

}
