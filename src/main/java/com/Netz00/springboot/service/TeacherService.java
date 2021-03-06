package com.Netz00.springboot.service;

import com.Netz00.springboot.repository.TeacherRepository;
import com.Netz00.springboot.domain.Teacher;
import com.Netz00.springboot.repository.DTOprojection.TeacherMin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;


    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<TeacherMin> getTeachers() {
        return teacherRepository.getAll();
    }

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }


}
