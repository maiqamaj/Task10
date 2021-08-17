package jo.secondstep.proxy;

public class ProxyInternet  implements UniversityInternet {

	
    private UniversityInternet  universityInternet;  
  
 public ProxyInternet(UniversityInternet  universityInternet) {
		this.universityInternet=universityInternet;
	}

@Override 
 public void provideInternet(String departmentName)   
 {  
     if (departmentName == "IT")   
     {  
    	 universityInternet.provideInternet(departmentName);  
     }   
     else  
     {  
         System.out.println("No Internet access provided, Not Allow for {"+departmentName+ "} Department");  
     }  
 }  


}
