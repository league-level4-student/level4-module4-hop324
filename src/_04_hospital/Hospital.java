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
		System.out.println("patient added lol");
	}
	
	public ArrayList<Patient> getPatients(){
		return patients;
	}
	public void assignPatientsToDoctors() {
		for(int j = 0; j < patients.size(); j++) {
			for(int i = 0; i < doctors.size(); i++) {
				doctors.get(i).assignPatient(patients.get(j));
				if (i == doctors.size()) {
					i = 0;
				}
			}
		}
	}
	
	
	
}
