package com.sarwath.springbootlesson.controller;

import com.sarwath.springbootlesson.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {
    @Autowired
private MockMvc mockMvc;
    private departmentService departmentService;
    private Department department;

    @BeforeEach
    void setUp() {
        department = Department.builder()
                .departmentAddress("VA")
                .departmentCode("IT5")
                .departmentName("IT")
                .departmentId(1L)
                .build();
    }

    @Test
    void saveDepartment() {
       Department  inputDepartment = Department.builder()
                .departmentAddress("VA")
                .departmentCode("IT5")
                .departmentName("IT")
                .departmentId(1L)
                .build();
        Mockito.when(departmentService.saveDepartment(inputDepartment))
                .thenReturn(department);
       mockMvc.perform(MockMvcRequestBuilders.post("")
               .contentType(MediaType.APPLICATION_JSON)
               .content(""))
    }

    @Test
    void fetchDepartmentById() {
    }
}