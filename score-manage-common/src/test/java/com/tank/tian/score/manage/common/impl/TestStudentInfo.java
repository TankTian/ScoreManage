package com.tank.tian.score.manage.common.impl;

import org.junit.Assert;
import org.junit.Test;


public class TestStudentInfo {
	@Test
	public void testGetStudentName() {
		 Assert.assertEquals("TankTian", new StudentInfoA().getStudentName(1));
	}

}
