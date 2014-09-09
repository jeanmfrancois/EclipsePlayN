/**
 * 
 */
package com.jfbuilds.playngame.general;

/**
 * @author Jean
 *
 */
public class SuperCollection extends SimpleCollection implements JFBContainerCollectionInterface {

//	private String headOfFamily;
//	private ArrayList<SuperCollection> myFamily;
	
	/**
	 * 
	 */
	public SuperCollection() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param headOfHouse
	 * @param members
	 */
	public SuperCollection(String headOfHouse, String... members) {
		super(headOfHouse, members);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.general.SimpleCollection#createFamily(java.lang.String[])
	 */
	@Override
	public void createFamily(String... members) {
		for (int i = 0; i < members.length; i++) {
			this.addMember(members[i]);
		}

	}

	/* (non-Javadoc)
	 * @see com.jfbuilds.playngame.general.SimpleCollection#addMember(com.jfbuilds.playngame.general.JFBContainerCollectionInterface)
	 */
	
	public void addMember(String name) {
		//myFamily.add((SuperCollection)member);
		

	}

}
