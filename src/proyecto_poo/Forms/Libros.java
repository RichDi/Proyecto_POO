/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo.Forms;

import proyecto_poo.Tables.Libros_table;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author drdr_
 */
public class Libros extends javax.swing.JFrame {

    private static String user;
    private static String password;
    /**
     * Creates new form Libros
     */
    public Libros(String user, String password) {
        initComponents();
        this.user = user;
        this.password = password;
        setLocationRelativeTo(null);
    }
    public Libros(int a, String user, String password) {
        initComponents();
        this.user = user;
        this.password = password;
        setLocationRelativeTo(null);
        tf_id_libros.setText(String.valueOf(a));
        consultar();
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
        tf_no_paginas = new javax.swing.JTextField();
        tf_id_nacionalidad = new javax.swing.JTextField();
        button_delete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        button_save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_id_libros = new javax.swing.JTextField();
        button_select = new javax.swing.JButton();
        button_modify = new javax.swing.JButton();
        button_exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf_titulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_id_autor = new javax.swing.JTextField();
        tf_id_editorial = new javax.swing.JTextField();
        button_print = new javax.swing.JButton();
        button_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("id_editorial");

        button_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/nuevo-icono-5549-32.png"))); // NOI18N
        button_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_newActionPerformed(evt);
            }
        });

        tf_no_paginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_no_paginasActionPerformed(evt);
            }
        });

        tf_id_nacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_id_nacionalidadActionPerformed(evt);
            }
        });

        button_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/cerrar-borrar-la-salida-icono-9027-32.png"))); // NOI18N
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });

        jLabel8.setText("id_nacionalidad");

        button_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/rss-registrarse-pantalla-18-icono-5317-32.png"))); // NOI18N
        button_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_saveActionPerformed(evt);
            }
        });

        jLabel7.setText("no_paginas");

        jLabel1.setText("id_libros");

        tf_id_libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_id_librosActionPerformed(evt);
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

        jLabel2.setText("titulo");

        tf_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tituloActionPerformed(evt);
            }
        });

        jLabel4.setText("id_autor");

        tf_id_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_id_autorActionPerformed(evt);
            }
        });

        tf_id_editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_id_editorialActionPerformed(evt);
            }
        });

        button_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/1488951775_print.png"))); // NOI18N
        button_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_printActionPerformed(evt);
            }
        });

        button_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/iconos/1488951801_search.png"))); // NOI18N
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_new, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_save, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_select, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_print, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_titulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_id_editorial, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_id_autor)
                            .addComponent(tf_id_libros)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_no_paginas))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_id_nacionalidad)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_id_libros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_id_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_id_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_no_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_id_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button_save)
                        .addComponent(button_modify, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(button_new))
                    .addComponent(button_print))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_select)
                    .addComponent(button_exit)
                    .addComponent(button_delete)
                    .addComponent(button_search))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveActionPerformed
        grabar();
    }//GEN-LAST:event_button_saveActionPerformed

    private void tf_id_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_id_librosActionPerformed
        String nulo = "";
        if (tf_id_libros.getText().equals(nulo)){
            JOptionPane.showMessageDialog(null,"El id_libro es requerido");
        }else{
            tf_id_libros.requestFocusInWindow();
        }
    }//GEN-LAST:event_tf_id_librosActionPerformed

    private void button_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_selectActionPerformed
        consultar();
    }//GEN-LAST:event_button_selectActionPerformed

    private void button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_exitActionPerformed
        salir();
    }//GEN-LAST:event_button_exitActionPerformed

    private void tf_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tituloActionPerformed
        String nulo = "";
        if (tf_titulo.getText().equals(nulo)){
            JOptionPane.showMessageDialog(null,"El titulo es requerido");
        }else{
            tf_titulo.requestFocusInWindow();
        }
    }//GEN-LAST:event_tf_tituloActionPerformed

    private void tf_id_editorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_id_editorialActionPerformed
        String nulo = "";
        if (tf_id_editorial.getText().equals(nulo)){
            JOptionPane.showMessageDialog(null,"El id_editorial es requerido");
        }else{
            tf_id_editorial.requestFocusInWindow();
        }
    }//GEN-LAST:event_tf_id_editorialActionPerformed

    private void tf_id_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_id_autorActionPerformed
        String nulo = "";
        if (tf_id_autor.getText().equals(nulo)){
            JOptionPane.showMessageDialog(null,"El id_autor es requerido");
        }else{
            tf_id_autor.requestFocusInWindow();
        }
    }//GEN-LAST:event_tf_id_autorActionPerformed

    private void tf_no_paginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_no_paginasActionPerformed
        String nulo = "";
        if (tf_no_paginas.getText().equals(nulo)){
            JOptionPane.showMessageDialog(null,"El no_paginas es requerido");
        }else{
            tf_no_paginas.requestFocusInWindow();
        }
    }//GEN-LAST:event_tf_no_paginasActionPerformed

    private void tf_id_nacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_id_nacionalidadActionPerformed
        String nulo = "";
        if (tf_id_nacionalidad.getText().equals(nulo)){
            JOptionPane.showMessageDialog(null,"El id_nacionalidad es requerido");
        }else{
            tf_id_nacionalidad.requestFocusInWindow();
        }
    }//GEN-LAST:event_tf_id_nacionalidadActionPerformed

    private void button_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_newActionPerformed
        nuevo();
    }//GEN-LAST:event_button_newActionPerformed

    private void button_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_modifyActionPerformed
        modificar();
    }//GEN-LAST:event_button_modifyActionPerformed

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
        borrar();
    }//GEN-LAST:event_button_deleteActionPerformed

    private void button_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_printActionPerformed
        imprimir();
    }//GEN-LAST:event_button_printActionPerformed

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        Libros_table lt = new Libros_table(user,password);
        lt.setVisible(true);
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
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libros(user,password).setVisible(true);
            }
        });
    }
    
    private void nuevo() {
        tf_id_autor.setText("");
        tf_id_editorial.setText("");
        tf_id_libros.setText("");
        tf_id_nacionalidad.setText("");
        tf_no_paginas.setText("");
        tf_titulo.setText("");
    }
    
    private void grabar() {
        String id_autor = tf_id_autor.getText();
        String id_nacionalidad = tf_id_nacionalidad.getText();
        String id_libros = tf_id_libros.getText();
        String no_paginas = tf_no_paginas.getText();
        String titulo = tf_titulo.getText();
        String id_editorial = tf_id_editorial.getText();
        
        
        String sql = "insert into libros(id_libro,titulo,id_editorial,id_autor,no_paginas,id_nacionalidad) values ("
                + id_libros + ","
                + "\"" + titulo + "\","
                + id_editorial + ","
                + id_autor + ","
                + "\"" + no_paginas + "\","
                + id_nacionalidad 
                + ");";
        
        connect_and_catch(sql, "Registro dado de alta con exito");                            
    }
    
    private void modificar() {
        
        String id_autor = tf_id_autor.getText();
        String id_nacionalidad = tf_id_nacionalidad.getText();
        String id_libros = tf_id_libros.getText();
        String no_paginas = tf_no_paginas.getText();
        String titulo = tf_titulo.getText();
        String id_editorial = tf_id_editorial.getText();
        
        String sql = "update libros set "
                + " titulo = " + "\"" + titulo + "\","
                + " id_editorial = " + id_editorial + ","
                + " id_autor = " + id_autor + ","
                + " no_paginas = " + "\"" + no_paginas + "\","
                + " id_autor = " + id_autor
                + " where id_libro = " + id_libros + ";";
        
        connect_and_catch(sql, "Registro modificado con exito");
    }
    
    private void borrar() {
        String id = tf_id_libros.getText();        
        String sql = "delete from libros where id_libro = "
                + id + ";";        
        connect_and_catch(sql,"Registro borrado con exito");        
    }
    
    private void consultar() {
        String id = tf_id_libros.getText();
        
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            String cadena = "jdbc:mysql://localhost/fpoo?user="+user+"&password="+password;
            Connection con = (Connection) DriverManager.getConnection(cadena);            
            PreparedStatement stmt = null;            
            
            ResultSet table;           
            String sql = "select * from libros where "
                    + "id_libro = " + id;                    
            stmt = con.prepareStatement(sql);            
            table = stmt.executeQuery();        
            while (table.next()){
                tf_titulo.setText(table.getString(2));                
                tf_id_editorial.setText(table.getString(3));                
                tf_id_autor.setText(table.getString(4));                
                tf_no_paginas.setText(table.getString(5));                
                tf_id_nacionalidad.setText(table.getString(6));                
                
            }
            
        }catch(ClassNotFoundException e1){
            JOptionPane.showMessageDialog(null,e1);
        }catch(SQLException e2){
            JOptionPane.showMessageDialog(null,e2);
        }catch(Exception e3){
            JOptionPane.showMessageDialog(null,e3);
        }
    }
    
    private void imprimir() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String cadena = "jdbc:mysql://localhost/fpoo?user="+user+"&password="+password;
            Connection con = (Connection) DriverManager.getConnection(cadena);
            String sys_path = System.getProperty("user.dir");
            String dir = sys_path + "\\Reports\\libros_report.jrxml";
            JasperReport report = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(report,null,con);
            JasperViewer.viewReport(mostrarReporte);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Autores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Autores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(Autores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void salir() {
        this.setVisible(false);
    }
    
    private void connect_and_catch(String sql, String mensaje){
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            String cadena = "jdbc:mysql://localhost/fpoo?user="+user+"&password="+password;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tf_id_autor;
    private javax.swing.JTextField tf_id_editorial;
    private javax.swing.JTextField tf_id_libros;
    private javax.swing.JTextField tf_id_nacionalidad;
    private javax.swing.JTextField tf_no_paginas;
    private javax.swing.JTextField tf_titulo;
    // End of variables declaration//GEN-END:variables
}
