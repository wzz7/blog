package com.wz.vo;

import lombok.Data;

import java.util.List;

/**
 * @author ：wzh744
 * @date ：Created in 2022/2/22 09:50
 * @description：
 */
@Data
public class ArticleVo {

    private Long id;

    private String title;

    private String summary;

    private int commentCounts;

    private int viewCounts;

    private int weight;
    /**
     * 创建时间
     */
    private String createDate;

    private String author;

//    private ArticleBodyVo body;

    private List<TagVo> tags;

//    private List<CategoryVo> categorys;

}
