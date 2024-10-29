package com.pika.demoapi.demos.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pika.demoapi.demos.web.entity.Contact;
import org.apache.ibatis.annotations.Mapper;

/**
 * 联系人 Mapper 接口
 */
@Mapper
public interface ContactMapper extends BaseMapper<Contact> {
}

