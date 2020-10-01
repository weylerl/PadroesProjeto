package CompositeExemplo;

import java.util.ArrayList;

public class Composto extends Elemento {
	protected ArrayList<Elemento> ListaElementos;

	public Composto(String texto) {
		this.Texto = texto;
		this.ListaElementos = new ArrayList<Elemento>();
	}

	public void add(Elemento e) {
		this.ListaElementos.add(e);
	}

	public void remove(Elemento e) {
		this.ListaElementos.remove(e);
	}

	public void getTexto() {
		System.out.println(this.Texto);
		for (Elemento e: ListaElementos) {
			e.getTexto();
		}
	}
}
