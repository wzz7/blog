package com.wz.controller;

import com.wz.service.TagService;
import com.wz.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：wzh744
 * @date ：Created in 2022/2/22 16:37
 * @description：
 */
@RestController
@RequestMapping("tags")
public class TagsController {

    @Autowired
    private TagService tagService;

    @RequestMapping("hot")
    public Result hot() {
        int limit = 6;
        return tagService.hots(6);
    }
}
