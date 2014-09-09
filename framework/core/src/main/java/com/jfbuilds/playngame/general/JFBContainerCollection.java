/**
 * 
 */
package com.jfbuilds.playngame.general;

import java.util.ArrayList;

/**
 * @author Jean
 *
 */
public class JFBContainerCollection implements JFBContainerCollectionInterface{
	private String headOfFamily;
	ArrayList<JFBContainerCollection> myFamily;
	
	
	public JFBContainerCollection() {
	}
	public JFBContainerCollection(String name){
		myFamily = new ArrayList<JFBContainerCollection>();
		this.headOfFamily = name;
	}

	public ArrayList<JFBContainerCollection> getFamily() {
		System.out.println("Create Family..");
		addFamilyMembers();
		System.out.println("Return Family..");
		return myFamily;
	}
	
	public void addFamilyMembers() {
		myFamily.add(this); 
		myFamily.add(new JFBContainerCollection("Marcel"));
		myFamily.add(new JFBContainerCollection("Matilde"));
		myFamily.add(new JFBContainerCollection("Serge"));
		myFamily.add(new JFBContainerCollection("Jessica"));
		
	}


	@Override
	public String getName() {
		return headOfFamily;
	}
}
