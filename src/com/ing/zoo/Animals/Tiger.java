package com.ing.zoo.Animals;

import java.util.Random;

import com.ing.zoo.AClass.Carnivore;

public class Tiger extends Carnivore{
	private String trick;

	public Tiger(String name)
	{
		super(name);
		this.helloText = "rraaarww";
		this.eatText = "nomnomnom oink wubalubadubdub";
	}

	public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
