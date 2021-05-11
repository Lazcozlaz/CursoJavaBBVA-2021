package modulo1;

import java.util.ArrayList;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;
import repaso.PoligonoRegular;
import repaso.Rectangulo;
import repaso.Triangulo;
import util.FiguraFileUtil;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		
		Circulo circ = new Circulo("circ",2);
		figuras.add(circ);
		Cuadrado cuad = new Cuadrado("cuad",4);
		figuras.add(cuad);
		Rectangulo rect = new Rectangulo("rect",5,2);
		figuras.add(rect);
		Triangulo tri = new Triangulo("tri",5,2);
		figuras.add(tri);
		PoligonoRegular pol_reg = new PoligonoRegular("pol_reg",5,4,10);
		figuras.add(pol_reg);
		FiguraFileUtil util = new FiguraFileUtil(figuras,"\\formas.txt",System.getProperty("user.dir"));
		util.generarArchivo();
		System.out.println(util.leerArchivo().get(4).toString());
		
	}

}
