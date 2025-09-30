package com.example.study2.service;

import com.example.study2.domain.Group;
import com.example.study2.repository.GroupRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
@Slf4j
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    @Transactional
    public List<Group> getAll(){
        return groupRepository.findAll();
    }

    @Transactional
    public Group getGroup(Long id){
        return groupRepository.findById(id).orElseGet(null);
    }

    @Transactional
    public void put(Group group){
        groupRepository.save(group);
    }

    @Transactional
    public void modify(Long id, Group group){
        Group modifyGroup = groupRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Group not found"));

        if(!modifyGroup.getId().equals(group.getId())){
            throw new RuntimeException();
        }

        modifyGroup.setDescription(group.getDescription());
        groupRepository.save(modifyGroup);
    }

    @Transactional
    public void delete(Long id){
        Group deleteGroup = groupRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Group not found"));

        groupRepository.delete(deleteGroup);
    }
}
