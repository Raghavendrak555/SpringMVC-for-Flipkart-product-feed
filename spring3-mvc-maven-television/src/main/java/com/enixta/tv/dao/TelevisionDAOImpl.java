package com.enixta.tv.dao;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
 
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.enixta.tv.model.Television;
public class TelevisionDAOImpl implements TelevisionDAO {
 
    private JdbcTemplate jdbcTemplate;
 
    @Autowired
    public TelevisionDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
 
    @Override
    public void saveOrUpdate(Television contact) {
        // implementation details goes here...
    }
 
    @Override
    public void delete(int contactId) {
        // implementation details goes here...
    }
 
    @Override
    public List<Television> list() {
    	String sql = "SELECT * FROM tvprices";
        List<Television> listContact = jdbcTemplate.query(sql, new RowMapper<Television>() {
     
            @Override
            public Television mapRow(ResultSet rs, int rowNum) throws SQLException {
            	Television aTv = new Television();
     
                aTv.setId(rs.getString("id"));
                aTv.setTitle(rs.getString("title"));
                aTv.setMRP(rs.getInt("MRP"));
                aTv.setSP(rs.getInt("SP"));
                aTv.setUrl(rs.getString("url"));
                aTv.setBrand(rs.getString("brand"));
                aTv.setImageUrl(rs.getString("image"));
                
                return aTv;
            }
     
        });
     
        return listContact;
    }
 
    @Override
    public Television get(int contactId) {
		return null;
    }
 
}