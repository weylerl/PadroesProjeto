

class BalancaDieta2 implements Observer {

	public void update(Object obj) {
		Double novoPeso = 0.00;
		if (obj instanceof Double) {
			novoPeso = (Double) obj;
		}
		if (novoPeso >= 120) {
			System.out.println("Sou o seu outro observador. Você ultrapassou muito o limite de peso. Vai morrer!!!");
		}
	}


}