package _04_hospital;

public class Patient {
	public boolean caredFor = false;
	public boolean feelsCaredFor() {
		return caredFor;
	}
	
	public void checkPulse() {
		caredFor = true;
	}
}
