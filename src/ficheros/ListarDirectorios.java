package ficheros;

import java.io.File;

public class ListarDirectorios {

	public ListarDirectorios() {}

	public static void main(String[] args) {
		String path = System.getProperty("user.dir")+"\\src\\ficheros";
		File dir = new File(path);
		String[] ficheros = dir.list();
		if (ficheros == null)
			  System.out.println("No hay ficheros en el directorio especificado");
			else { 
			  for (int x=0;x<ficheros.length;x++)
			    System.out.println(ficheros[x]);
			}
		

	}

}
