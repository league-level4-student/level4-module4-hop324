package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	public void addDoctor(Doctor type){
		doctors.add(type);
	}
	public ArrayList<Doctor> getDoctors(){
		return doctors;
		
	}
	
	public void addPatient(Patient patient){
		patients.add(patient);
		//System.out.println("patient added to hospital");
	}
	
	public ArrayList<Patient> getPatients(){
		return patients;
	}
	public void assignPatientsToDoctors() {
		int counter = 0;
		System.out.println(doctors.size());
		for(int i = 0; i < doctors.size();i++) {
			for(int j = 0; j < 3; j++) {
				if(counter+j < patients.size()) {
					try {
						System.out.println(counter+j);
						doctors.get(i).assignPatient(patients.get(counter+j));
						//System.out.println(patients.get(j));
					} 	catch (DoctorFullException e) {
						// TODO Auto-generated catch block
					
					
					}
				}
				else {
					break;
					}
				
			}
			System.out.println("endpoint reached");
			counter+=3;
		}
		
		for(int k = 0; k < doctors.size(); k++) {
			System.out.println(doctors.get(k).getPatients().size());
		}
	}
	
	
	
}
