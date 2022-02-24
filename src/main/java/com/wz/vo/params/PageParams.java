package com.wz.vo.params;

import lombok.Data;

/**
 * @author ：wzh744
 * @date ：Created in 2022/2/22 09:24
 * @description：
 */
@Data
public class PageParams {

    private int page = 1;

    private int pageSize = 10;
}
