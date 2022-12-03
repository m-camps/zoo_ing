package com.ing.zoo.AClass;

public abstract class Animal{
	public 		String name;
	protected 	String helloText;
	protected 	String eatText;

	public Animal(String name)
	{
		this.name = name;
	}

	public void sayHello()
	{
		System.out.println(helloText);
	}
}