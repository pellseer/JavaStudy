package com.example.study2.repository;

import com.example.study2.domain.Person;
import com.example.study2.domain.dto.Birthday;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * author : smseo
 * date : 2025-09-17
 * description :
 * ============================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-09-17 smseo 최초 생성
 */
@SpringBootTest
class PersonRepositoryTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void findByName(){
        List<Person> people = personRepository.findByName("tony");
        assertThat(people.size()).isEqualTo(1);

        Person person = people.get(0);

        assertAll(
            () -> assertThat(person.getName()).isEqualTo("tony"),
            () -> assertThat(person.getHobby()).isEqualTo("reading"),
            () -> assertThat(person.getAddress()).isEqualTo("서울"),
            () -> assertThat(person.getBirthday()).isEqualTo(Birthday.of(LocalDate.of(1991,7,10))),
            () -> assertThat(person.getJob()).isEqualTo("officer"),
            () -> assertThat(person.getPhoneNumber()).isEqualTo("010-1111-1112"),
            () -> assertThat(person.isDeleted()).isEqualTo(false)
        );
    }

    @Test
    public void findByNameIfDeleted(){
        List<Person> people = personRepository.findByName("andrew");
        assertThat(people.size()).isEqualTo(0);
    }

    @Test
    public void findByMonthOfBirthday(){
        List<Person> people = personRepository.findByMonthOfBirthday(7);
        assertThat(people.size()).isEqualTo(2);
        assertAll(
            () -> assertThat(people.get(0).getName()).isEqualTo("david"),
            () -> assertThat(people.get(1).getName()).isEqualTo("tony")
        );
    }

    @Test
    public void findPeopleDeleted(){
        List<Person> people = personRepository.findPeopleDeleted();

        assertThat(people.size()).isEqualTo(1);
        assertThat(people.get(0).getName()).isEqualTo("andrew");
    }
}