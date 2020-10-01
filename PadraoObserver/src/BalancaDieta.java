

class BalancaDieta implements Observer {

	public void update(Object obj) {
		Double novoPeso = 0.00;
		if (obj instanceof Double) {
			novoPeso = (Double) obj;
		}
		if (novoPeso >= 100) {
			System.out.println("Sou o seu observador. Você ultrapassou o limite de peso. Cuidado!!!");
		}
	}


}