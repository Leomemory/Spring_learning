package com.imooc.dao;

import com.imooc.entity.Student;

import java.util.List;

public interface StudentDao {
    public void insert(Student student);

    public void update(Student student);

    public void delete(int id);

    Student select(int id);

    List<Student> selectAll();
}
