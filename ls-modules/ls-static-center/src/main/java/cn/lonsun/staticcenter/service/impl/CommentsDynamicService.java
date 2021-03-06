/*
 * CommentsDynamicService.java         2016年1月13日 <br/>
 *
 * Copyright (c) 1994-1999 AnHui LonSun, Inc. <br/>
 * All rights reserved.	<br/>
 *
 * This software is the confidential and proprietary information of AnHui	<br/>
 * LonSun, Inc. ("Confidential Information").  You shall not	<br/>
 * disclose such Confidential Information and shall use it only in	<br/>
 * accordance with the terms of the license agreement you entered into	<br/>
 * with Sun. <br/>
 */

package cn.lonsun.staticcenter.service.impl;

import org.springframework.stereotype.Service;

import cn.lonsun.staticcenter.generate.thread.Context;
import cn.lonsun.staticcenter.service.DynamicService;

/**
 * 评论 <br/>
 *
 * @date 2016年1月13日 <br/>
 * @author fangtinghua <br/>
 * @version v1.0 <br/>
 */
@Service
public class CommentsDynamicService implements DynamicService {

    @Override
    public String queryHtml(String action, Long id, Context context) {
        return null;
    }
}