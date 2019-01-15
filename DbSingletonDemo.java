
public class DbSingletonDemo {
	
	public static void main(String [] args) {
		DbSingleton instance = DbSingleton.getInstance();
		DbSingleton secondInstance = DbSingleton.getInstance();
		System.out.println(instance);
		
		//prints the same object address
		System.out.println(secondInstance);
	}

}
