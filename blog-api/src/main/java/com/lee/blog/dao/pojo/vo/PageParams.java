package com.lee.blog.dao.pojo.vo;

import lombok.Data;

/**
 * Created by Lee Yian on 2023/4/4 17:17
 * pagination VO
 */
@Data
public class PageParams {
    // which page
    private int page = 1;

    // how many records
    private int pageSize = 10;
}