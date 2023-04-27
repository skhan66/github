package com.sarwath.springbootlesson.repository;

import com.sarwath.springbootlesson.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRespositoryTest {
    @Autowired
    private DepartmentRespositoryTest departmentRespository;
    @Autowired
    private TestEntityManager entityManager;
    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("Mechanical Engineering")
                        .departmentCode("ME04")
                        .departmentAddress("GA")
                        .build();
        entityManager.persist(department);
    }
    @Test
    public void whenFindById_thenReturnDepartment(){
        Department department = departmentRespository.findById(1L).get();
        assertEquals(department.getDepartmentName(), "Mechanical Engineering");
    }
}