/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConProcedure;

import interfasconsql.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;


/**
 *
 * @author XarryGames
 */
public class Procedure extends javax.swing.JFrame {

   
    public Procedure() {
	initComponents();
        cargarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conten3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtcodigo_nota = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        B_eliminarnota = new javax.swing.JButton();
        b_regresar = new javax.swing.JButton();
        B_reportenota = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_nota = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("codigoNota");

        txtcodigo_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigo_notaActionPerformed(evt);
            }
        });

        B_eliminarnota.setText("Eliminar");
        B_eliminarnota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_eliminarnotaActionPerformed(evt);
            }
        });

        b_regresar.setText("Regresar");
        b_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_regresarActionPerformed(evt);
            }
        });

        B_reportenota.setText("Reporte");
        B_reportenota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_reportenotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(B_reportenota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_eliminarnota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(B_eliminarnota, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B_reportenota)
                .addGap(28, 28, 28)
                .addComponent(b_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(102, 255, 204), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 204, 204)));

        Tabla_nota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Codigo_nota", "Nota1", "Nota2", "Nota3", "Observaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_nota);
        if (Tabla_nota.getColumnModel().getColumnCount() > 0) {
            Tabla_nota.getColumnModel().getColumn(1).setResizable(false);
            Tabla_nota.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout conten3Layout = new javax.swing.GroupLayout(conten3);
        conten3.setLayout(conten3Layout);
        conten3Layout.setHorizontalGroup(
            conten3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conten3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addComponent(txtcodigo_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        conten3Layout.setVerticalGroup(
            conten3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conten3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(conten3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(conten3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(conten3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtcodigo_nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conten3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conten3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigo_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigo_notaActionPerformed
       
    }//GEN-LAST:event_txtcodigo_notaActionPerformed

    private void b_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_regresarActionPerformed
Alumnos abrir=new Alumnos();
abrir.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_b_regresarActionPerformed

    private void B_reportenotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_reportenotaActionPerformed
try{



}catch(Exception ex){
ex.getMessage();
}
        
        
    }//GEN-LAST:event_B_reportenotaActionPerformed

    private void B_eliminarnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_eliminarnotaActionPerformed
        
        try {

            PreparedStatement ps;
            //cargar driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conexion con base de datos
            String url = "jdbc:sqlserver://localhost:1433;databaseName=escolast";
            Connection Con = DriverManager.getConnection(url, "sa", "123456");

           String codigo=txtcodigo_nota.getText();
           
            ps = Con.prepareStatement(" Delete from nota where codigo_nota =?;");
            
            ps.setString(1, codigo);
            ps.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "registro eliminado");
            
            cargarTabla();

        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en la actualizacion");
            e.printStackTrace();
        }

        
    }//GEN-LAST:event_B_eliminarnotaActionPerformed

      private void cargarTabla(){
 DefaultTableModel modeloTabla=(DefaultTableModel) Tabla_nota.getModel();
modeloTabla.setRowCount(0);
PreparedStatement ps;
ResultSet rs;
ResultSetMetaData rsmd;
int  columnas;

try{
            //cargar driver
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       //conexion con base de datos
       String url="jdbc:sqlserver://localhost:1433;databaseName=escolast";
       Connection Con=DriverManager.getConnection(url, "sa", "123456");
       
       ps= Con.prepareStatement("SELECT alumno.nombre_alu, codigo_nota,nota1_nota,nota2_nota,nota3_nota,observaciones_nota   from nota,alumno  where alumno.codigo_alu=nota.codigo_alu;");
       
       rs= ps.executeQuery();
       rsmd=rs.getMetaData();
       columnas=rsmd.getColumnCount();
       while(rs.next()){
       Object[] fila=new Object[columnas];
       for(int indice=0;indice<columnas; indice++){
       fila[indice]=rs.getObject(indice+1);
       }
       modeloTabla.addRow(fila);
       }
     
        }catch(ClassNotFoundException e){
        e.printStackTrace();  }
        catch(SQLException e){
        e.printStackTrace();       
        }
        
    
    }
    public static void main(String args[]) {
	
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new Procedure().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_eliminarnota;
    private javax.swing.JButton B_reportenota;
    private javax.swing.JTable Tabla_nota;
    private javax.swing.JButton b_regresar;
    private javax.swing.JPanel conten3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcodigo_nota;
    // End of variables declaration//GEN-END:variables
}
