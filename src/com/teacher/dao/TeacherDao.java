package com.teacher.dao;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.teacher.bean.Teacher;
import com.teacherMapper.TeacherMapper;

public class TeacherDao {
	// 连接数据库
	private JdbcTemplate jdbcTemplate;

	/**
	 * @param jdbcTemplate
	 *            セットする jdbcTemplate
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// 检索信息
	public List<Teacher> queryAll() {
		String sql = "select * from teacher";
		List<Teacher> teacherList = new ArrayList<Teacher>();
		teacherList = jdbcTemplate.query(sql, new TeacherMapper());
		return teacherList;

	}

	public List<Teacher> queryId(String id) {
		String sql = "select * from teacher where id like " + id + "";
		List<Teacher> teacherList = new ArrayList<Teacher>();
		teacherList = jdbcTemplate.query(sql, new TeacherMapper());
		return teacherList;
	}

	public List<Teacher> queryName(String name) {
		String sql = "select * from teacher where name like '%" + name + "%'";
		List<Teacher> teacherList = new ArrayList<Teacher>();
		teacherList = jdbcTemplate.query(sql, new TeacherMapper());
		return teacherList;
	}

	public boolean deleteById(Integer id) {
		String sql = "delete from teacher where id =?";
		return jdbcTemplate.update(sql, id) == 1;
	}

	public boolean add(Teacher teacher) {
		String sql = "insert into teacher(id,name,birthday,age,classname) values(?,?,?,?,?)";
		return jdbcTemplate.update(sql,
				new Object[] { teacher.getId(), teacher.getName(), teacher.getBirthday(), teacher.getAge(),
						teacher.getClassName() },
				new int[] { Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.VARCHAR }) == 1;
	}

	public boolean upd(Teacher teacher) {
		String sql = "update teacher set name = ? ,birthday = ? ,age = ? ,classname = ? where id = ?";
	    Object stuObj[] = new Object[] { teacher.getName(), teacher.getBirthday(),
				teacher.getAge(), teacher.getClassName(),teacher.getId()} ;
		return jdbcTemplate.update(sql,stuObj) == 1;

	}
}
