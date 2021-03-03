package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> doctorPatients = new ArrayList<Patient>();

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean performsSurgery() {
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		//System.out.println("Is this working");
		if (doctorPatients.size() < 3) {
			doctorPatients.add(patient);
		}
		else {
			throw new DoctorFullException();
		}
		//System.out.println("New patient added");
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
