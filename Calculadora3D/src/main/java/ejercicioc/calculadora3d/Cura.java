package ejercicioc.calculadora3d;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;



public class Cura {
Guardado g;
    public static void abrir(String ruta) throws IOException, InterruptedException {

        // Running the above command 
        Runtime run = Runtime.getRuntime();
        Process proc = run.exec(ruta);
        proc.waitFor(20, TimeUnit.SECONDS);
    }
    
    public static String buscador(){
        File archivo = new File(" ");
    JFileChooser busca = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int ruta = busca.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (ruta == JFileChooser.APPROVE_OPTION) {
			archivo = busca.getSelectedFile();
			
		}
                        return archivo.getAbsolutePath();
	}
    
}
    
  
