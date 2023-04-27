package com.sarwath.springbootlesson.service;

import com.sarwath.springbootlesson.entity.Department;
import com.sarwath.springbootlesson.error.DepartmentNotFoundException;
import com.sarwath.springbootlesson.repository.DepartmentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpL implements DepartmentService {
    @Autowired
    private DepartmentRespository departmentRespository;
    @Override
    public Department saveDepartment(Department department) {

        return departmentRespository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRespository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        Optional<Department> department =
                departmentRespository.findById(departmentId);
        if(!department.isPresent()){
            throw new DepartmentNotFoundException("Department Not Available");
        }
        return department.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRespository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department depDB = departmentRespository.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentName())&&
        !"".equalsIgnoreCase(department.getDepartmentName())){
            depDB.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode())&&
                !"".equalsIgnoreCase(department.getDepartmentCode())) {
            depDB.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull(department.getDepartmentAddress())&&
                !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }
        return  departmentRespository.save(depDB);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRespository.findByDepartmentName(departmentName);
    }
}
