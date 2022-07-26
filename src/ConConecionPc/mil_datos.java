package ConConecionPc;

import interfasconsql.*;
import static interfasconsql.InterfasConSQL.getConexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class mil_datos extends javax.swing.JFrame {

    public mil_datos() {
        initComponents();
       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conten = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo_alu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        M = new javax.swing.JRadioButton();
        F = new javax.swing.JRadioButton();
        txtemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtobservaciones = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        B_guarda = new javax.swing.JButton();
        B_actualizar = new javax.swing.JButton();
        B_limpiar = new javax.swing.JButton();
        B_reporte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        B_eliminar_est = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        max = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("codigo");

        txtcodigo_alu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigo_aluActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre:");

        jLabel3.setText("Cedula_Alum:");

        jLabel5.setText("Sexo:");

        M.setText("Masculino");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        F.setText("Femina");

        jLabel7.setText("Direccion:");

        jLabel8.setText("Telefono:");

        jLabel9.setText("email_alu:");

        jLabel10.setText("Observaciones:");

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        B_guarda.setText("Guardar");
        B_guarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_guardaActionPerformed(evt);
            }
        });

        B_actualizar.setText("Actualizar");
        B_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_actualizarActionPerformed(evt);
            }
        });

        B_limpiar.setText("Limpiar");
        B_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_limpiarActionPerformed(evt);
            }
        });

        B_reporte.setText("Reporte");
        B_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_reporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(B_reporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_guarda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_limpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_actualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(B_guarda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_actualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_reporte)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        jLabel1.setText("Fecha");

        jLabel6.setText("Solo para eliminar");

        txtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarActionPerformed(evt);
            }
        });

        jLabel11.setText("Codigo");

        B_eliminar_est.setText("Eliminar");
        B_eliminar_est.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_eliminar_estActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenLayout = new javax.swing.GroupLayout(conten);
        conten.setLayout(contenLayout);
        contenLayout.setHorizontalGroup(
            contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenLayout.createSequentialGroup()
                .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenLayout.createSequentialGroup()
                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(M)
                                        .addGap(32, 32, 32)
                                        .addComponent(F))
                                    .addGroup(contenLayout.createSequentialGroup()
                                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                            .addComponent(txtcedula)
                                            .addComponent(txtcodigo_alu)))))
                            .addGroup(contenLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtobservaciones)
                                    .addComponent(txtemail)
                                    .addComponent(txttelefono)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenLayout.createSequentialGroup()
                                        .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                        .addGap(93, 93, 93))
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B_eliminar_est))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenLayout.createSequentialGroup()
                            .addGap(203, 203, 203)
                            .addComponent(jLabel6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenLayout.setVerticalGroup(
            contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenLayout.createSequentialGroup()
                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtcodigo_alu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(M)
                            .addComponent(F))
                        .addGap(18, 18, 18)
                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(contenLayout.createSequentialGroup()
                                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtobservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(contenLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(B_eliminar_est)))
                .addContainerGap())
        );

        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel12)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(7, 7, 7)
                .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conten, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_eliminar_estActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_eliminar_estActionPerformed
       

    }//GEN-LAST:event_B_eliminar_estActionPerformed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void B_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_reporteActionPerformed

        Tabla2 abrir = new Tabla2();
        abrir.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_B_reporteActionPerformed

    private void B_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_limpiarActionPerformed
        limpiar();

    }//GEN-LAST:event_B_limpiarActionPerformed

    private void B_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_actualizarActionPerformed
        try {

            PreparedStatement ps;
            //cargar driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conexion con base de datos
            String url = "jdbc:sqlserver://localhost:1433;databaseName=escolast";
            Connection Con = DriverManager.getConnection(url, "sa", "123456");

            String codigo = txtcodigo_alu.getText();
            String cedula = txtcedula.getText();
            String nombre = txtnombre.getText();
            String sexo;

            String fecha = txtFecha.getText();
            String Direccion = txtdireccion.getText();
            String Telefono = txttelefono.getText();
            String Email = txtemail.getText();
            String Observaciones = txtobservaciones.getText();
            if (M.isSelected() == true) {
                sexo = "Masculino";
            } else if (F.isSelected() == true) {
                sexo = "Femenino";

            } else {
                sexo = "Masculino";
            }
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            //String fechaPrueba="29/10/2022";
            Date fechatxt = null;
            try {
                java.util.Date nfecha = formato.parse(fecha);
                fechatxt = new java.sql.Date(nfecha.getTime());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Eroror en fecha dia/mes/año");
                Logger.getLogger(mil_datos.class.getName()).log(Level.SEVERE, null, ex);
            }
            ps = Con.prepareStatement("exec sp_Actualizar '?','?','?','?','?','?','?','?','?';");

            ps.setString(1, cedula);
            ps.setString(2, nombre);
            ps.setString(3, sexo);
            ps.setDate(4, fechatxt);
            ps.setString(5, Direccion);
            ps.setString(6, Telefono);
            ps.setString(7, Email);
            ps.setString(8, Observaciones);
            ps.setString(9, codigo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "registro modificado");
            limpiar();

        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en la actualizacion");
            e.printStackTrace();
        }

    }//GEN-LAST:event_B_actualizarActionPerformed

    private void B_guardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_guardaActionPerformed
