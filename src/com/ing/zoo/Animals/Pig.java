package com.ing.zoo.Animals;

import java.util.Random;

import com.ing.zoo.AClass.Omnivore;

public class Pig extends Omnivore{
    private String trick;

    public Pig(String name)
    {
		super(name);
		this.helloText = "splash";
		this.eatMeatText = "nomnomnom oink thx";
		this.eatVegText = "munch munch oink";
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
