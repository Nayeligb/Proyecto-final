package Vistas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import GestionUsuarios.Usuarios;
import GestionUsuarios.SqlConsultas;

/**
 *
 * @author Nayel
 */
public class FormuUsuario extends javax.swing.JFrame {

    public FormuUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRegisUser = new javax.swing.JTextField();
        txtRegisNombreUser = new javax.swing.JTextField();
        txtRegisApellido = new javax.swing.JTextField();
        txtRegisCorreo = new javax.swing.JTextField();
        txtRegisTelefono = new javax.swing.JTextField();
        txtRegisPassword = new javax.swing.JPasswordField();
        txtConfirPassword = new javax.swing.JPasswordField();
        btnRegistrarUser = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Registro de usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Teléfono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Confirmar contraseña:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        txtRegisUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegisUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtRegisUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 130, 30));
        getContentPane().add(txtRegisNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 130, 30));

        txtRegisApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegisApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtRegisApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 30));
        getContentPane().add(txtRegisCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 30));
        getContentPane().add(txtRegisTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 130, 30));
        getContentPane().add(txtRegisPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 130, 30));
        getContentPane().add(txtConfirPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 130, 30));

        btnRegistrarUser.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrarUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrarUser.setForeground(new java.awt.Color(255, 204, 0));
        btnRegistrarUser.setText("Registrar");
        btnRegistrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 100, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/digital-art-solid-color-wallpaper-preview.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegisUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegisUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegisUserActionPerformed

    private void txtRegisApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegisApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegisApellidoActionPerformed

    private void btnRegistrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUserActionPerformed
        SqlConsultas consu = new SqlConsultas();
        Usuarios usr = new Usuarios();
        String psword = new String(txtRegisPassword.getPassword());
        String pswordCon = new String(txtConfirPassword.getPassword());

        if (psword.equals(pswordCon)) {
            usr.setNombreUsuario(txtRegisUser.getText());
            usr.setNombre(txtRegisNombreUser.getText());
            usr.setApellido(txtRegisApellido.getText());
            usr.setPassword(psword);
            usr.setTelefono(txtRegisTelefono.getText());
            usr.setCorreo(txtRegisCorreo.getText());

            try {
                if (consu.registrousuarios(usr)) {
                     JOptionPane.showMessageDialog(null, "Registro guardado");

                    Login form = new Login();
                    form.setVisible(true);
                    this.dispose();


                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");

                }
            } catch (SQLException ex) {
                Logger.getLogger(FormuUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }


    }//GEN-LAST:event_btnRegistrarUserActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       Login log = new Login();
        log.frmFormuUser = null;
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FormuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField txtConfirPassword;
    private javax.swing.JTextField txtRegisApellido;
    private javax.swing.JTextField txtRegisCorreo;
    private javax.swing.JTextField txtRegisNombreUser;
    private javax.swing.JPasswordField txtRegisPassword;
    private javax.swing.JTextField txtRegisTelefono;
    private javax.swing.JTextField txtRegisUser;
    // End of variables declaration//GEN-END:variables
}
