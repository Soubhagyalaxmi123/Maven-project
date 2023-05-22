package com.package2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.package1.App;

public class AppTest {
	@Test
	public void testlogin1() {
		App myapp=new App();
		Assert.assertEquals(0, myapp.userLogin("abc","abc123"));
		
	}
	@Test
	public void testLogin2() {
		App myapp=new App();
		Assert.assertEquals(1, myapp.userLogin("abc","abc@123"));
	}
	}