for(int i=1;i<10;i++){
        try {

            PreparedStatement ps;
            //cargar driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conexion con base de datos
            String url = "jdbc:sqlserver://localhost:1433;databaseName=escolast";
            Connection Con = DriverManager.getConnection(url, "sa", "123456");
int n;
            String m = max.getText();
            n=Integer.parseInt(m);
            String codigo =null;
            String cedula = txtcedula.getText();
            String nombre = txtnombre.getText();
            String sexo;

            String fecha = txtFecha.getText();
            String Direccion = txtdireccion.getText();
            String Telefono = txttelefono.getText();
            String Email = txtemail.getText();
            String Observaciones = txtobservaciones.getText();
            if (M.isSelected() == true) {
                sexo = "Masculino";
            } else if (F.isSelected() == true) {
                sexo = "Femenino";

            } else {
                sexo = "Masculino";
            }
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            Date fechatxt = null;
            try {
                java.util.Date nfecha = formato.parse(fecha);
                fechatxt = new java.sql.Date(nfecha.getTime());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Eroror en fecha dia/mes/año");
                Logger.getLogger(mil_datos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
                
            ps = Con.prepareStatement("exec sp_insertar1 ?,?,?,?,?,?,?,?,?;");
            ps.setString(1, codigo=Integer.toString(i));
            ps.setString(2, cedula);
            ps.setString(3, nombre);
            ps.setString(4, sexo);
            ps.setDate(5, fechatxt);
            ps.setString(6, Direccion);
            ps.setString(7, Telefono);
            ps.setString(8, Email);
            ps.setString(9, Observaciones);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "registro ps guardado");

                      
            i=Integer.parseInt(codigo);
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en el ingreso ps");
            e.printStackTrace();
        }
       
        
}
    }//GEN-LAST:event_B_guardaActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MActionPerformed

    private void txtcodigo_aluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigo_aluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigo_aluActionPerformed

    
    
    

    private void limpiar() {
        txtcodigo_alu.setText("");
        txtcedula.setText("");
        txtnombre.setText("");
        txtFecha.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtemail.setText("");
        txtobservaciones.setText("");
    }

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mil_datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_actualizar;
    private javax.swing.JButton B_eliminar_est;
    private javax.swing.JButton B_guarda;
    private javax.swing.JButton B_limpiar;
    private javax.swing.JButton B_reporte;
    private javax.swing.JRadioButton F;
    private javax.swing.JRadioButton M;
    private javax.swing.JPanel conten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField max;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigo_alu;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtobservaciones;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
