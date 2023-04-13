package com.example.demo.controller;

import com.example.demo.entity.Announcement;
import com.example.demo.mapper.AnnouncementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * a happy start
 * </p>
 *
 * @author thg
 * @version 0.0.1
 * @since 2023/4/13  23:13
 */
@RestController
@RequestMapping("/announcement")
public class AnnouncementController {

    @Autowired
    private AnnouncementMapper announcementMapper;


    @GetMapping
    public List<Announcement> getAnnouncement(){
        return announcementMapper.selectList(null);
    }
}
