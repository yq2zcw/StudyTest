package com.teacher.bean;

public class Teacher {
	//设置变量id
	private int id;
	//设置变量name
	private String name;
	//设置变量birthday
	private String birthday;
	//设置变量age
	private int age;
	//设置变量classname
	private String className;
	//设置变量test
	private String test;
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday セットする birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className セットする className
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return test
	 */
	public String getTest() {
		return test;
	}
	/**
	 * @param test セットする test
	 */
	public void setTest(String test) {
		this.test = test;
	}
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", birthday=" + birthday + ", age=" + age + ", className="
				+ className + ", test=" + test + "]";
	}
	public Teacher(int id, String name, String birthday, int age, String className, String test) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.age = age;
		this.className = className;
		this.test = test;
	}
	public Teacher() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
