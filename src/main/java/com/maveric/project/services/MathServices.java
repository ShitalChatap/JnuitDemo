package com.maveric.project.services;

import com.maveric.project.Exception.InvalidRangeException;

public interface MathServices {
	public int add (int n1 ,int n2)throws InvalidRangeException;
	public int sub (int n1 ,int n2)throws InvalidRangeException;
	public int div (int n1 ,int n2)throws InvalidRangeException;
	public int Multi (int n1 ,int n2)throws InvalidRangeException;
}
