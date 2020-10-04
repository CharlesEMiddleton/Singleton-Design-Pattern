import java.util.*;
/**
 * instance variables
 * @author Charlie Middleton
 *
 */
public class HospitalSystem {
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private static HospitalSystem hospitalSystem;
	/**
	 * private constructor
	 */
	private HospitalSystem() {
		//this.patients = patients;
		//this.hospitalSystem = hospitalSystem;
		
	}
	/**
	 * returns instance of hostpital system
	 * @return hospital system
	 */
	public static HospitalSystem getInstance() {
		if (hospitalSystem ==null)
			hospitalSystem = new HospitalSystem();
		return hospitalSystem;
	}
	/**
	 * add patient method
	 * @param firstName first name of patient
	 * @param lastName last name of patient
	 * @return patient id
	 */
public int addPatient(String firstName, String lastName) {
	
	int id = patients.size();
	Patient addPatient = new Patient(id,firstName, lastName);
	patients.add(addPatient);
	return id;
	
	
}
/**
 * returns patients record based on id
 * @param id
 * @return patients record
 */
public Patient getRecord(int id) {
 return patients.get(id);
	}
/**
 * adds allergy to patients based on id
 * @param id patient id
 * @param allergy patients allergies
 */
public void addAllergy(int id, String allergy) {
	Patient patient = patients.get(id);
	patient.addAllergy(allergy);

		
	
}

/**
 * returns patients data
 * @return prints list of patients 
 */
public String getAllPatientsData() {
	String ret = "";
	for(Patient list : patients)
		ret += list;
	
return ret;
	
}

}
