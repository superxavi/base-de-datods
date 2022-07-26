package ConProcedure;

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

public class la_ultima extends javax.swing.JFrame {

    public la_ultima() {
        initComponents();
        cargarTabla();

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
        B_notas = new javax.swing.JButton();
        B_reporte = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_alum = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        B_eliminar_est = new javax.swing.JButton();

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

        B_notas.setText("Notas");
        B_notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_notasActionPerformed(evt);
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
                    .addComponent(B_actualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_notas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(B_notas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_reporte)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(102, 255, 204), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 204, 204)));

        Tabla_alum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo_alumno", "Cedula_alumono", "Nombre", "Sexo_alumno", "Fecha_nacimiento", "Direccion", "Telefono", "Email", "Observaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_alum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_alumMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_alum);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
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
                                    .addComponent(txtobservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                    .addComponent(txtemail)
                                    .addComponent(txttelefono)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenLayout.createSequentialGroup()
                                        .addComponent(txtFecha)
                                        .addGap(93, 93, 93))
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contenLayout.setVerticalGroup(
            contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenLayout.createSequentialGroup()
                        .addGroup(contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
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
                                    .addComponent(txtobservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                .addComponent(B_eliminar_est)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(conten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigo_aluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigo_aluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigo_aluActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void B_guardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_guardaActionPerformed

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
            
            Date fechatxt = null;
            try {
                java.util.Date nfecha = formato.parse(fecha);
                fechatxt = new java.sql.Date(nfecha.getTime());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Eroror en fecha dia/mes/año");
                Logger.getLogger(la_ultima.class.getName()).log(Level.SEVERE, null, ex);
            }
            ps = Con.prepareStatement("exec sp_insertar1 ?,?,?,?,?,?,?,?,?;");
            ps.setString(1, codigo);
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

        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en el ingreso ps");
            e.printStackTrace();
        }
limpiar();
cargarTabla();

    }//GEN-LAST:event_B_guardaActionPerformed

    private void B_notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_notasActionPerformed
        Procedure abrir = new Procedure();
        abrir.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_B_notasActionPerformed

    private void B_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_reporteActionPerformed

    try {

            PreparedStatement ps = null;
            //cargar driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conexion con base de datos
            String url = "jdbc:sqlserver://localhost:1433;databaseName=escolast";
            Connection Con = DriverManager.getConnection(url, "sa", "123456");
            
            JasperReport report = null ;
    JasperPrint jprint = null ;
    
        try {
            //report = (JasperReport) JRLoader.loadObject(getClass().getResource("/reporte/xarry.jasper"));
            report = (JasperReport) JRLoader.loadObject(getClass().getResource("/reporte/Cherry.jasper"));
        } catch (JRException ex) {
            Logger.getLogger(la_ultima.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            jprint = JasperFillManager.fillReport(report,null,getConexion());
        } catch (JRException ex) {
            Logger.getLogger(la_ultima.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        if(jprint!=null){
        
        JasperViewer viev = new JasperViewer(jprint,false);
        viev.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        viev.setVisible(true);
        }
        
            

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Reporte genrado");

        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en el reporte");
            e.printStackTrace();
        }
    }//GEN-LAST:event_B_reporteActionPerformed

    
    
    private void B_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_limpiarActionPerformed
        limpiar();


    }//GEN-LAST:event_B_limpiarActionPerformed

    private void Tabla_alumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_alumMouseClicked
        

    }//GEN-LAST:event_Tabla_alumMouseClicked

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
                Logger.getLogger(la_ultima.class.getName()).log(Level.SEVERE, null, ex);
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
            cargarTabla();

        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en la actualizacion");
            e.printStackTrace();
        }

       
    }//GEN-LAST:event_B_actualizarActionPerformed

    private void B_eliminar_estActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_eliminar_estActionPerformed
        PreparedStatement ps;
        try {
            try {
                //ConexionBDD Con=new ConexionBDD();
                //Con.getConexion();
                //cargar driver
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(la_ultima.class.getName()).log(Level.SEVERE, null, ex);
            }
            //conexion con base de datos
            String url = "jdbc:sqlserver://localhost:1433;databaseName=escolast";
            Connection Con = DriverManager.getConnection(url, "sa", "123456");
            String codigo=txtEliminar.getText();
            
            
            ps =Con.prepareStatement("Delete from alumno where codigo_alu =?;");
            ps.setString(1,codigo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "registro eliminado");
            
            cargarTabla();
            
        } catch (SQLException ex) {
            Logger.getLogger(la_ultima.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_B_eliminar_estActionPerformed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) Tabla_alum.getModel();
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            //cargar driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conexion con base de datos
            String url = "jdbc:sqlserver://localhost:1433;databaseName=escolast";
            Connection Con = DriverManager.getConnection(url, "sa", "123456");

            ps = Con.prepareStatement("exec sp_listar;");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

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
            java.util.logging.Logger.getLogger(la_ultima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(la_ultima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(la_ultima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(la_ultima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new la_ultima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_actualizar;
    private javax.swing.JButton B_eliminar_est;
    private javax.swing.JButton B_guarda;
    private javax.swing.JButton B_limpiar;
    private javax.swing.JButton B_notas;
    private javax.swing.JButton B_reporte;
    private javax.swing.JRadioButton F;
    private javax.swing.JRadioButton M;
    private javax.swing.JTable Tabla_alum;
    private javax.swing.JPanel conten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
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
