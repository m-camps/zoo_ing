package com.ing.zoo.AClass;

public abstract class Carnivore extends Animal{
	public Carnivore(String name)
	{
		super(name);
	}

	public void eatMeat()
	{
		System.out.println(this.eatText);
	}
}
