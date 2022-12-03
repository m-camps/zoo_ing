package com.ing.zoo;

import java.util.*;

import com.ing.zoo.AClass.*;
import com.ing.zoo.Animals.*;


public class Zoo {
    public static void main(String[] args)
    {
        String[] cmds = new String[6];
        cmds[0] = "hello";
        cmds[1] = "give leaves";
        cmds[2] = "give meat";
        cmds[3] = "perform trick";
		cmds[4] = "help";
		cmds[5] = "quit";


		List<Animal> zoo = new ArrayList<Animal>(){{
			add(new Lion("henk"));
			add(new Hippo("elsa"));
			add(new Pig("dora"));
			add(new Tiger("wally"));
			add(new Zebra("marty"));
			add(new Shark("fred"));
			add(new Lama("sam"));
			add(new Bear("casimir"));
		}};

        Scanner scanner = new Scanner(System.in);

		System.out.println("Available Commands: \n\t [hello + [name]] \n\t [give leaves] \n\t [give meat] \n\t [perfom trick] \n\t [h, help] \n\t [q, quit]");
		while (true)
		{
			System.out.print("Voer uw command in: ");
			String input = scanner.nextLine();
			String[] name = input.split("\\s+");

			if (name[0].equals(cmds[0]) && name.length == 1)
			{
				for (Animal a: zoo)
				{
					a.sayHello();
				}
			}
			else if (name[0].equals(cmds[0]) && name.length == 2)
			{
				boolean contains = false;
				for (Animal a: zoo)
				{
					if (a.name.equals(name[1]))
					{
						a.sayHello();
						contains = true;
						break ;
					}
				}
				if (contains == false)
				{
					System.out.println("Zoo does not contain animal with name: " + name[1]);
				}
			}
			else if (input.equals(cmds[1]))
			{
				for (Animal a: zoo)
				{
					if (a instanceof Herbivore)
					{
						Herbivore h = (Herbivore)a;
						h.eatLeaves();
					}
					else if (a instanceof Omnivore)
					{
						Omnivore o = (Omnivore)a;
						o.eatLeaves();
					}
				}
			}
			else if (input.equals(cmds[2]))
			{
				for (Animal a: zoo)
				{
					if (a instanceof Carnivore)
					{
						Carnivore h = (Carnivore)a;
						h.eatMeat();
					}
					else if (a instanceof Omnivore)
					{
						Omnivore o = (Omnivore)a;
						o.eatMeat();
					}
				}
			}
			else if (input.equals(cmds[3]))
			{
				for (Animal a: zoo)
				{
					try {
						a.getClass().getMethod("performTrick").invoke(a);
					} catch (Exception e) {}    
				}
			}
			else if (input.equals(cmds[4]) || input.equals("h"))
			{
				System.out.println(
					"- Als je de [hello] command uitvoert zonder dat er een naam is ingevuld zeggen alle dieren hallo.\n" +
					" - Als er wel een naam is ingevuld [hello henk] zegt alleen dat dier hallo\n" +
					"- Als je de [give leaves] command uitvoert krijgen alle herbivores leaves.\n" +
					"- Als je de [give meat] command uitvoert krijgen alle carnivores meat.\n" +
					"- Als je de [perform trick] command uitvoert doen alle dieren die dat kunnen hun trucje.\n" +
					"\n" +
					"q, quit to exit the program\n"
				);
			}
			else if (input.equals(cmds[5]) || input.equals("q"))
			{
				break ;
			}
			else
			{
				System.out.println("Unknown command: " + input);
			}
		}
		scanner.close();
    }
}
