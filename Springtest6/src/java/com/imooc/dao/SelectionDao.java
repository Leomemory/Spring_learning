package com.imooc.dao;

import com.imooc.entity.Selection;

import java.util.List;
import java.util.Map;

public interface SelectionDao {
    public void insert(List<Selection> seles);

    public void delete(int cit,int sid);

    List<Map<String,Object>> selectByStudent(int sid);

    List<Map<String,Object>> selectByCourse(int cid);
}
