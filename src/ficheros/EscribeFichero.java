package ficheros;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribeFichero
{
    public static void main(String[] args)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
        	String path = System.getProperty("user.dir")+"\\src\\ficheros\\escritura.txt";
            fichero = new FileWriter(path);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++)
                pw.println("Casas " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        System.out.println("finalizo felizmente");
    }
}