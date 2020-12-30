package _01_introduction_to_encapsulation;

import com.sun.org.apache.bcel.internal.generic.Type;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	protected int itemsReceived; //must not be negative. All negative arguments get set to 0.
	
	public int getItemsReceived() {
		return itemsReceived;
	}
	
	public void setItemsReceived(int newAmount) { 
		if(newAmount >= 0) {
		itemsReceived = newAmount;
		}
		else {
			itemsReceived = 0;
		}
	}
	
	protected float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	
	public float getDegreesTurned() {
		return degreesTurned;
	}
	
	public void setDegreesTurned(float newAmount) {
		if(newAmount <= 360.00 && newAmount >= 0.0) {
			degreesTurned = newAmount;
		}
	}
	
	protected String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	
	public String getNomenclature() {
		return nomenclature;
	}
	
	public void setNomenclature(String newAmount) {
		if(newAmount.isEmpty()) {
			nomenclature = " ";
		}
		else {
		nomenclature = newAmount;
		}
	}
	
	protected Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	@SuppressWarnings("unlikely-arg-type")
	public void setMemberObj(Object newObject) {
		if(!newObject.getClass().equals(Type.STRING)) {
			memberObj = newObject;
		}
	}
	
	public Object getMemberObj() {
		return memberObj;
	}
	
	public static void main(String[] args) {
		
	}
}
