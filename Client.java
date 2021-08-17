package jo.secondstep.proxy;

public class Client {

	public static void main(String[] args) {
		UniversityInternet internet = new InternetManager().provideInternet();  
        internet.provideInternet("IT");  
        
        internet.provideInternet("Pharmacy");  
	}

}
