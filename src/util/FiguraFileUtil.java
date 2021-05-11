package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;
import repaso.PoligonoRegular;
import repaso.Rectangulo;
import repaso.Triangulo;

public class FiguraFileUtil {

	private ArrayList<Figura> figuras;
	private String nombreArchivo;
	private String path;
	
	public FiguraFileUtil(ArrayList<Figura> figuras, String nombreArchivo, String path) {
		super();
		this.figuras = figuras;
		this.nombreArchivo = nombreArchivo;
		this.path = path;
	}
	
	
	public ArrayList<Figura> getFiguras() {
		return figuras;
	}


	public void setFiguras(ArrayList<Figura> figuras) {
		this.figuras = figuras;
	}


	public String getNombreArchivo() {
		return nombreArchivo;
	}


	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public static void generarArchivo(ArrayList<Figura> figuras, String nombreArchivo, String path) {
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(path+nombreArchivo);
            pw = new PrintWriter(fichero);

            for (Figura figura : figuras)
            	if (figura instanceof Cuadrado) {
            		pw.println("{�tipo�:1,nombre�:"+figura.getNombre()+"�, �valores�:�"+figura.getValores()+"},");
            	}
            	else if (figura instanceof Circulo) {
            		pw.println("{�tipo�:2,nombre:�"+figura.getNombre()+"�, �valores�:�"+figura.getValores()+"},");
            	}
            	else if (figura instanceof Triangulo) {
            		pw.println("{�tipo�:4,nombre:�"+figura.getNombre()+"�, �valores�:�"+figura.getValores()+"},");
            	}
            	else if (figura instanceof Rectangulo) {
            		pw.println("{�tipo�:3,nombre:�"+figura.getNombre()+"�, �valores�:�"+figura.getValores()+"},");
            	}
            	else if (figura instanceof PoligonoRegular) {
            		pw.println("{�tipo�:5,nombre:�"+figura.getNombre()+"�, �valores�:�"+figura.getValores()+"},");
            	} 


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {

           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
	}
	public void generarArchivo() {
		
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(this.path+this.nombreArchivo);
            pw = new PrintWriter(fichero);

            for (Figura figura : this.figuras)
            	if (figura instanceof Cuadrado) {
            		pw.println("{�tipo�:1,nombre:�"+figura.getNombre()+"�, �valores�:�"+figura.getValores()+"},");
            	}
            	else if (figura instanceof Circulo) {
            		pw.println("{�tipo�:2,nombre:�"+figura.getNombre()+"�, �valores�:�"+figura.getValores()+"},");
            	}
            	else if (figura instanceof Triangulo) {
            		pw.println("{�tipo�:4,nombre:�"+figura.getNombre()+"�, �valores�:�"+figura.getValores()+"},");
            	}
            	else if (figura instanceof Rectangulo) {
            		pw.println("{�tipo�:3,nombre:�"+figura.getNombre()+"�, �valores�:�"+figura.getValores()+"},");
            	}
            	else if (figura instanceof PoligonoRegular) {
            		pw.println("{�tipo�:5,nombre:�"+figura.getNombre()+"�, �valores�:�"+figura.getValores()+"},");
            	}

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {

           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
		
	}
	
	public static ArrayList<Figura> leerArchivo(String nombreArchivo, String path) {
		
ArrayList<Figura> figuras = new ArrayList<Figura>();
		
		File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      

	      try {
	         archivo = new File (path+nombreArchivo);
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         char tipo='0';
	         String linea;
	         while((linea=br.readLine())!=null)
	          tipo=linea.charAt(9);
	         if (tipo == '1') {
	        	 String[] partes = linea.split(",");
	        	 String nombre = partes[1].substring(8, partes[1].length());
	        	 String valores = partes[2].substring(15,partes[2].length()-2);
	        	 valores = valores.substring(3,valores.length());
	        	 float lado = Float.parseFloat(valores);
	        	 Cuadrado cuad = new Cuadrado(nombre,lado);
	        	 figuras.add(cuad);
	         }
	         if (tipo == '2') {
	        	 String[] partes = linea.split(",");
	        	 String nombre = partes[1].substring(8, partes[1].length());
	        	 String valores = partes[2].substring(15,partes[2].length()-2);
	        	 valores = valores.substring(3,valores.length());
	        	 float lado = Float.parseFloat(valores);
	        	 Circulo circ = new Circulo(nombre,lado);
	        	 figuras.add(circ);
	         }
	         if (tipo == '3') {
	        	 String[] partes = linea.split(",");
	        	 String nombre = partes[1].substring(8, partes[1].length());
	        	 String valores = partes[2].substring(15,partes[2].length()-2);
	        	 valores = valores.substring(3,valores.length());
	        	 String lados[] =valores.split("-");
	        	 
	        	 float base = Float.parseFloat(lados[0].substring(3,valores.length()));
	        	 float altura = Float.parseFloat(lados[1].substring(3,valores.length()));
	        	 Rectangulo rectl = new Rectangulo(nombre,base,altura);
	        	 figuras.add(rectl);
	         }
	         if (tipo == '4') {
	        	 String[] partes = linea.split(",");
	        	 String nombre = partes[1].substring(8, partes[1].length());
	        	 String valores = partes[2].substring(15,partes[2].length()-2);
	        	 valores = valores.substring(3,valores.length());
	        	 String lados[] =valores.split("-");
	        	 
	        	 float base = Float.parseFloat(lados[0].substring(3,valores.length()));
	        	 float altura = Float.parseFloat(lados[1].substring(3,valores.length()));
	        	 Triangulo tri = new Triangulo(nombre,base,altura);
	        	 figuras.add(tri);
	         }
	         if (tipo == '5') {
	        	 String[] partes = linea.split(",");
	        	 String nombre = partes[1].substring(8, partes[1].length());
	        	 String valores = partes[2].substring(15,partes[2].length()-2);
	        	 valores = valores.substring(3,valores.length());
	        	 String lados[] =valores.split("-");
	        	 
	        	 int lado = Integer.parseInt(lados[0].substring(3,valores.length()));
	        	 int n_lados = Integer.parseInt(lados[1].substring(3,valores.length()));
	        	 float apotema = Float.parseFloat(lados[2].substring(3,valores.length()));
	        	 PoligonoRegular pol_reg = new PoligonoRegular(nombre,apotema,n_lados,lado);
	        	 figuras.add(pol_reg);
	         }
	         
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{

	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
		return figuras;
	}
	}
	public ArrayList<Figura> leerArchivo(){
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		
		File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      

	      try {
	         archivo = new File (this.path+this.nombreArchivo);
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         char tipo='0';
	         String linea;
	         while((linea=br.readLine())!=null)
	          tipo=linea.charAt(9);
	         if (tipo == '1') {
	        	 String[] partes = linea.split(",");
	        	 String nombre = partes[1].substring(8, partes[1].length());
	        	 String valores = partes[2].substring(15,partes[2].length()-2);
	        	 valores = valores.substring(3,valores.length());
	        	 float lado = Float.parseFloat(valores);
	        	 Cuadrado cuad = new Cuadrado(nombre,lado);
	        	 figuras.add(cuad);
	         }
	         if (tipo == '2') {
	        	 String[] partes = linea.split(",");
	        	 String nombre = partes[1].substring(8, partes[1].length());
	        	 String valores = partes[2].substring(15,partes[2].length()-2);
	        	 valores = valores.substring(3,valores.length());
	        	 float lado = Float.parseFloat(valores);
	        	 Circulo circ = new Circulo(nombre,lado);
	        	 figuras.add(circ);
	         }
	         if (tipo == '3') {
	        	 String[] partes = linea.split(",");
	        	 String nombre = partes[1].substring(8, partes[1].length());
	        	 String valores = partes[2].substring(15,partes[2].length()-2);
	        	 valores = valores.substring(3,valores.length());
	        	 String lados[] =valores.split("-");
	        	 
	        	 float base = Float.parseFloat(lados[0].substring(3,valores.length()));
	        	 float altura = Float.parseFloat(lados[1].substring(3,valores.length()));
	        	 Rectangulo rectl = new Rectangulo(nombre,base,altura);
	        	 figuras.add(rectl);
	         }
	         if (tipo == '4') {
	        	 String[] partes = linea.split(",");
	        	 String nombre = partes[1].substring(8, partes[1].length());
	        	 String valores = partes[2].substring(15,partes[2].length()-2);
	        	 valores = valores.substring(3,valores.length());
	        	 String lados[] =valores.split("-");
	        	 
	        	 float base = Float.parseFloat(lados[0].substring(3,valores.length()));
	        	 float altura = Float.parseFloat(lados[1].substring(3,valores.length()));
	        	 Triangulo tri = new Triangulo(nombre,base,altura);
	        	 figuras.add(tri);
	         }
	         if (tipo == '5') {
	        	 String[] partes = linea.split(",");
	        	 String nombre = partes[1].substring(8, partes[1].length());
	        	 String valores = partes[2].substring(15,partes[2].length()-2);
	        	 valores = valores.substring(3,valores.length());
	        	 String lados[] =valores.split("-");
	        	 
	        	 int lado = Integer.parseInt(lados[0].substring(3,valores.length()));
	        	 int n_lados = Integer.parseInt(lados[1].substring(3,valores.length()));
	        	 float apotema = Float.parseFloat(lados[2].substring(3,valores.length()));
	        	 PoligonoRegular pol_reg = new PoligonoRegular(nombre,apotema,n_lados,lado);
	        	 figuras.add(pol_reg);
	         }
	         
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{

	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
		return figuras;
	}
	
	
}


