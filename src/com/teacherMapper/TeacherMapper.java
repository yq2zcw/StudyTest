package com.teacherMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.teacher.bean.Teacher;

public class TeacherMapper implements RowMapper<Teacher>{

	@Override
	public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
		//设置id，name，birthday，age，classname，test
		Teacher teacher = new Teacher();
		teacher.setId(rs.getInt("id"));
		teacher.setName(rs.getString("name"));
		teacher.setBirthday(getStringDate(rs.getString("birthday")));
		teacher.setAge(rs.getInt("age"));
		teacher.setClassName(rs.getString("classname"));
		teacher.setTest(rs.getString("test"));


		return teacher;
	}
//date转string
	private String getStringDate(String birthday) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		Date dateString = new Date();
		String StrRtnDate = "";
		try {
			dateString = formatter.parse(birthday);
			StrRtnDate = new SimpleDateFormat("yyyy-mm-dd").format(dateString);
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return StrRtnDate;
	}

}
