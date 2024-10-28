package com.example.exam_studentinfo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.StudentModels;

@Repository
public interface StudentRepository extends CrudRepository<StudentModels ,Integer> {

}
