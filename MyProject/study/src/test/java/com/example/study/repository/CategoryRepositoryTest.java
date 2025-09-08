package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Category;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.time.LocalDateTime;
import java.util.Optional;

public class CategoryRepositoryTest extends StudyApplicationTests {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void create(){
        String type = "Computer";
        String title = "컴퓨터";
        LocalDateTime createdAt = LocalDateTime.now();
        String createBy = "AdminServer";

        Category category = new Category();
        category.setType(type);
        category.setTitle(title);
        category.setCreatedAt(createdAt);
        category.setCreatedBy(createBy);

        Category newCategory = categoryRepository.save(category);
        Assert.notNull(newCategory,"newCategory be null");
    }

    @Test
    public void read(){
        String type = "Computer";
        Optional<Category> optionalCategory = categoryRepository.findByType(type);

        optionalCategory.ifPresent(c->{
            System.out.println(c.getId());
            System.out.println(c.getType());
            System.out.println(c.getTitle());
        });

    }
}
