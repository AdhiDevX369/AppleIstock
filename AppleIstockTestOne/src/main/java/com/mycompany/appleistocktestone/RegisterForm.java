package com.mycompany.appleistocktestone;

import com.mycompany.appleistocktestone.Database.DatabaseManager;
import com.mycompany.appleistocktestone.Sevices.UserService;
import javax.swing.JOptionPane;
import com.mycompany.appleistocktestone.Sevices.ProductService;

/**
 *
 * @author Adithya
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Rbackground = new javax.swing.JPanel();
        RrightPanel = new javax.swing.JPanel();
        RLeftPanel = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtRePassword = new javax.swing.JPasswordField();
        lblRePassword = new javax.swing.JLabel();
        lblUsername1 = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        radioManager = new javax.swing.JRadioButton();
        radioCashier = new javax.swing.JRadioButton();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        RrightPanel.setBackground(new java.awt.Color(255, 255, 189));
        RrightPanel.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout RrightPanelLayout = new javax.swing.GroupLayout(RrightPanel);
        RrightPanel.setLayout(RrightPanelLayout);
        RrightPanelLayout.setHorizontalGroup(
            RrightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );
        RrightPanelLayout.setVerticalGroup(
            RrightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        RLeftPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Enter Full Name: ");

        txtFullName.setBackground(new java.awt.Color(255, 255, 255));
        txtFullName.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txtFullName.setForeground(new java.awt.Color(0, 0, 0));
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });

        txtUserName.setBackground(new java.awt.Color(255, 255, 255));
        txtUserName.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(0, 0, 0));
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername.setText("Enter Username:");

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Enter Password:");

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtRePassword.setBackground(new java.awt.Color(255, 255, 255));
        txtRePassword.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txtRePassword.setForeground(new java.awt.Color(0, 0, 0));
        txtRePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRePasswordActionPerformed(evt);
            }
        });

        lblRePassword.setBackground(new java.awt.Color(255, 255, 255));
        lblRePassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblRePassword.setForeground(new java.awt.Color(0, 0, 0));
        lblRePassword.setText("Re - Enter Password:");

        lblUsername1.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblUsername1.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername1.setText("Enter Username:");

        lblPassword1.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblPassword1.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword1.setText("Select Your Position:");

        radioManager.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioManager);
        radioManager.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        radioManager.setForeground(new java.awt.Color(0, 0, 0));
        radioManager.setText("Manager");

        radioCashier.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioCashier);
        radioCashier.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        radioCashier.setForeground(new java.awt.Color(0, 0, 0));
        radioCashier.setText("Cashier");
        radioCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCashierActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(255, 255, 189));
        btnRegister.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 0, 0));
        btnRegister.setText("REGISER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 255, 189));
        btnLogin.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RLeftPanelLayout = new javax.swing.GroupLayout(RLeftPanel);
        RLeftPanel.setLayout(RLeftPanelLayout);
        RLeftPanelLayout.setHorizontalGroup(
            RLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RLeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RLeftPanelLayout.createSequentialGroup()
                        .addComponent(radioManager)
                        .addGap(18, 18, 18)
                        .addComponent(radioCashier))
                    .addGroup(RLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblName)
                        .addComponent(txtFullName)
                        .addComponent(txtUserName)
                        .addComponent(lblUsername)
                        .addComponent(lblPassword)
                        .addComponent(txtPassword)
                        .addComponent(txtRePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(lblRePassword))
                    .addComponent(lblPassword1)
                    .addGroup(RLeftPanelLayout.createSequentialGroup()
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
            .addGroup(RLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RLeftPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblUsername1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        RLeftPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLogin, btnRegister});

        RLeftPanelLayout.setVerticalGroup(
            RLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RLeftPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRePassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioManager)
                    .addComponent(radioCashier))
                .addGap(18, 18, 18)
                .addGroup(RLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(RLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RLeftPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblUsername1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        RLeftPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLogin, btnRegister});

        javax.swing.GroupLayout RbackgroundLayout = new javax.swing.GroupLayout(Rbackground);
        Rbackground.setLayout(RbackgroundLayout);
        RbackgroundLayout.setHorizontalGroup(
            RbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RbackgroundLayout.createSequentialGroup()
                .addComponent(RrightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        RbackgroundLayout.setVerticalGroup(
            RbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RrightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(Rbackground);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCashierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCashierActionPerformed

    private void txtRePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRePasswordActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // In your RegisterForm class:
        String fullName = txtFullName.getText();
        String username = txtUserName.getText();
        String password = new String(txtPassword.getPassword());
        String reEnteredPassword = new String(txtRePassword.getPassword());

        // Check if the entered passwords match
        if (!password.equals(reEnteredPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match. Please re-enter your password.", "Password Mismatch", JOptionPane.ERROR_MESSAGE);
            txtRePassword.setText(""); // Clear the re-entered password field
            return;
        }

        // Check which radio button is selected
        String position = "";
        if (radioManager.isSelected()) {
            position = "Manager";
        } else if (radioCashier.isSelected()) {
            position = "Cashier";
        } else {
            JOptionPane.showMessageDialog(this, "Please select your position.", "Position Not Selected", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Use the UserService class to register the user
        DatabaseManager dbManager = new DatabaseManager();
        UserService userService = new UserService(dbManager);
        boolean registrationSuccess = userService.registerUser(fullName, username, password, position);

        if (registrationSuccess) {
            JOptionPane.showMessageDialog(this, "Registration successful for " + fullName + " as a " + position, "Registration Success", JOptionPane.INFORMATION_MESSAGE);
            clearInputFields();
        } else {
            JOptionPane.showMessageDialog(this, "Username already exists. Please choose a different username.", "Registration Error", JOptionPane.ERROR_MESSAGE);
        }

        //Navigate to dashboard
        if ("Cashier".equals(position)) {
            Cashier cashier = new Cashier();
            cashier.setVisible(true);
            this.dispose(); //Close Current Form
        }
        if ("Manager".equals(position)) {
            ProductService productService = new ProductService(new DatabaseManager());
            new ManagerForm(userService, productService).setVisible(true);
            this.dispose(); // Close the login form
            this.dispose();//Close Current Form 
        }


    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Create an instance of the RegisterForm and make it visible
        LoginForm login = new LoginForm();
        login.setVisible(true);
        this.dispose(); // Close the login form
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RLeftPanel;
    private javax.swing.JPanel Rbackground;
    private javax.swing.JPanel RrightPanel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblRePassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JRadioButton radioCashier;
    private javax.swing.JRadioButton radioManager;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void clearInputFields() {
        txtFullName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        txtRePassword.setText("");
        radioManager.setSelected(false);
        radioCashier.setSelected(false);
    }
}
