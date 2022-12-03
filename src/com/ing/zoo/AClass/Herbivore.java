package com.ing.zoo.AClass;

public abstract class Herbivore extends Animal{
	public Herbivore(String name)
	{
		super(name);
	}

	public void eatLeaves()
	{
		System.out.println(this.eatText);
	}
}
