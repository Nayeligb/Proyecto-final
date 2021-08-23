/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import GestionUsuarios.Conexion;
import com.mysql.cj.xdevapi.Statement;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestUsuarios extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection conec = con.getConexion();
    int clic_tabla = 0;

    public GestUsuarios() {
        initComponents();

        try {
            DefaultTableModel table = new DefaultTableModel();
            tblUsuarios.setModel(table);

            PreparedStatement prep = null;
            ResultSet resul = null;

            Conexion con = new Conexion();
            Connection conec = con.getConexion();

            String sql = "SELECT Id, NombreUsuario, Nombre, Apellido, Telefono, Correo, Contraseña FROM registrousuarios ";

            prep = conec.prepareStatement(sql);
            resul = prep.executeQuery();

            ResultSetMetaData rsd = resul.getMetaData();
            int cantColum = rsd.getColumnCount();

            table.addColumn("Id");
            table.addColumn("Nombre Usuario");
            table.addColumn("Nombre");
            table.addColumn("Apellido");
            table.addColumn("Telefono");
            table.addColumn("Correo");
            table.addColumn("Contraseña");

            while (resul.next()) {

                Object[] filas = new Object[cantColum];

                for (int i = 0; i < cantColum; i++) {

                    filas[i] = resul.getObject(i + 1);
                }

                table.addRow(filas);

            }
            this.dispose();

        } catch (SQLException ex) {

            System.err.println(ex.toString());

        }

    }

    public void mostrar() {

        try {
            DefaultTableModel table = new DefaultTableModel();
            tblUsuarios.setModel(table);

            PreparedStatement prep = null;
            ResultSet resul = null;

            String sql = "SELECT * FROM registroUsuarios ";

            prep = conec.prepareStatement(sql);
            resul = prep.executeQuery();

            ResultSetMetaData rsd = resul.getMetaData();
            int cantColum = rsd.getColumnCount();

            table.addColumn("Id");
            table.addColumn("Nombre Usuario");
            table.addColumn("Nombre");
            table.addColumn("Apellido");
            table.addColumn("Telefono");
            table.addColumn("Correo");
            table.addColumn("Contraseña");

            while (resul.next()) {

                Object[] filas = new Object[cantColum];

                for (int i = 0; i < cantColum; i++) {

                    filas[i] = resul.getObject(i + 1);
                }

                table.addRow(filas);

            }

        } catch (SQLException ex) {

            System.err.println(ex.toString());

        }

    }

    public void Modificar() {
//eliminaste coneccion
        int fila = tblUsuarios.getSelectedRow();

        int id = Integer.parseInt(this.tblUsuarios.getValueAt(fila, 0).toString());
        String NombreUsuario = tblUsuarios.getValueAt(fila, 1).toString();
        String nombre = tblUsuarios.getValueAt(fila, 2).toString();
        String apellido = tblUsuarios.getValueAt(fila, 3).toString();
        String telefono = tblUsuarios.getValueAt(fila, 4).toString();
        String correo = tblUsuarios.getValueAt(fila, 5).toString();
        String contrase = tblUsuarios.getValueAt(fila, 6).toString();

        try {

            PreparedStatement pt = conec.prepareStatement("UPDATE registrousuarios SET NombreUsuario='" + NombreUsuario + "',Nombre='" + nombre + "',Apellido='" + apellido + "',Telefono='" + telefono + "',Correo='" + correo + "',Contraseña='" + contrase + "' WHERE Id = '" + id + "' ");
            pt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario actualizado");
            mostrar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "No se logro actualizar");
        }
    }

    public void Eliminar() {

        int fila = tblUsuarios.getSelectedRow();
        String valor = tblUsuarios.getValueAt(fila, 0).toString();

        try {
            PreparedStatement elim = conec.prepareStatement("DELETE FROM registroUsuarios WHERE Id = '" + valor + "'");
            elim.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario eliminado");
            mostrar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "Error al eliminar");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 470));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre de usuario", "Nombre", "Apellido", "Telefono", "Correo", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(1).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(2).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(3).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(4).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(5).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 550, 232));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gestion de Usuarios");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/atras1.png"))); // NOI18N
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRegresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 100, 90));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar32.png"))); // NOI18N
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar32.png"))); // NOI18N
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar38.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 80, 50));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnModificar.setToolTipText("");
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 70, 70));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/el-fondo-de-papel-azul-y-rosado-se-divide-verticalmente-por-la-mitad-mitades-del-concepto-dos-hombre-mujer-copie-espacio-para-145096700.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 610, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        
        Eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Login form = new Login();
        form.setVisible(true);
        this.dispose();

        Login frmLog = new Login();
        frmLog.setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Inicio form = new Inicio();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        Modificar();

    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(GestUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
