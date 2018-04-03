package SingletonApproach;

//Singleton class is a special type of class for which only and only one object can be created at a time
//only single instance

//How to design Singleton class in java
//1.Make constructor as private
//2.Write a static method that has return type object of this singleton class(Lazy Initialization)

public class Singleton {

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() {
		str = "I am using singleton class pattern";
	}

	public static Singleton getInstance() {
		if (singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;
	}

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		x.str = (x.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}
