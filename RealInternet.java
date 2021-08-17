package jo.secondstep.proxy;

public class RealInternet  implements UniversityInternet {

	    @Override 
	    public void provideInternet(String departmentName) {  
	        System.out.println("Internet Access provided for {"+ departmentName +"} Department");  
	    }  

}
