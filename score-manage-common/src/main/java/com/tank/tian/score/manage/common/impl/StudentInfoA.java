package com.tank.tian.score.manage.common.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.tank.tian.score.manage.common.StudentInfo;

/**
 * 
 * @author tank
 *
 */
public class StudentInfoA implements StudentInfo {

	private Map<Integer, String> studentList = new ConcurrentHashMap<Integer, String>();

	public StudentInfoA() {
		studentList.put(1, "TankTian");
	}

	public String getStudentName(int id) {
		String studentName = studentList.get(id);
		return studentName;
	}

}
