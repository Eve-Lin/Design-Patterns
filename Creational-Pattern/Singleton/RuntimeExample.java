package Singleton;


public class RuntimeExample {
	
	public static void main(String [] args) {
		Runtime singletonRuntime = Runtime.getRuntime();
		
		singletonRuntime.gc();
		System.out.println(singletonRuntime);
		
		Runtime anotherInRuntime = Runtime.getRuntime();
		System.out.println(anotherInRuntime);
		
		if(singletonRuntime == anotherInRuntime) {
			System.out.println("They are the same");
		}
	}

}

