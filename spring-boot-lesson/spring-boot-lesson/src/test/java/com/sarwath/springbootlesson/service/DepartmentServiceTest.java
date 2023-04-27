package com.sarwath.springbootlesson.service;

import com.sarwath.springbootlesson.entity.Department;
import com.sarwath.springbootlesson.repository.DepartmentRespository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceTest {
    private DepartmentService departmentService;
    @MockBean
    private DepartmentRespository departmentRespository;
    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("IT")
                        .departmentAddress("VA")
                        .departmentCode("IT5")
                        .departmentId(1L)
                        .build();
        Mockito.when(departmentRespository.findByDepartmentNameIgnoreCase("IT"))
                .thenReturn(department);
    }
    @Test
    @DisplayName("Get Data based on Valid Department Name")
    public void whenValidDepartmentName_thenDepartmentshouldBeFound(){
        String departmentName = "IT";
        Department found
                = departmentService.fetchDepartmentByName(departmentName);
        assertEquals(departmentName, found.getDepartmentName());
    }
}