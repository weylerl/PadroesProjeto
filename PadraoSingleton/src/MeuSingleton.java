
public class MeuSingleton {

	private static MeuSingleton uniqueInstance;

	private MeuSingleton() {
	}

	public static synchronized MeuSingleton getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new MeuSingleton();

		return uniqueInstance;
	}

}