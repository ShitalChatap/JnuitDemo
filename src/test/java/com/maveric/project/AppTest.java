package com.maveric.project;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest{
	
	@BeforeAll
	public static void setUpTestEnv()
	{
		System.out.println("setUpTestEnv()");
		
	}
	@BeforeEach
	public void setUpTestMockDataEnv()
	{
		System.out.println("setUpTestMockDataEnv()");
	}
	@Test
	public void test1()
	{
		System.out.println("test1()");
	}
	@Test

	public void test2()
	{
		System.out.println("test1()");
	}
	@BeforeEach
	public void tearDownTestMockDataEnv()
	{
		System.out.println("tearDownTestMockDataEnv()");
	}
	@AfterAll
	public static void tearDownTestEnv()
	{
		System.out.println("tearDownTestEnv()");
		
	}
	
	
    
    
}
