package com.ing.zoo.Animals;

import com.ing.zoo.AClass.Herbivore;

public class Lama extends Herbivore{
	public Lama(String name)
	{
		super(name);
		this.helloText = "hello *spits the ground*";
		this.eatText = "nom *spit* nom *spit*";
	}
}
