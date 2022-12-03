package com.ing.zoo.Animals;

import java.util.Random;

import com.ing.zoo.AClass.Omnivore;

public class Bear extends Omnivore{
	private String trick;

    public Bear(String name)
    {
		super(name);
		this.helloText = "rawwwwwwr";
		this.eatMeatText = "shred *claw* shred";
		this.eatVegText = "chomp chomp";
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(3);
        if(rnd == 0)
        {
            trick = "rides bicycle";
        }
		else if (rnd == 1)
		{
			trick = "scratches his back against pole";
		}
        else
        {
            trick = "dances";
        }
        System.out.println(trick);
    }
}
