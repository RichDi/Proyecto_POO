/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.*;



/**
 *
 * @author drdr_
 */
public class Genero extends javax.swing.JFrame {

    /**
     * Creates new form Genero
     */
    public Genero() {
        initComponents();
    }
    
    public Genero(int sw) {
        initComponents();
        tf_genero.setText(String.valueOf(sw));        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_descripcion = new javax.swing.JTextField();
        tf_genero = new javax.swing.JTextField();
        button_new = new javax.swing.JButton();
        button_delete = new javax.swing.JButton();
        button_save = new javax.swing.JButton();
        button_select = new javax.swing.JButton();
        button_modify = new javax.swing.JButton();
        button_exit = new javax.swing.JButton();
        button_search = new javax.swing.JButton();
        button_print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("id_genero");

        jLabel8.setText("descripcion");

        tf_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_descripcionActionPerformed(evt);
            }
        });

        tf_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_generoActionPerformed(evt);
            }
        });

        button_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/nuevo-icono-5549-32.png"))); // NOI18N
        button_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_newActionPerformed(evt);
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

        button_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/1488951801_search.png"))); // NOI18N
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        button_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/1488951775_print.png"))); // NOI18N
        button_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_genero)
                    .addComponent(tf_descripcion))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_new, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(button_print, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveActionPerformed
        grabar();
    }//GEN-LAST:event_button_saveActionPerformed

    private void button_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_selectActionPerformed
        consultar();
    }//GEN-LAST:event_button_selectActionPerformed

    private void button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_exitActionPerformed
        salir();
    }//GEN-LAST:event_button_exitActionPerformed

    private void button_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_newActionPerformed
        nuevo();
    }//GEN-LAST:event_button_newActionPerformed

    private void tf_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_generoActionPerformed
        
        String nulo = "";
        if (tf_genero.getText().equals(nulo)){
            JOptionPane.showMessageDialog(null,"El genero es requerido");
        }else{
            tf_genero.requestFocusInWindow();
        }
        
    }//GEN-LAST:event_tf_generoActionPerformed

    private void button_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_modifyActionPerformed
        modificar();
    }//GEN-LAST:event_button_modifyActionPerformed

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
        borrar();
    }//GEN-LAST:event_button_deleteActionPerformed

    private void tf_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_descripcionActionPerformed
        
        String nulo = "";
        if (tf_descripcion.getText().equals(nulo)){
            JOptionPane.showMessageDialog(null,"La descripcion es requerida es requerido");
        }else{
            tf_descripcion.requestFocusInWindow();
        }
    }//GEN-LAST:event_tf_descripcionActionPerformed

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        Genero_table gw = new Genero_table();
        gw.setVisible(true);
    }//GEN-LAST:event_button_searchActionPerformed

    private void button_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_printActionPerformed

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
            java.util.logging.Logger.getLogger(Genero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Genero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Genero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Genero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Genero().setVisible(true);
            }
        });
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tf_descripcion;
    private javax.swing.JTextField tf_genero;
    // End of variables declaration//GEN-END:variables

    private void nuevo() {
        tf_genero.setText("");
        tf_descripcion.setText("");
    }
    
    private void grabar() {
        String genero = tf_genero.getText();
        String descripcion = tf_descripcion.getText();
        
        String sql = "insert into generos(id_generos,descripcion) values ("
                + genero + ","
                + "\"" + descripcion + "\")";
        
        connect_and_catch(sql, "Registro dado de alta con exito");                            
    }
    
    private void modificar() {
        String genero = tf_genero.getText();
        String descripcion = tf_descripcion.getText();
        
        String sql = " update generos set"
                + " descripcion = " + "\"" + descripcion + "\""
                + " where id_generos = " + genero;
        
        connect_and_catch(sql,"Reigstro modificado con exito");
    }
    
    private void borrar() {
        String genero = tf_genero.getText();        
        String sql = "delete from generos where id_generos = "
                + genero + ";";        
        connect_and_catch(sql,"Registro borrado con exito");        
    }
    
    private void consultar() {
        String id = tf_genero.getText();
        
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            String cadena = "jdbc:mysql://localhost/fpoo?user=root&password=qonmqa3p";
            Connection con = (Connection) DriverManager.getConnection(cadena);            
            PreparedStatement stmt = null;            
            
            ResultSet table;           
            String sql = "select * from generos where "
                    + "id_generos = " + id;                    
            stmt = con.prepareStatement(sql);            
            table = stmt.executeQuery();        
            while (table.next()){
                tf_descripcion.setText(table.getString(2));                
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
}