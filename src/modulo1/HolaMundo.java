package modulo1;

import java.util.ArrayList;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		
		Circulo circ = new Circulo("circ",2);
		figuras.add(circ);
		Cuadrado cuad = new Cuadrado("cuad",4);
		figuras.add(cuad);
	}

}
