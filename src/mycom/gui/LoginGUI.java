package mycom.gui;
import javax.swing.JOptionPane;
import mycom.controllers.UserController;
import mycom.gui.admin.AdminNavigation;
import mycom.gui.manager.ManagerNavigation;
import mycom.gui.staff.StaffNavigation;


public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form Loginpage
     */
    public LoginGUI() {
        initComponents();
        this.setSize(1200, 750);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jMenu1 = new javax.swing.JMenu();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        userIdLabel = new java.awt.Label();
        userPwdLabel = new java.awt.Label();
        loginButton = new java.awt.Button();
        tfUserPwd = new javax.swing.JPasswordField();
        tfUserId = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("Log in frame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1483, 1009));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(27, 97, 153));
        panel1.setPreferredSize(new java.awt.Dimension(400, 750));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mycom/gui/images/imagelock.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Log In");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 419, -1));

        panel2.setBackground(new java.awt.Color(234, 234, 234));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userIdLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        userIdLabel.setText("User ID");
        panel2.add(userIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        userPwdLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        userPwdLabel.setText("Password");
        panel2.add(userPwdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        loginButton.setBackground(new java.awt.Color(204, 204, 204));
        loginButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        loginButton.setLabel("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        panel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 136, 32));

        tfUserPwd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfUserPwd.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10)));
        panel2.add(tfUserPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 330, 40));

        tfUserId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfUserId.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10)));
        tfUserId.setPreferredSize(new java.awt.Dimension(6, 32));
        panel2.add(tfUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 320, 40));

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 251, 402, 345));

        jPanel1.setBackground(new java.awt.Color(144, 174, 223));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PPE Inventory System");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mycom/gui/images/icon.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(687, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1244, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // Create User Controller Object
        UserController usrCtrl = new UserController();
        String userId, userPwd;
        userId = tfUserId.getText();
        userPwd = tfUserPwd.getText();
        if (usrCtrl.userLogin(userId, userPwd)) {
            JOptionPane.showMessageDialog(this, "Login Success");
            dispose();
            if (usrCtrl.getActiveUser().type.equalsIgnoreCase("super admin")) {
                AdminNavigation adminDashboard = new AdminNavigation(usrCtrl);
                adminDashboard.setVisible(true);
            }
            if (usrCtrl.getActiveUser().type.equalsIgnoreCase("manager")) {
                ManagerNavigation mngDashboard = new ManagerNavigation(usrCtrl);
                mngDashboard.setVisible(true);
            }
            if (usrCtrl.getActiveUser().type.equalsIgnoreCase("staff")) {
                StaffNavigation stfDashboard = new StaffNavigation(usrCtrl);
                stfDashboard.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Login failed");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private java.awt.Button loginButton;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTextField tfUserId;
    private javax.swing.JPasswordField tfUserPwd;
    private java.awt.Label userIdLabel;
    private java.awt.Label userPwdLabel;
    // End of variables declaration//GEN-END:variables
}
