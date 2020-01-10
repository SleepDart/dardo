package ejercicioc.calculadora3d;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class PreciosMaterial {

    public static void precios(JComboBox jcbmarca, JComboBox jcbmaterial, float gramos, JTextField tfPrecio, JTextField horas) {
       int hora =  horasl(horas);
        switch (jcbmarca.getSelectedIndex()) {
            case 0: // PrintAlot
                switch (jcbmaterial.getSelectedIndex()) {
                    case 0: // PLA
                        gramos = (gramos * 1080) / 1000;
                        tfPrecio.setText(Float.toString(gramos+hora));
                        break;
                    case 1: //PETG 
                        gramos = (gramos * 1080) / 1000;
                        tfPrecio.setText(Float.toString(gramos+hora));
                        break;
                    case 2: //Flex 
                        gramos = (gramos * 860) / 500;
                        tfPrecio.setText(Float.toString(gramos+hora));
                        break;
                    default: //ABS
                        gramos = (gramos * 860) / 500;
                        tfPrecio.setText(Float.toString(gramos+hora));
                        break;
                }
                break;
            case 1: // Plast.ar
                switch (jcbmaterial.getSelectedIndex()) {
                    case 0: // PLA
                        gramos = (gramos * 600) / 750;
                        tfPrecio.setText(Float.toString(gramos+hora));
                        break;
                    case 1: //PETG 
                        gramos = (gramos * 750) / 750;
                        tfPrecio.setText(Float.toString(gramos+hora));
                        break;
                    default: //ABS
                        gramos = (gramos * 600) / 750;
                        tfPrecio.setText(Float.toString(gramos+hora));
                        break;
                }
            case 2: // Grilon3
                switch (jcbmaterial.getSelectedIndex()) {
                    case 0: // PLA
                        gramos = (gramos * 1060) / 1000;
                        tfPrecio.setText(Float.toString(gramos+hora));
                        break;
                    case 1: //PLA+
                        gramos = (gramos * 1200) / 1000;
                        tfPrecio.setText(Float.toString(gramos+hora));
                        break;
                    case 2: //PETG
                        gramos = (gramos * 1100) / 500;
                        tfPrecio.setText(Float.toString(gramos+hora));
                        break;
                    default: //ABS
                        gramos = (gramos * 1100) / 500;
                        tfPrecio.setText(Float.toString(gramos+hora));
                        break;
                }
            default: // 3N3

                gramos = (gramos * 600) / 500;
                tfPrecio.setText(Float.toString(gramos+hora));
                break;
        }
    }

    public static int horasl(JTextField horas) {
        int hora = Integer.parseInt(horas.getText());
        hora = hora * 15;
        return hora;
    }

}
