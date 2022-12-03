package com.ing.zoo.AClass;

public abstract class Omnivore extends Animal{
	protected String eatMeatText;
	protected String eatVegText;

	public Omnivore(String name)
	{
		super(name);
	}

	public void eatLeaves()
	{
		System.out.println(this.eatVegText);
	}

	public void eatMeat()
	{
		System.out.println(this.eatMeatText);
	}
}
