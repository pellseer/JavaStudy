package com.example.study2.controller;

import com.example.study2.controller.dto.GroupDto;
import com.example.study2.domain.Group;
import com.example.study2.repository.GroupRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * author : smseo
 * date : 2025-09-30
 * description :
 * ============================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-09-30 smseo 최초 생성
 */
@SpringBootTest
@Transactional
@Slf4j
class GroupControllerTest {
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @BeforeEach
    void beforeEach(){
        mockMvc = MockMvcBuilders
                .webAppContextSetup(wac)
                .alwaysDo(print())
                .build();
    }

    @Test
    public void getAll() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/api/group"))
                .andExpect(status().isOk());
    }

    @Test
    public void getGroup() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/api/group/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.description").value("friends"))
                .andExpect(jsonPath("$.personList.[0].id").value("2"))
                .andExpect(jsonPath("$.personList.[0].name").value("david"));
    }

    @Test
    public void postGroup() throws Exception {
        GroupDto dto = GroupDto.of("tennis");

        mockMvc.perform(
                MockMvcRequestBuilders.post("/api/group")
                        .contentType(MediaType.APPLICATION_JSON)
                        .characterEncoding("utf-8")
                        .content(toJsonString(dto)))
                .andExpect(status().isCreated());
    }

    @Test
    public void modifyGroup() throws Exception {
        Group dto = new Group(2L,"golf",null);

        mockMvc.perform(
                MockMvcRequestBuilders.put("/api/group/2")
                        .contentType(MediaType.APPLICATION_JSON)
                        .characterEncoding("utf-8")
                        .content(toJsonString(dto)))
                .andExpect(status().isOk());;

        Group result = groupRepository.findById(2L).get();

        assertThat(result.getId()).isEqualTo(2L);
        assertThat(result.getDescription()).isEqualTo("golf");
    }

    @Test
    @Transactional
    public void deleteGroup() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.delete("/api/group/2"))
                .andExpect(status().isOk());

        assertThat(groupRepository.findById(2L)).isEmpty();
    }

    private String toJsonString(GroupDto groupDto) throws JsonProcessingException {
        return objectMapper.writeValueAsString(groupDto);
    }

    private String toJsonString(Group group) throws JsonProcessingException {
        return objectMapper.writeValueAsString(group);
    }
}