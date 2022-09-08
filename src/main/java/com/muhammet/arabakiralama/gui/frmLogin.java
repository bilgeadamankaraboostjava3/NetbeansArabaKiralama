package com.muhammet.arabakiralama.gui;

import com.muhammet.arabakiralama.enums.Yetki;
import com.muhammet.arabakiralama.repository.entity.Kullanici;
import com.muhammet.arabakiralama.repository.impl.KullaniciRepositoryImpl;
import com.muhammet.arabakiralama.service.KullaniciService;
import java.util.List;
import javax.swing.JOptionPane;
import static com.muhammet.arabakiralama.utility.StaticValues.*;


public class frmLogin extends javax.swing.JFrame {

   //KullaniciRepositoryImpl kullaniciRepositoryImpl ;
    private KullaniciService kullaniciService;
    private boolean isButtonActive = false;
    public frmLogin() {
     //kullaniciRepositoryImpl   = new KullaniciRepositoryImpl();
      //  kullaniciRepositoryImpl.DefaultKullaniciOlustur();
        new KullaniciRepositoryImpl().DefaultKullaniciOlustur();
        kullaniciService = new KullaniciService();
        initComponents();        
    }

    private void dologin(String ka, String sf){
        List<Kullanici> kullanici =  kullaniciService.findByColumnAndValue("ad", ka); // 
        if(kullanici.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kullanıcı adı ya da şifre hatalı");
        }else{
            if(kullanici.get(0).getSifre().equals(sf))
                new frmMain().setVisible(true);
            else{
             JOptionPane.showMessageDialog(this, "Kullanıcı adı ya da şifre hatalı");
            }
        }       
    }

    private void dologin2(String ka, String sf){
       // List<Kullanici> kullanici =  kullaniciService.findByEntity(new Kullanici(ka,sf));
       // if(kullanici.isEmpty()) {
       if(kullaniciService.findByEntity(new Kullanici(ka, sf)).isEmpty())
            JOptionPane.showMessageDialog(this, "Kullanıcı adı ya da şifre hatalı");
       else
          new frmMain().setVisible(true);
        
    }
    
    private void dologin3(String ka,String sf){  
        if(ka.isEmpty() || sf.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kullanıcı adı ya da şifre boş geçilemez");
        }
        else 
            if(kullaniciService.isLogin(ka, sf)) 
                new frmMain().setVisible(true);
            else
                JOptionPane.showMessageDialog(this, "Kullanıcı adı ya da şifre hatalı");           
    }
    private void dologin4(String ka,String sf){  
        if(ka.isEmpty() || sf.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kullanıcı adı ya da şifre boş geçilemez");
        }
        else 
            if(kullaniciService.isLogin2(ka, sf)) 
                new frmMain().setVisible(true);
            else
                JOptionPane.showMessageDialog(this, "Kullanıcı adı ya da şifre hatalı");           
    }
    private void AktifPasif(){
        if(txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty())
        {
            btnLogin.setForeground(PASIF); 
            isButtonActive = false;
        }
        else{
            btnLogin.setForeground(AKTIF);        
            isButtonActive = true;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKapat = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        altCizgi = new javax.swing.JPanel();
        btnLogin = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnKapat.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnKapat.setForeground(new java.awt.Color(255, 255, 255));
        btnKapat.setText("X");
        getContentPane().add(btnKapat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        txtUserName.setBackground(new java.awt.Color(220, 218, 229));
        txtUserName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUserName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 378, 312, 60));

        txtPassword.setBackground(new java.awt.Color(220, 218, 229));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 458, 312, 60));

        jCheckBox1.setBackground(new java.awt.Color(80, 74, 95));
        jCheckBox1.setForeground(new java.awt.Color(80, 74, 95));
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 539, 20, 30));

        altCizgi.setBackground(new java.awt.Color(255, 255, 255));
        altCizgi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        altCizgi.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout altCizgiLayout = new javax.swing.GroupLayout(altCizgi);
        altCizgi.setLayout(altCizgiLayout);
        altCizgiLayout.setHorizontalGroup(
            altCizgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );
        altCizgiLayout.setVerticalGroup(
            altCizgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(altCizgi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 645, -1, 0));

        btnLogin.setBackground(new java.awt.Color(0, 51, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(102, 102, 102));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("LOGIN");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 380, 70));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        System.out.println("Login butonu üzerindesin");
        altCizgi.setSize(355, 2);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        System.out.println("Login butonu üzerinden çıktım");
         altCizgi.setSize(0, 0);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        if(!isButtonActive) return;
            String kullaniniadi = txtUserName.getText().toString();
            String sifre = txtPassword.getText().toString();       
            dologin4(kullaniniadi, sifre);
        
    }//GEN-LAST:event_btnLoginMouseClicked

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        AktifPasif();
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        AktifPasif();
    }//GEN-LAST:event_txtPasswordKeyReleased

   
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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel altCizgi;
    private javax.swing.JLabel btnKapat;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
