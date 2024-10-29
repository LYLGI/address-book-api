package com.pika.demoapi.demos.web.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pika.demoapi.demos.web.entity.Contact;
import com.pika.demoapi.demos.web.mapper.ContactMapper;
import org.springframework.stereotype.Service;

/**
 * 联系人服务实现类
 */
@Service
public class ContactServiceImpl extends ServiceImpl<ContactMapper, Contact> implements ContactService {
}
