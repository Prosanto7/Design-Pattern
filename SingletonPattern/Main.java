package SingletonPattern;

public class Main {
	public static void main(String[] args) {
		Singleton a = Singleton.getObject();
		System.out.println(a);
		
		Singleton b = Singleton.getObject();
		System.out.println(b);
	}
}
