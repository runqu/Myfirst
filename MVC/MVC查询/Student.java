package com.atguigu.javaweb.mvc;

public class Student {
	private int flowId;
	private int Type;
	private int idcard;
	private int examcard;
	private int examNmae;
	private String studentNmae;
	private String location;
	private int Grade;
	public Integer getFlowid() {
		return flowId;
	}
	public void setFlowid(Integer flowid) {
		this.flowId = flowid;
	}
	public int getType() {
		return Type;
	}
	public void setType(int type) {
		Type = type;
	}
	public int getIdcard() {
		return idcard;
	}
	public void setIdcard(int idcard) {
		this.idcard = idcard;
	}
	public int getExamcard() {
		return examcard;
	}
	public void setExamcard(int examcard) {
		this.examcard = examcard;
	}
	public int getExamNmae() {
		return examNmae;
	}
	public void setExamNmae(int examNmae) {
		this.examNmae = examNmae;
	}
	public String getStudentNmae() {
		return studentNmae;
	}
	public void setStudentNmae(String studentNmae) {
		this.studentNmae = studentNmae;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade, int Grade) {
		this.Grade = Grade;
	}
	
	
public Student(int flowId, int type, int idcard, int examcard, String studentNmae, String location,
			int grade) {
		super();
		this.flowId = flowId;
		Type = type;
		this.idcard = idcard;
		this.examcard = examcard;
		this.studentNmae = studentNmae;
		this.location = location;
		Grade = grade;
	}

 public Student(){
}
}
