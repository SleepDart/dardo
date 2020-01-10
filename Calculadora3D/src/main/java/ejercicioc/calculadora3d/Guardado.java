package ejercicioc.calculadora3d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JTextField;

public class Guardado {

    public static void guardar(JTextField nombre, JTextField gramos, JTextField horas, JTextField precio) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(nombre.getText() + ".txt")));
        bw.write("          CALCULADORA 3D BY ALPHA 3D");
        bw.newLine();
        bw.write("         " + fecha() + "               ");
        bw.newLine();
        bw.write("|||||||||||||||||||||||||||||||||||||||||||");
        bw.newLine();
        bw.write("||      Gramos:  ");
        bw.write(gramos.getText() + "                      ||");
        bw.newLine();
        bw.write("||                                       ||");
        bw.newLine();
        bw.write("||      Horas:  ");
        bw.write(horas.getText() + "                        ||");
        bw.newLine();
        bw.write("||                                       ||");
        bw.newLine();
        bw.write("||      Precio:  $");
        bw.write(precio.getText() + "                   ||");
        bw.newLine();
        bw.write("||                                       ||");
        bw.newLine();
        bw.write("|||||||||||||||||||||||||||||||||||||||||||");
        bw.flush();
        bw.close();
    }

    private static String fecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static void configFile(String ruta) throws IOException {
        Cura c = new Cura();

//Si no existe, lo crea
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(ruta + "Config.txt")));
        // Llama a la clase Cura, para obtener el Path del Cura.
        bw.write(c.buscador());
        bw.newLine();
        bw.write("false");
        bw.close();
    }

    public static String comprobación() throws FileNotFoundException, IOException {

        String dirProyecto = System.getProperty("user.dir") + "/bin/";
        File f = new File(dirProyecto);
        if (!f.exists()) {
            f.mkdir();
            configFile(dirProyecto);
        }

        BufferedReader br = new BufferedReader(new FileReader(new File(dirProyecto + "Config.txt")));
        String linea;
        String ruta = "";
        int lineaN = 0;
        while ((linea = br.readLine()) != null) {
            switch (lineaN) {
                case 0: //ruta del Cura
                    ruta = linea;

                    break;
                default: //Si el cura ya tiene ruta - BooleanoString
                    if (linea.equalsIgnoreCase("False")) {
                        configFileConfirmed(ruta, dirProyecto);
                        break;
                    }

            }

            lineaN++;

        }
        br.close();
        return ruta;
    }

    public static void configFileConfirmed(String rutacura, String ruta) throws IOException {
        Cura c = new Cura();
        File f = new File(ruta + "Config.txt");
        if (f.exists()) {
            f.delete();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(ruta + "Config.txt")));
        // Llama a la clase Cura, para obtener el Path del Cura.
        bw.write(rutacura);
        bw.newLine();
        bw.write("true");
        bw.close();
    }
    public static void preciosMateriales(){
        
        
        
        
    }
    
    
    
    
    
}
