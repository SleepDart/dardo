package ejercicioc.calculadora3d;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
Cura c;
    PreciosMaterial pm;
    Guardado g;
 
 
        
    public Principal() throws IOException, InterruptedException, URISyntaxException {
        c = new Cura();
        //Comprobación chequea si existe una ruta para iniciar el Cura
        
        //Abrir: Abre el cura
        String ruta = g.comprobación();
        
        c.abrir(ruta);
        Image icon = Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "/Imagenes/calc.png"); 
        setIconImage(icon);
        initComponents();
        pm = new PreciosMaterial();
        g = new Guardado();
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lbcp3d = new javax.swing.JLabel();
        tfgramos = new javax.swing.JTextField();
        lbgramos = new javax.swing.JLabel();
        jcbmarca = new javax.swing.JComboBox<>();
        lbmarca = new javax.swing.JLabel();
        jcbmaterial = new javax.swing.JComboBox<>();
        lbmaterial = new javax.swing.JLabel();
        tfnombre = new javax.swing.JTextField();
        lbna = new javax.swing.JLabel();
        btncosto = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        tfcosto = new javax.swing.JTextField();
        lbcosto = new javax.swing.JLabel();
        lbch = new javax.swing.JLabel();
        tfhoras = new javax.swing.JTextField();
        tfganancia = new javax.swing.JTextField();
        lbganancia = new javax.swing.JLabel();
        tfprecio = new javax.swing.JTextField();
        lbprecio = new javax.swing.JLabel();
        btnganancia = new javax.swing.JButton();
        btnMateriales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(31, 36, 39));
        panelPrincipal.setForeground(new java.awt.Color(31, 36, 39));

        lbcp3d.setBackground(new java.awt.Color(255, 255, 255));
        lbcp3d.setForeground(new java.awt.Color(255, 255, 255));
        lbcp3d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbcp3d.setText("Calculadora de Precios 3D");

        tfgramos.setBackground(new java.awt.Color(204, 204, 204));

        lbgramos.setForeground(new java.awt.Color(255, 255, 255));
        lbgramos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbgramos.setText("Gramos");

        jcbmarca.setBackground(new java.awt.Color(204, 204, 204));
        jcbmarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PrintALot", "Plast.Ar", "Grilon3", "3N3", " ", " " }));
        jcbmarca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcbmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbmarcaActionPerformed(evt);
            }
        });

        lbmarca.setForeground(new java.awt.Color(255, 255, 255));
        lbmarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmarca.setText("Marca");

        jcbmaterial.setBackground(new java.awt.Color(204, 204, 204));
        jcbmaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PLA", "PLA+", "PETG", "FLEX", "ABS" }));

        lbmaterial.setForeground(new java.awt.Color(255, 255, 255));
        lbmaterial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmaterial.setText("Material");

        tfnombre.setBackground(new java.awt.Color(204, 204, 204));

        lbna.setForeground(new java.awt.Color(255, 255, 255));
        lbna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbna.setText("Nombre del Archivo");

        btncosto.setBackground(new java.awt.Color(153, 153, 153));
        btncosto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncosto.setForeground(new java.awt.Color(31, 36, 39));
        btncosto.setText("Calculara Costo");
        btncosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncostoActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(153, 153, 153));
        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnguardar.setText("Guardar Datos");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        tfcosto.setBackground(new java.awt.Color(204, 204, 204));

        lbcosto.setForeground(new java.awt.Color(255, 255, 255));
        lbcosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbcosto.setText("Costo");

        lbch.setForeground(new java.awt.Color(255, 255, 255));
        lbch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbch.setText("Cantidad de Horas");

        tfhoras.setBackground(new java.awt.Color(204, 204, 204));

        tfganancia.setBackground(new java.awt.Color(204, 204, 204));

        lbganancia.setForeground(new java.awt.Color(255, 255, 255));
        lbganancia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbganancia.setText("Ganancia");

        tfprecio.setBackground(new java.awt.Color(204, 204, 204));

        lbprecio.setForeground(new java.awt.Color(255, 255, 255));
        lbprecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbprecio.setText("Precio");

        btnganancia.setBackground(new java.awt.Color(153, 153, 153));
        btnganancia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnganancia.setText("Calcular Ganancia");
        btnganancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngananciaActionPerformed(evt);
            }
        });

        btnMateriales.setText("Materiales");
        btnMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaterialesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfganancia)
                    .addComponent(tfgramos, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbgramos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btncosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfcosto)
                            .addComponent(lbcosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbganancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbprecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbcp3d, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfnombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbna, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfhoras, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfprecio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnganancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbmaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbmaterial, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbmarca, javax.swing.GroupLayout.Alignment.LEADING, 0, 105, Short.MAX_VALUE)
                        .addComponent(lbmarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnMateriales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbcp3d)
                .addGap(13, 13, 13)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbgramos)
                    .addComponent(lbmarca)
                    .addComponent(lbna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfgramos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbmaterial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbcosto)
                            .addComponent(lbch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfhoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbganancia)
                    .addComponent(lbprecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfganancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMateriales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncosto)
                    .addComponent(btnguardar)
                    .addComponent(btnganancia))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbmarcaActionPerformed

        ActionListener escuchar = new ActionListener() {
       
            @Override
            public void actionPerformed(ActionEvent e) {
                int item = jcbmarca.getSelectedIndex();
                switch (item) {
                    case 0: //PrintALot
                        jcbmaterial.removeAllItems();
                        jcbmaterial.addItem("PLA");
                        jcbmaterial.addItem("PETG");
                        jcbmaterial.addItem("FLEX");
                        jcbmaterial.addItem("ABS");
                        break;
                    case 1: //Plast.Ar
                        jcbmaterial.removeAllItems();
                        jcbmaterial.addItem("PLA");
                        jcbmaterial.addItem("PETG");
                        jcbmaterial.addItem("ABS");
                        break;
                    case 2: //Grilon3
                        jcbmaterial.removeAllItems();
                        jcbmaterial.addItem("PLA");
                        jcbmaterial.addItem("PLA+");
                        jcbmaterial.addItem("PETG");
                        jcbmaterial.addItem("ABS");
                        jcbmaterial.addItem("FLEX");
                        break;
                    default: //3N3
                        jcbmaterial.removeAllItems();
                        jcbmaterial.addItem("PLA");
                        break;

                }
            }

        };
         jcbmarca.addActionListener(escuchar);
    }//GEN-LAST:event_jcbmarcaActionPerformed

    private void btncostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncostoActionPerformed
        if (tfgramos.getText().isEmpty() || tfhoras.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los campos Gramos y horas deben estar rellenos", "ESPERE", JOptionPane.INFORMATION_MESSAGE);
        } else {
            float gramos = Integer.parseInt(tfgramos.getText());

            pm.precios(jcbmarca, jcbmaterial, gramos, tfcosto, tfhoras);

        }
    }//GEN-LAST:event_btncostoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
       if ((tfgramos.getText().isEmpty())||(tfhoras.getText().isEmpty())||(tfnombre.getText().isEmpty())||(tfcosto.getText().isEmpty())||(tfganancia.getText().isEmpty())||(tfprecio.getText().isEmpty())){
           JOptionPane.showMessageDialog(this, "Los campos Gramos, Horas, Nombre del archivo y Precio, deben estar rellenos", "ESPERE", JOptionPane.INFORMATION_MESSAGE);
       } else{
        
        
        try {
           g.guardar(tfnombre, tfgramos, tfhoras,tfprecio);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btngananciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngananciaActionPerformed
       if ((tfprecio.getText().isEmpty())||(tfcosto.getText().isEmpty())||(tfhoras.getText().isEmpty())||(tfgramos.getText().isEmpty())){
        JOptionPane.showMessageDialog(this, "Los campos Precio y costo, deben estar rellenos", "ESPERE", JOptionPane.INFORMATION_MESSAGE);   
             }  else {
           float precio = Float.parseFloat(tfprecio.getText());
           float costo = Float.parseFloat(tfcosto.getText());
           float ganancia = precio - costo;
           tfganancia.setText(Float.toString(ganancia));
       }
       
       
    }//GEN-LAST:event_btngananciaActionPerformed

    private void btnMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaterialesActionPerformed
     
    }//GEN-LAST:event_btnMaterialesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
        });
    }
    
    
    private static String imagen(){
         String icono= System.getProperty("user.dir") + "/Imagenes/calc.png";
        String image=icono;
        return image;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMateriales;
    private javax.swing.JButton btncosto;
    private javax.swing.JButton btnganancia;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> jcbmarca;
    private javax.swing.JComboBox<String> jcbmaterial;
    private javax.swing.JLabel lbch;
    private javax.swing.JLabel lbcosto;
    private javax.swing.JLabel lbcp3d;
    private javax.swing.JLabel lbganancia;
    private javax.swing.JLabel lbgramos;
    private javax.swing.JLabel lbmarca;
    private javax.swing.JLabel lbmaterial;
    private javax.swing.JLabel lbna;
    private javax.swing.JLabel lbprecio;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField tfcosto;
    private javax.swing.JTextField tfganancia;
    private javax.swing.JTextField tfgramos;
    private javax.swing.JTextField tfhoras;
    private javax.swing.JTextField tfnombre;
    private javax.swing.JTextField tfprecio;
    // End of variables declaration//GEN-END:variables
}
