/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BpProject2;

import javax.swing.JOptionPane;

/**
 *
 * @author fbali
 */
public class Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani extends javax.swing.JFrame {

    public static String UserId = null;
    public static String Password = null;

    /**
     * Creates new form Ali_Yilmaz_2121221031_bp2_p2_Main
     */
    public Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani() {
        initComponents();
        this.setTitle("Giriş Ekranı");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbdPane = new javax.swing.JTabbedPane();
        tbd_Giris3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txt_KullaniciAdi = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btn_giris3 = new javax.swing.JButton();
        txt_Sifre = new javax.swing.JPasswordField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btn_KayitaGit3 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 447));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        tbd_Giris3.setBackground(new java.awt.Color(204, 204, 255));
        tbd_Giris3.setMaximumSize(new java.awt.Dimension(717, 416));
        tbd_Giris3.setMinimumSize(new java.awt.Dimension(717, 416));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Kullanıcı adı");

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Şifre");

        btn_giris3.setBackground(new java.awt.Color(204, 255, 204));
        btn_giris3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_giris3.setForeground(new java.awt.Color(0, 0, 0));
        btn_giris3.setText("Giriş");
        btn_giris3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisActionPerformed(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\fbali\\OneDrive\\Masaüstü\\UserLogin.png")); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\fbali\\OneDrive\\Masaüstü\\password.png")); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\fbali\\Downloads\\refer.png")); // NOI18N

        btn_KayitaGit3.setBackground(new java.awt.Color(204, 255, 204));
        btn_KayitaGit3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_KayitaGit3.setForeground(new java.awt.Color(0, 0, 0));
        btn_KayitaGit3.setText("Kayıt Ekranı");
        btn_KayitaGit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KayitaGitActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Henüz Hesabın yoksa");

        javax.swing.GroupLayout tbd_Giris3Layout = new javax.swing.GroupLayout(tbd_Giris3);
        tbd_Giris3.setLayout(tbd_Giris3Layout);
        tbd_Giris3Layout.setHorizontalGroup(
            tbd_Giris3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbd_Giris3Layout.createSequentialGroup()
                .addGroup(tbd_Giris3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbd_Giris3Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel24))
                    .addGroup(tbd_Giris3Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel20))
                    .addGroup(tbd_Giris3Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel22)
                        .addGap(17, 17, 17)
                        .addComponent(txt_KullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tbd_Giris3Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel21))
                    .addGroup(tbd_Giris3Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tbd_Giris3Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btn_giris3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addGroup(tbd_Giris3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_KayitaGit3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(194, 194, 194))
        );
        tbd_Giris3Layout.setVerticalGroup(
            tbd_Giris3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbd_Giris3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(22, 22, 22)
                .addGroup(tbd_Giris3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(txt_KullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel21)
                .addGap(12, 12, 12)
                .addGroup(tbd_Giris3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(tbd_Giris3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_giris3)
                    .addComponent(btn_KayitaGit3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addContainerGap())
        );

        tbdPane.addTab("Giriş yap", tbd_Giris3);

        getContentPane().add(tbdPane);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KayitaGitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KayitaGitActionPerformed
        // TODO add your handling code here:
        Ali_Yilmaz_2121221031_bp2_p2_KayitOl kayit = new Ali_Yilmaz_2121221031_bp2_p2_KayitOl();
        kayit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_KayitaGitActionPerformed

    private void btn_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisActionPerformed
        UserId = txt_KullaniciAdi.getText().trim();
        Password = txt_Sifre.getText().trim();
        if (Ali_Yilmaz_2121221031_bp2_p2_MalzemeDB.pullUser(UserId, Password)) {
            String position = Ali_Yilmaz_2121221031_bp2_p2_MalzemeDB.getUserPosition(UserId, Password); // Kullanıcının pozisyonunu alın

            if (position.equals("Admin")) {//giriş yapan kullanıcı pozisyonuna göre mesaj gönder
                JOptionPane.showMessageDialog(this, "Admin girişi yapıldı. Hoş geldiniz!");
            } else {
                JOptionPane.showMessageDialog(this, "Personel Girişi yapıldı. Hoş geldiniz!");
            }

            Ali_Yilmaz_2121221031_bp2_p2_Main main = new Ali_Yilmaz_2121221031_bp2_p2_Main();
            main.setVisible(true);
            this.dispose();
        } else {
            // Kullanıcı bilgileri geçersiz, hata mesajı gösterin
            JOptionPane.showMessageDialog(this, "Geçersiz kullanıcı adı veya şifre");
        }


    }//GEN-LAST:event_btn_girisActionPerformed

    public static String getKullaniciAdi() {
        return UserId;
    }

    public static void setKullaniciAdi(String kullaniciAdi) {
        Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.UserId = kullaniciAdi;
    }

    public static String getPassword() {
        return Password;
    }

    public static void setPassword(String Password) {
        Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.Password = Password;
    }

    public String get_txt_KullaniciAdi() {

        return txt_KullaniciAdi.getText();

    }

    public String get_txt_Sifre() {
        return txt_Sifre.getText();

    }

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
            java.util.logging.Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    // Variables declaration - do not modify

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_KayitaGit3;
    private javax.swing.JButton btn_giris3;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JTabbedPane tbdPane;
    private javax.swing.JPanel tbd_Giris3;
    private javax.swing.JTextField txt_KullaniciAdi;
    private javax.swing.JPasswordField txt_Sifre;
    // End of variables declaration//GEN-END:variables
}
