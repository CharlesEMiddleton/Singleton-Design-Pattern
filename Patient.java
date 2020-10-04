import java.util.ArrayList;
/**
 * instance variables
 * @author Charlie Middleton
 *
 */
public class Patient {
private int id;
private String firstName;
private String lastName;
private ArrayList<String> allergies = new ArrayList<String>();
/**
 * parameter constructor
 * @param id patient number
 * @param firstName patient first name
 * @param lastName patient last name
 */

public Patient (int id, String firstName, String lastName) {
	this.id = id;
	this.firstName = firstName;
	this.lastName= lastName;
	
}
/**
 * adds allergy to allergies 
 * @param allergy type of allergy
 */
public void addAllergy(String allergy) {
	allergies.add(allergy);
	
}
/**
 * prints patient and allergies
 */
public String toString() {
		  
	return "\nPatient: "+(id+1)+" "+firstName+" "+lastName+"\n"+allergies;	
	
}

} 