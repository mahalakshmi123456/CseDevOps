package com.lbrce.Devops;



import org.testng.Assert;

import org.testng.annotations.Test;



public class uservalidationtesting {

	@Test

	public void testCasel()

	{

		uservalidation uv=new uservalidation();

		Assert.assertEquals(false,uv.check("srinu", "srinu@12345"));

	}

	public void testCase2()

	{

		uservalidation uv=new uservalidation();

		Assert.assertEquals(false,uv.check("lbrce", "lbrce@94"));

	}

	public void testCase3()

	{

		uservalidation uv=new uservalidation();

		Assert.assertEquals(false,uv.check("Srinu", "Srinu@12345"));

	}

	public void testCase4()

	{

		uservalidation uv=new uservalidation();

		Assert.assertEquals(false,uv.check("srinu", "srinu@12345"));

	}

	public void testCase5()

	{

		uservalidation uv=new uservalidation();

		Assert.assertEquals(false,uv.check("srinu", "srinu@12345"));

	}



}