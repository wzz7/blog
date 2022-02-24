package com.wz.service;

import com.wz.vo.Result;
import com.wz.vo.TagVo;

import java.util.List;

/**
 * @author ：wzh744
 * @date ：Created in 2022/2/22 11:21
 * @description：
 */
public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);
}
