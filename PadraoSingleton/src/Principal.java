import java.text.ParseException;

public class Principal {

	public static void main(String[] args) throws ParseException {

		MeuSingleton ms = MeuSingleton.getInstance();

		System.out.println(ms);

		MeuSingleton ms2 = MeuSingleton.getInstance();

	}
}
