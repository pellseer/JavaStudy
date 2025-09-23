package com.example.study2.controller;

import com.example.study2.controller.dto.PersonDto;
import com.example.study2.domain.Person;
import com.example.study2.exception.PersonNotFoundException;
import com.example.study2.exception.RenameNotPermittedException;
import com.example.study2.exception.dto.ErrorResponse;
import com.example.study2.repository.PersonRepository;
import com.example.study2.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * author : smseo
 * date : 2025-09-22
 * description :
 * ============================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-09-22 smseo 최초 생성
 */
@RequestMapping(value = "/api/person")
@RestController
@Slf4j
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("{id}")
    public Person getPerson(@PathVariable Long id){
        return personService.getPerson(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void postPerson(@RequestBody PersonDto personDto){
        personService.put(personDto);
    }

    @PutMapping("{id}")
    public void modifyPerson(@PathVariable Long id, @RequestBody PersonDto person){
        personService.modify(id, person);
    }

    @PatchMapping("{id}")
    public void modifyPerson(@PathVariable Long id, String name){
        personService.modify(id, name);
    }

    @DeleteMapping("{id}")
    public void deletePerson(@PathVariable Long id){
        personService.delete(id);
    }
}
