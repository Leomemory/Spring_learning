package com.imooc.dao;

import com.imooc.entity.Course;

import java.util.List;

public interface CourseDao {
    public void insert(Course course);

    public void update(Course course);

    public void delete(int id);

    Course select(int id);

    List<Course> selectAll();
}
