package com.teacher.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teacher.bean.Teacher;
import com.teacher.dao.TeacherDao;

//设置控制器
@Controller
public class TeacherController {
	//搜索
	@RequestMapping(value = "/select")
	public String queryTeacher(Model model) {
		//导入请求
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//提取dao
		TeacherDao dao = (TeacherDao) context.getBean("dao");
		//检索内容
		List<Teacher> teacherList = new ArrayList<Teacher>();
		//检索数据库
		teacherList = dao.queryAll();
		//导出请求
		model.addAttribute("teacher", teacherList);
		return "select";

	}

	@RequestMapping(value = "/con")
	public String query(Model model) {
		//导入请求
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//提取dao
		TeacherDao dao = (TeacherDao) context.getBean("dao");
		//检索内容
		List<Teacher> teacherList = new ArrayList<Teacher>();
		//检索数据库
		teacherList = dao.queryAll();
		//导出请求
		model.addAttribute("teacher", teacherList);
		return "controll";

	}
	 @RequestMapping(value = "/queryById")
	 public String queryId(String id,Model model) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 TeacherDao dao = (TeacherDao) context.getBean("dao");
		 List<Teacher> teacherList = new ArrayList<Teacher>();
		 teacherList = dao.queryId(id);
		 model.addAttribute("teacher",teacherList);
		 return "select";
	 }

	 @RequestMapping(value = "/queryByName")
	 public String queryName(String name,Model model) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 TeacherDao dao = (TeacherDao) context.getBean("dao");
		 List<Teacher> teacherList = new ArrayList<Teacher>();
		 teacherList = dao.queryName(name);
		 model.addAttribute("teacher",teacherList);
		 return "select";
	 }
	 //对应controll.jsp-form-action
	 @RequestMapping(value = "/delete")
	 //对应controll.jsp-input-name
	 public String deleteId(String id,Model model) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 TeacherDao dao = (TeacherDao) context.getBean("dao");
		 boolean result = dao.deleteById(Integer.parseInt(id));
		 if (result) {
			 System.out.println("删除成功");
		 }else {
			 System.out.println("删除失败");
		 }
		 model.addAttribute("teacher",dao.queryAll());
		 return "controll";

	 }

	 @RequestMapping(value = "/add")
	 public String addId(String id,String name,String birthday, String age,String classname,Model model) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 TeacherDao dao = (TeacherDao) context.getBean("dao");
		 Teacher teacher = new Teacher();
		 teacher.setId(Integer.valueOf(id));
		 teacher.setName(name);
		 teacher.setBirthday(birthday);
		 teacher.setAge(Integer.valueOf(age));
		 teacher.setClassName(classname);
		 boolean result = dao.add(teacher);
		 if(result) {
			 System.out.println("ok");
		 }else {
			 System.out.println("flase");
		 }
		 model.addAttribute("teacher",dao.queryAll());
		 return "controll";
	 }

	 @RequestMapping(value = "/update")
	 public String updId(String name,String birthday, String age,String classname,String id,Model model) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 TeacherDao dao = (TeacherDao) context.getBean("dao");
		 Teacher teacher = new Teacher();
		 teacher.setId(Integer.valueOf(id));
		 teacher.setName(name);
		 teacher.setBirthday(birthday);
		 teacher.setAge(Integer.valueOf(age));
		 teacher.setClassName(classname);
		 boolean result = dao.upd(teacher);
		 if(result) {
			 System.out.println("ok");
		 }else {
			 System.out.println("flase");
		 }
		 model.addAttribute("teacher",dao.queryAll());
		 return "controll";
	 }

}
