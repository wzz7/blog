package com.wz.service;

import com.wz.vo.Result;
import com.wz.vo.params.PageParams;

/**
 * @author ：wzh744
 * @date ：Created in 2022/2/22 09:36
 * @description：
 */
public interface ArticleService {
    /**
     * 分页查询文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);
}
