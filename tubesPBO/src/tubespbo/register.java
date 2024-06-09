/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tubespbo;
public class register extends javax.swing.JFrame {
    public static String name;
    public static String username;
    public static String password;
     
    public register() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namaregister = new javax.swing.JLabel();
        reg_username = new javax.swing.JLabel();
        reg_pass = new javax.swing.JLabel();
        reg_pass2 = new javax.swing.JLabel();
        reg_isinama = new javax.swing.JTextField();
        reg_isiusername = new javax.swing.JTextField();
        reg_isipass = new javax.swing.JPasswordField();
        reg_isipass2 = new javax.swing.JPasswordField();
        bt_registerok = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        teks_klogbsregister = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 1024));

        namaregister.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        namaregister.setForeground(new java.awt.Color(0, 153, 153));
        namaregister.setText("NAMA");

        reg_username.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        reg_username.setForeground(new java.awt.Color(0, 153, 153));
        reg_username.setText("USERNAME");

        reg_pass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        reg_pass.setForeground(new java.awt.Color(0, 153, 153));
        reg_pass.setText("PASSWORD");

        reg_pass2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        reg_pass2.setForeground(new java.awt.Color(0, 153, 153));
        reg_pass2.setText("KETIK ULANG PASSWORD");

        reg_isinama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_isinamaActionPerformed(evt);
            }
        });

        reg_isipass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_isipass2ActionPerformed(evt);
            }
        });

        bt_registerok.setForeground(new java.awt.Color(0, 153, 153));
        bt_registerok.setText("REGISTER");
        bt_registerok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registerokActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Sudah punya akun?");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        teks_klogbsregister.setForeground(new java.awt.Color(153, 0, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Register Akun");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(teks_klogbsregister))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reg_isipass2, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(reg_pass2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(reg_pass)
                                                .addComponent(namaregister)
                                                .addComponent(jLabel1)
                                                .addComponent(reg_isinama, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                                .addComponent(reg_username)
                                                .addComponent(reg_isiusername)
                                                .addComponent(reg_isipass)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(bt_registerok, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(namaregister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reg_isinama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(teks_klogbsregister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reg_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reg_isiusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(reg_pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reg_isipass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(reg_pass2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reg_isipass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(bt_registerok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loginB lg = new loginB();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(register.EXIT_ON_CLOSE);
        // buat klo button login
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_registerokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registerokActionPerformed
        //ngecek field yang uda di isi apa blom
        if (reg_isinama.getText().equals("")){
            teks_klogbsregister.setText("mohon inputkan nama anda");
        }
        else if (reg_isipass.getText().equals("")){
            teks_klogbsregister.setText("mohon inputkan password anda");
        }
        else if (reg_isipass2.getText().equals("")){
            teks_klogbsregister.setText("mohon ketik ulang password anda");
        }
        else if (reg_isiusername.getText().equals("")){
            teks_klogbsregister.setText("mohon inputkan username anda");
        }
        else{
            if (reg_isipass.getText().equals(reg_isipass2.getText())){
                name = reg_isinama.getText();
                username = reg_isiusername.getText();
                password = reg_isipass.getText();

                loginB lg = new loginB();
                lg.setVisible(true);
                lg.pack();
                lg.setLocationRelativeTo(null);
                lg.setDefaultCloseOperation(register.EXIT_ON_CLOSE);
            }
            else{
                teks_klogbsregister.setText("password yang anda masukkan tidak cocok");
            }
        }  // TODO add your handling code here:
    }//GEN-LAST:event_bt_registerokActionPerformed

    private void reg_isinamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_isinamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_isinamaActionPerformed

    private void reg_isipass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_isipass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_isipass2ActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_registerok;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namaregister;
    private javax.swing.JTextField reg_isinama;
    private javax.swing.JPasswordField reg_isipass;
    private javax.swing.JPasswordField reg_isipass2;
    private javax.swing.JTextField reg_isiusername;
    private javax.swing.JLabel reg_pass;
    private javax.swing.JLabel reg_pass2;
    private javax.swing.JLabel reg_username;
    private javax.swing.JLabel teks_klogbsregister;
    // End of variables declaration//GEN-END:variables
}
