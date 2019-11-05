package com.imooc.impl;

import com.imooc.dao.SelectionDao;
import com.imooc.entity.Selection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class SelectionDaoImpl implements SelectionDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(List<Selection> seles) {
        String sql = "insert into selection value(?,?,?,?)";
        List<Object[]> list = new ArrayList<Object[]>();
        for(Selection sel:seles){
            Object[] args = new Object[4];
            args[0] = sel.getCid();
            args[1] = sel.getSid();
            args[2] = sel.getSelTime();
            args[3] = sel.getScore();
            list.add(args);
        }
        jdbcTemplate.batchUpdate(sql,list);
    }

    public void delete(int cid, int sid) {
        String sql = "delete from selection where student=? and course=?";
        jdbcTemplate.update(sql,cid,sid);
    }

    public List<Map<String, Object>> selectByStudent(int sid) {
        String sql = "select se.*, stu.name sname, cou.name cname from selection se\" +\n" +
                "                \"left join student stu on se.student=stu.id\" +\n" +
                "                \"left join course cou on se.course=con.id\" +\n" +
                "                \"where student=?";
        return jdbcTemplate.queryForList(sql,sid);
    }

    public List<Map<String, Object>> selectByCourse(int cid) {
        String sql = "select se.*, stu.name sname, cou.name cname from selection se\" +\n" +
                "                \"left join student stu on se.student=stu.id\" +\n" +
                "                \"left join course cou on se.course=con.id\" +\n" +
                "                \"where course=?";
        return jdbcTemplate.queryForList(sql,cid);
    }
}
