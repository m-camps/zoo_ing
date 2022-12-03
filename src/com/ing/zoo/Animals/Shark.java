package com.ing.zoo.Animals;

import com.ing.zoo.AClass.Carnivore;

public class Shark extends Carnivore{
	public Shark(String name)
	{
		super(name);
		this.helloText = "blub rawr blub";
		this.eatText = "shred *rip* shred";
	}
}