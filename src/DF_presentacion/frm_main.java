/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DF_presentacion;

/**
 *
 * @author Alian Peralta
 */
public class frm_main extends javax.swing.JFrame {

    /**
     * Creates new form frm_main
     */
    public frm_main() {
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

        panel_main = new javax.swing.JPanel();
        btn_Listas = new javax.swing.JButton();
        btn_paci = new javax.swing.JButton();
        btn_productos = new javax.swing.JButton();
        btn_emp = new javax.swing.JButton();
        lbl_paciente = new javax.swing.JLabel();
        lbl_fac = new javax.swing.JLabel();
        lbl_prod = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        lbl_fac1 = new javax.swing.JLabel();
        btn_fact = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_main.setBackground(new java.awt.Color(255, 255, 255));
        panel_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Listas.setBackground(new java.awt.Color(255, 255, 255));
        btn_Listas.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btn_Listas.setForeground(new java.awt.Color(94, 141, 147));
        btn_Listas.setText("Lista");
        btn_Listas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 141, 147), 2));
        btn_Listas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListasActionPerformed(evt);
            }
        });
        panel_main.add(btn_Listas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 120, 50));

        btn_paci.setBackground(new java.awt.Color(255, 255, 255));
        btn_paci.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btn_paci.setForeground(new java.awt.Color(94, 141, 147));
        btn_paci.setText("Registrar");
        btn_paci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 141, 147), 2));
        btn_paci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paciActionPerformed(evt);
            }
        });
        panel_main.add(btn_paci, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 120, 50));

        btn_productos.setBackground(new java.awt.Color(255, 255, 255));
        btn_productos.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btn_productos.setForeground(new java.awt.Color(94, 141, 147));
        btn_productos.setText("Registrar");
        btn_productos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 141, 147), 2));
        btn_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productosActionPerformed(evt);
            }
        });
        panel_main.add(btn_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 130, 50));

        btn_emp.setBackground(new java.awt.Color(255, 255, 255));
        btn_emp.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btn_emp.setForeground(new java.awt.Color(94, 141, 147));
        btn_emp.setText("Registrar");
        btn_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 141, 147), 2));
        btn_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empActionPerformed(evt);
            }
        });
        panel_main.add(btn_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 120, 50));

        lbl_paciente.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_paciente.setForeground(new java.awt.Color(81, 124, 164));
        lbl_paciente.setText("Registrar Los clientes:");
        panel_main.add(lbl_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lbl_fac.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_fac.setForeground(new java.awt.Color(81, 124, 164));
        lbl_fac.setText("Listas:");
        panel_main.add(lbl_fac, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, 30));

        lbl_prod.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_prod.setForeground(new java.awt.Color(81, 124, 164));
        lbl_prod.setText("Registrar Producto:");
        panel_main.add(lbl_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        lbl_emp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_emp.setForeground(new java.awt.Color(81, 124, 164));
        lbl_emp.setText("Registrar empleado:");
        panel_main.add(lbl_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DF_presentacion/lo.png"))); // NOI18N
        panel_main.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        lbl_fac1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_fac1.setForeground(new java.awt.Color(81, 124, 164));
        lbl_fac1.setText("Hacer factura:");
        panel_main.add(lbl_fac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, 30));

        btn_fact.setBackground(new java.awt.Color(255, 255, 255));
        btn_fact.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btn_fact.setForeground(new java.awt.Color(94, 141, 147));
        btn_fact.setText("Factura");
        btn_fact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 141, 147), 2));
        btn_fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_factActionPerformed(evt);
            }
        });
        panel_main.add(btn_fact, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 120, 50));

        getContentPane().add(panel_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListasActionPerformed
    // Este es el boton que permite ir a la pantalla de los listados
        frm_listas mf = new frm_listas();// aqui estamos creando un mf nuevo
        mf.setVisible(true); // esto es para que la pantalla del main pueda ser visible y la otra desaparesca
        mf.pack();
        this.dispose();
    }//GEN-LAST:event_btn_ListasActionPerformed

    private void btn_paciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paciActionPerformed
          // Este es el boton que permite ir a la pantalla de registro los pancientes
        frm_paciente mf = new frm_paciente();// aqui estamos creando un mf nuevo
        mf.setVisible(true); // esto es para que la pantalla del main pueda ser visible y la otra desaparesca
        mf.pack();
        this.dispose();
    }//GEN-LAST:event_btn_paciActionPerformed

    private void btn_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empActionPerformed
         // Este es el boton que permite ir a la pantalla de registro de empleados
        frm_empleado mf = new frm_empleado();// aqui estamos creando un mf nuevo
        mf.setVisible(true); // esto es para que la pantalla del main pueda ser visible y la otra desaparesca
        mf.pack();
        this.dispose();
    }//GEN-LAST:event_btn_empActionPerformed

    private void btn_factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_factActionPerformed
          // Este es el boton que permite ir a la pantalla de facturacion
        frm_factura mf = new frm_factura();// aqui estamos creando un mf nuevo
        mf.setVisible(true); // esto es para que la pantalla del main pueda ser visible y la otra desaparesca
        mf.pack();
        this.dispose();
    }//GEN-LAST:event_btn_factActionPerformed

    private void btn_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productosActionPerformed
          // Este es el boton que permite ir a la pantalla de registro de productos
        frm_producto mf = new frm_producto();// aqui estamos creando un mf nuevo
        mf.setVisible(true); // esto es para que la pantalla del main pueda ser visible y la otra desaparesca
        mf.pack();
        this.dispose();
    }//GEN-LAST:event_btn_productosActionPerformed

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
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Listas;
    private javax.swing.JButton btn_emp;
    private javax.swing.JButton btn_fact;
    private javax.swing.JButton btn_paci;
    private javax.swing.JButton btn_productos;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JLabel lbl_fac;
    private javax.swing.JLabel lbl_fac1;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_paciente;
    private javax.swing.JLabel lbl_prod;
    private javax.swing.JPanel panel_main;
    // End of variables declaration//GEN-END:variables
}