/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author drdr_
 */
public class Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        button_new = new javax.swing.JButton();
        tf_status = new javax.swing.JTextField();
        button_delete = new javax.swing.JButton();
        button_save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_id_usuarios = new javax.swing.JTextField();
        button_select = new javax.swing.JButton();
        button_modify = new javax.swing.JButton();
        button_exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_password = new javax.swing.JTextField();
        tf_fecha = new javax.swing.JTextField();
        button_search = new javax.swing.JButton();
        button_print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("fecha");

        button_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/nuevo-icono-5549-32.png"))); // NOI18N
        button_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_newActionPerformed(evt);
            }
        });

        tf_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_statusActionPerformed(evt);
            }
        });

        button_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/cerrar-borrar-la-salida-icono-9027-32.png"))); // NOI18N
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });

        button_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/rss-registrarse-pantalla-18-icono-5317-32.png"))); // NOI18N
        button_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_saveActionPerformed(evt);
            }
        });

        jLabel7.setText("status");

        jLabel1.setText("id_usuarios");

        tf_id_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_id_usuariosActionPerformed(evt);
            }
        });

        button_select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/consejos-icono-6588-32.png"))); // NOI18N
        button_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_selectActionPerformed(evt);
            }
        });

        button_modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/dibujo-a-lapiz-modificar-escribir-icono-8118-32.png"))); // NOI18N
        button_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_modifyActionPerformed(evt);
            }
        });

        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/salir-de-gnome-icono-5366-32.png"))); // NOI18N
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });

        jLabel2.setText("nombre");

        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });

        jLabel4.setText("password");

        tf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passwordActionPerformed(evt);
            }
        });

        tf_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fechaActionPerformed(evt);
            }
        });

        button_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/1488951801_search.png"))); // NOI18N
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        button_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/1488951775_print.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_fecha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_password)
                            .addComponent(tf_id_usuarios)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_status))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(button_new, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_save, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_select, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_print, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(button_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_id_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_save)
                            .addComponent(button_modify, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_new))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_select)
                            .addComponent(button_exit)
                            .addComponent(button_delete)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_print)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_search)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveActionPerformed
        grabar();
    }//GEN-LAST:event_button_saveActionPerformed

    private void tf_id_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_id_usuariosActionPerformed
        String nulo = "";
        if (tf_id_usuarios.getText().equals(nulo)){
            JOptionPane.showMessageDialog(null,"El id_usuarios es requerido");
        }else{
            tf_id_usuarios.requestFocusInWindow();
        }
    }//GEN-LAST:event_tf_id_usuariosActionPerformed

    private void button_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_selectActionPerformed
        consultar();
    }//GEN-LAST:event_button_selectActionPerformed

    private void button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_exitActionPerformed
        salir();
    }//GEN-LAST:event_button_exitActionPerformed

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed
        String nulo = "";
        if (tf_nombre.getText().equals(nulo)){
            JOptionPane.showMessageDialog(null,"El nombre es requerido");
        }else{
            tf_nombre.requestFocusInWindow();
        }
    }//GEN-LAST:event_tf_nombreActionPerformed

    private void tf_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fechaActionPerformed
        String nulo = "";
        if (tf_fecha.getText().equals(nulo)){
            JOptionPane.showMessageDialog(null,"La fecha es requerido");
        }else{
            tf_fecha.requestFocusInWindow();
        }
    }//GEN-LAST:event_tf_fechaActionPerformed

    private void tf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passwordActionPerformed
        String nulo = "";
        if (tf_password.getText().equals(nulo)){
            JOptionPane.showMessageDialog(null,"El password es requerido");
        }else{
            tf_password.requestFocusInWindow();
        }
    }//GEN-LAST:event_tf_passwordActionPerformed

    private void tf_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_statusActionPerformed
        String nulo = "";
        if (tf_status.getText().equals(nulo)){
            JOptionPane.showMessageDialog(null,"El status es requerido");
        }else{
            tf_status.requestFocusInWindow();
        }
    }//GEN-LAST:event_tf_statusActionPerformed

    private void button_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_newActionPerformed
        nuevo();
    }//GEN-LAST:event_button_newActionPerformed

    private void button_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_modifyActionPerformed
        modificar();
    }//GEN-LAST:event_button_modifyActionPerformed

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
        borrar();
    }//GEN-LAST:event_button_deleteActionPerformed

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        Usuarios_table ut = new Usuarios_table();
        ut.setVisible(true);
    }//GEN-LAST:event_button_searchActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }
    
    private void nuevo(){
        tf_fecha.setText("");
        tf_id_usuarios.setText("");
        tf_nombre.setText("");
        tf_password.setText("");
        tf_status.setText("");
    }
    
    private void grabar() {
        String fecha = tf_fecha.getText();
        String id_usuarios = tf_id_usuarios.getText();
        String nombre = tf_nombre.getText();
        String password = tf_password.getText();
        String status = tf_status.getText();
        
        String sql = "insert into usuarios(id_usuarios,nombre,password,fecha,status) values ("
                + id_usuarios + ","
                + "\"" + nombre + "\","
                + "\"" + password + "\","
                + "\"" + fecha + "\","
                + "\"" + status + "\""
                + ")";
        
        connect_and_catch(sql, "Registro dado de alta con exito");                            
    }
    
    private void modificar() {
        String fecha = tf_fecha.getText();
        String id_usuarios = tf_id_usuarios.getText();
        String nombre = tf_nombre.getText();
        String password = tf_password.getText();
        String status = tf_status.getText();
        
        String sql = "update usuarios set "
                + " nombre = " + "\"" + nombre + "\","
                + " password = " + "\"" + password + "\","
                + " fecha = " + "\"" + fecha + "\","
                + " status = " + "\"" + status + "\"" 
                + " where id_usuarios = " + id_usuarios + ";";
        
        connect_and_catch(sql, "Registro modificado con exito");        
    }
    
    private void borrar() {
        String id = tf_id_usuarios.getText();        
        String sql = "delete from usuarios where id_usuarios = "
                + id + ";";        
        connect_and_catch(sql,"Registro borrado con exito");        
    }
    
    private void consultar() {
        String id = tf_id_usuarios.getText();
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            String cadena = "jdbc:mysql://localhost/fpoo?user=root&password=qonmqa3p";
            Connection con = (Connection) DriverManager.getConnection(cadena);            
            PreparedStatement stmt = null;            
            
            ResultSet table;           
            String sql = "select * from usuarios where "
                    + "id_usuarios = " + id;                    
            stmt = con.prepareStatement(sql);            
            table = stmt.executeQuery();        
            while (table.next()){
                tf_nombre.setText(table.getString(2));  
                tf_password.setText(table.getString(3));  
                tf_fecha.setText(table.getString(4));  
                tf_status.setText(table.getString(5));  
            }
            
        }catch(ClassNotFoundException e1){
            JOptionPane.showMessageDialog(null,e1);
        }catch(SQLException e2){
            JOptionPane.showMessageDialog(null,e2);
        }catch(Exception e3){
            JOptionPane.showMessageDialog(null,e3);
        }
    }
    
    private void salir() {
        this.setVisible(false);
    }
    
    private void connect_and_catch(String sql, String mensaje){
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            String cadena = "jdbc:mysql://localhost/fpoo?user=root&password=qonmqa3p";
            Connection con = (Connection) DriverManager.getConnection(cadena);            
            PreparedStatement stmt = null;            
            stmt=con.prepareStatement(sql);
            int sw=stmt.executeUpdate();            
            if(sw!=0){
                JOptionPane.showMessageDialog(null,mensaje);
                nuevo();
            }                        
        }catch(ClassNotFoundException e1){
            JOptionPane.showMessageDialog(null,e1);
        }catch(SQLException e2){
            JOptionPane.showMessageDialog(null,e2);
        }catch(Exception e3){
            JOptionPane.showMessageDialog(null,e3);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_delete;
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_modify;
    private javax.swing.JButton button_new;
    private javax.swing.JButton button_print;
    private javax.swing.JButton button_save;
    private javax.swing.JButton button_search;
    private javax.swing.JButton button_select;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tf_fecha;
    private javax.swing.JTextField tf_id_usuarios;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_status;
    // End of variables declaration//GEN-END:variables
}
