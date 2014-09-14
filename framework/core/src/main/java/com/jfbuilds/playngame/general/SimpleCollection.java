/**
 *
 */
package com.jfbuilds.playngame.general;

import java.util.ArrayList;

/**
 * @author Jean
 *
 */
public abstract class SimpleCollection implements JFBContainerCollectionInterface {

	private String headOfFamily;
	private ArrayList<? extends JFBContainerCollectionInterface> myFamily;

	/* Generic constructor */
	public SimpleCollection() {
	}

	/* Constructor that takes name of head member */
	public SimpleCollection(String headOfHouse, String... members) {
		this.headOfFamily = headOfHouse;
		createFamily(members);
	}

	/* Add members to family */
	public void addFamilyMembers(String... members) {
		for (int i = 0; i < members.length; i++) {
			addMember(members[i]);
		}

	}

	/* Add a single member to family */
	public abstract void addMember(String name);

	public abstract void createFamily(String... members);

	/* Get all family members */
	@Override
	public ArrayList<? extends JFBContainerCollectionInterface> getFamily() {
		System.out.println("Return Family..");
		return myFamily;
	}

	/* Get name of head of family */
	@Override
	public String getName() {
		return headOfFamily;
	}
}
