package com.pika.demoapi.demos.web.controller;

import com.pika.demoapi.demos.web.entity.Contact;
import com.pika.demoapi.demos.web.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 联系人控制器
 */
@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.list();
    }

    @PostMapping
    public boolean addContact(@RequestBody Contact contact) {
        return contactService.save(contact);
    }

    @PutMapping("/{id}")
    public boolean updateContact(@PathVariable int id, @RequestBody Contact contact) {
        contact.setId(id);
        return contactService.updateById(contact);
    }

    @DeleteMapping("/{id}")
    public boolean deleteContact(@PathVariable int id) {
        return contactService.removeById(id);
    }

    @GetMapping("/{id}")
    public Contact getContactById(@PathVariable int id) {
        return contactService.getById(id);
    }

}
