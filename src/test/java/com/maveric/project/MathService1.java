package com.maveric.project;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.maveric.project.Exception.InvalidRangeException;
import com.maveric.project.services.MathServices;

public class MathService1
{
	public static MathServices mathservice;
	@BeforeAll
	public static void setUpTestEnv()
	{
		mathservice =new MathServiceImpl();
	}

	@Test
	@DisplayName("MathService Add Test For 1st negative param")
	public void test1()
	{
		Assertions.assertThrows(InvalidRangeException.class,()->mathservice.add(-10,12));
	}
	
	@Test
	@DisplayName("MathService Add Test For 2ndst negative param")
	public void test2()
	{
		Assertions.assertThrows(InvalidRangeException.class,()->mathservice.add(10,-12));
	}
	
	@Test
	@DisplayName("MathService Add Test for both positive param")
	public void test3()throws InvalidRangeException
	{
		int a =10 ;
	    int b=20;
		int c=30;
		Assertions.assertEquals(c, mathservice.add(10,20));
	}
	@Test
	@DisplayName("MathService Add Test For 1st negative param")
	public void test4()
	{
		Assertions.assertThrows(InvalidRangeException.class,()->mathservice.sub(-10,12));
	}
	
	@Test
	@DisplayName("MathService Add Test For 2ndst negative param")
	public void test5()
	{
		Assertions.assertThrows(InvalidRangeException.class,()->mathservice.sub(10,-12));
	}
	
	@Test
	@DisplayName("MathService Add Test for both positive param")
	public void test6()throws InvalidRangeException
	{
		int a =10 ;
	    int b=20;
		int c=30;
		Assertions.assertEquals(c, mathservice.sub(10,20));
	}
	@Test
	@DisplayName("MathService Add Test For 1st negative param")
	public void test7()
	{
		Assertions.assertThrows(InvalidRangeException.class,()->mathservice.Multi(-10,12));
	}
	
	@Test
	@DisplayName("MathService Add Test For 2ndst negative param")
	public void test8()
	{
		Assertions.assertThrows(InvalidRangeException.class,()->mathservice.Multi(10,-12));
	}
	
	@Test
	@DisplayName("MathService Add Test for both positive param")
	public void test9()throws InvalidRangeException
	{
		int a =10 ;
	    int b=20;
		int c=30;
		Assertions.assertEquals(c, mathservice.Multi(10,20));
	}
	@Test
	@DisplayName("Test Division operation when divident is zero")
	
		public void testDivisionwhenDividentIsZero()
		
		{
		 
			assertThrows(InvalidRangeException.class,()->mathservice.div(50,0));
		}
	
	@AfterAll
	public static void Testdowntear()
	{
		System.out.println("Testdowntear");
	}
	
}
