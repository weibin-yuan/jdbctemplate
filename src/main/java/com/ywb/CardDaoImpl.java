package com.ywb;

import com.ywb.dao.CardDao;
import com.ywb.entity.User;
import com.ywb.mapper.CardMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CardDaoImpl implements CardDao {
//    把JdbcTemplate交给spring管理
    private JdbcTemplate jt;
//    JdbcTemplate的注入方法，不然不能依赖注入
    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    @Override
    public void add(User user) {
        Date date = new Date();
        user.setUpdate_at(date.getTime());
        user.setCreate_at(date.getTime());
        try {
            String sql = "insert into card(name, QQ, job, date, school, number_online, daily_link, oath, brother, " +
                    "where_know) value(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            jt.update(sql, user.getName(), user.getQQ(), user.getJob(), user.getDate(), user.getSchool(), user.getNumber_online(),
                    user.getDaily_link(), user.getOath(), user.getBrother(), user.getWhere_know());
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean del(Integer id) {
        try {
            String sql = "delete from card where id=?";
            jt.update(sql, id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(User user) {
        try {
            String sql = "update card set name=? where id=?";
            jt.update(sql, user.getName(), user.getId());
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<User> getAll() {
        List<User> user = new ArrayList<>();
        try {
         String sql = "select * from card";
         user = jt.query(sql, new CardMapper());
        }catch(Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User selectById(Integer id) {
        User user = new User();
        try {
            String sql = "select * from card where id = ?";
            user = jt.queryForObject(sql, new CardMapper(), id);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User selectByName(String name) {
        User user = new User();
        try {
            String sql = "select * from card where name=?";
            user = jt.queryForObject(sql, new CardMapper(), name);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User selectByNumber(int number) {
        User user = new User();
        try {
            String sql = "select * from card where number_online=?";
            user = jt.queryForObject(sql, new CardMapper(), number);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public int count() {
        try {
            String sql = "select count(*) from card";
            return jt.queryForObject(sql, Integer.class);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
