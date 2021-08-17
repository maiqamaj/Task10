package jo.secondstep.proxy;

public class InternetManager {
	public static  UniversityInternet provideInternet()
	{ return new ProxyInternet(new RealInternet());}
}
