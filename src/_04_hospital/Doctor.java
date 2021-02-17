package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> doctorPatients;

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean performsSurgery() {
		return false;
	}

	public void assignPatient(Patient patient) {
		doctorPatients.add(patient);
		System.out.println("New patient added");
	}
	
	public ArrayList<Patient> getPatients() {
		return doctorPatients;
	}
	
	public void doMedicine() {
		for(int i = 0; i < doctorPatients.size(); i++) {
			doctorPatients.get(i).caredFor = true;
		}
	}
	

}
