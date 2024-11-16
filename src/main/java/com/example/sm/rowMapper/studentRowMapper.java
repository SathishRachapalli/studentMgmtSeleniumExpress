package com.example.sm.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.sm.api.Student;

public class studentRowMapper implements org.springframework.jdbc.core.RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Student studObj=new Student();
		
		studObj.setId(rs.getInt("id"));
		studObj.setName(rs.getString("name"));
		studObj.setMobile(rs.getLong("mobile"));
		studObj.setCountry(rs.getString("country"));
	
		return studObj;
	}

}
