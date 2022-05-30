package SingletonPattern;

public class Singleton {
	
	private static Singleton object;
	
	private Singleton() {
		// Blank Constructor
	}
	
	public static Singleton getObject() {
		if (object == null) {
			object = new Singleton();
		} return object;
	}
}
