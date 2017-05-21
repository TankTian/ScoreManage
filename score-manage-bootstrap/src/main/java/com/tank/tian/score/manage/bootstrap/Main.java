package com.tank.tian.score.manage.bootstrap;

import com.tank.tian.score.manage.common.StudentInfo;
import com.tank.tian.score.manage.common.impl.SPIServiceUtils;

public class Main {
public static void main(String[] args) {
	String name1 =SPIServiceUtils.getTargetService(StudentInfo.class).getStudentName(1);
	System.out.println("score management system test,get student 1 name: "+name1);
	String name2 =SPIServiceUtils.getTargetService(StudentInfo.class).getStudentName(2);
	System.out.println("score management system test,get student 2 name: "+name2);
}
}
