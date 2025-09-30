package com.example.study2.controller;

import com.example.study2.domain.Group;
import com.example.study2.domain.Person;
import com.example.study2.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author : smseo
 * date : 2025-09-30
 * description :
 * ============================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-09-30 smseo 최초 생성
 */
@RestController
@RequestMapping("/api/group")
@Slf4j
public class GroupController {
    @Autowired
    private GroupService groupService;

    @GetMapping
    public List<Group> getAll(){
        return groupService.getAll();
    }

    @GetMapping("{id}")
    public Group getGroup(@PathVariable Long id){
        return groupService.getGroup(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void postGroup(@RequestBody Group group){
        groupService.put(group);
    }

    @PutMapping("{id}")
    public void modifyGroup(@PathVariable Long id, @RequestBody Group group){
        groupService.modify(id, group);
    }

    @DeleteMapping("{id}")
    public void deleteGroup(@PathVariable Long id){
        groupService.delete(id);
    }
}
