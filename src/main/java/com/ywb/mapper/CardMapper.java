package com.ywb.mapper;

import com.ywb.entity.User;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CardMapper implements RowMapper<User> {
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setQQ(rs.getLong("QQ"));
        user.setJob(rs.getString("job"));
        user.setDate(rs.getLong("date"));
        user.setSchool(rs.getString("school"));
        user.setNumber_online(rs.getInt("number_online"));
        user.setDaily_link(rs.getString("daily_link"));
        user.setOath(rs.getString("oath"));
        user.setBrother(rs.getString("brother"));
        user.setWhere_know(rs.getString("where_know"));
        return user;
    }
}
