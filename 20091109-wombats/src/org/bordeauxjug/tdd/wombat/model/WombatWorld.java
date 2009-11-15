package org.bordeauxjug.tdd.wombat.model;

import greenfoot.Greenfoot;
import greenfoot.World;

/**
 * A world where wombats live.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class WombatWorld extends World
{
	/**
	 * Create a new world with 8x8 cells and with a cell size of 60x60 pixels
	 * and with populated objects
	 */
	public WombatWorld(){
		this(8,8,true);
	}
	
	/**
	 * Create a new world with worldWidth x worldHeight cells and with a cell size of 60x60 pixels
	 * World population depends on populate flag
	 * @param worldWidth Number of x cells
	 * @param worldHeight Number of y cells
	 * @param populate If true, will populate world with wombats and leaves, otherwise, world will be
	 * freed
	 */
	public WombatWorld(int worldWidth, int worldHeight, boolean populate){
		super(worldWidth, worldHeight, 60);
		setBackground("images/cell.jpg");
		if(populate){
			populate();
		}
	}

	// @Test
	public void test()
	{
		System.out.println("Hello");
	}

	/**
	 * 
	 * Populate the world with a fixed scenario of wombats and leaves.
	 */
	public void populate()
	{
		Wombat w1 = new Wombat();
		addObject(w1, 0, 0);

		Wombat w2 = new Wombat();
		addObject(w2, 1, 7);

		Leaf l1 = new Leaf();
		addObject(l1, 5, 3);

		Leaf l2 = new Leaf();
		addObject(l2, 0, 2);

		Leaf l3 = new Leaf();
		addObject(l3, 7, 5);

		Leaf l4 = new Leaf();
		addObject(l4, 2, 6);

		Leaf l5 = new Leaf();
		addObject(l5, 5, 0);

		Leaf l6 = new Leaf();
		addObject(l6, 4, 7);
	}

	/**
	 * Place a number of leaves into the world at random places. The number of
	 * leaves can be specified.
	 */
	public void randomLeaves(int howMany)
	{
		for (int i = 0; i < howMany; i++)
		{
			Leaf leaf = new Leaf();
			int x = Greenfoot.getRandomNumber(getWidth());
			int y = Greenfoot.getRandomNumber(getHeight());
			addObject(leaf, x, y);
		}
	}
}