package com.mycompany.appleistocktestone;

import com.mycompany.appleistocktestone.Database.DatabaseManager;
import com.mycompany.appleistocktestone.Sevices.ProductService;
import com.mycompany.appleistocktestone.Sevices.UserService;
import javax.swing.JOptionPane;

public class crudProduct extends javax.swing.JFrame {

    private final UserService userService;
    private final ProductService productService;

    public crudProduct(UserService userService, ProductService productService) {
        initComponents();
        this.userService = userService;
        this.productService = productService;

        // Check the user's position before allowing access to the form
        if (!userService.isUserManager()) {
            JOptionPane.showMessageDialog(this, "Only managers can access this form.", "Access Denied", JOptionPane.ERROR_MESSAGE);
            this.dispose(); // Close the form
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crudBackground = new javax.swing.JPanel();
        crudRPanel = new javax.swing.JPanel();
        crudLpanel = new javax.swing.JPanel();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new java.awt.TextField();
        lblProductPrice = new javax.swing.JLabel();
        txtProductPrice = new java.awt.TextField();
        lblProductQty = new javax.swing.JLabel();
        txtProductQty = new java.awt.TextField();
        lblProductCategory = new javax.swing.JLabel();
        cmbProductCategory = new javax.swing.JComboBox<>();
        btnAddProduct = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Product");
        setPreferredSize(new java.awt.Dimension(400, 350));

        crudBackground.setBackground(new java.awt.Color(255, 255, 255));

        crudRPanel.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout crudRPanelLayout = new javax.swing.GroupLayout(crudRPanel);
        crudRPanel.setLayout(crudRPanelLayout);
        crudRPanelLayout.setHorizontalGroup(
            crudRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        crudRPanelLayout.setVerticalGroup(
            crudRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        crudLpanel.setBackground(new java.awt.Color(255, 255, 255));
        crudLpanel.setForeground(new java.awt.Color(0, 0, 0));

        lblProductName.setBackground(new java.awt.Color(255, 255, 255));
        lblProductName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblProductName.setForeground(new java.awt.Color(0, 0, 0));
        lblProductName.setText("Product Name:");

        txtProductName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtProductName.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });

        lblProductPrice.setBackground(new java.awt.Color(255, 255, 255));
        lblProductPrice.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblProductPrice.setForeground(new java.awt.Color(0, 0, 0));
        lblProductPrice.setText("Product Price:");

        txtProductPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtProductPrice.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtProductPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductPriceActionPerformed(evt);
            }
        });

        lblProductQty.setBackground(new java.awt.Color(255, 255, 255));
        lblProductQty.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblProductQty.setForeground(new java.awt.Color(0, 0, 0));
        lblProductQty.setText("Qty:");

        txtProductQty.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtProductQty.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtProductQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductQtyActionPerformed(evt);
            }
        });

        lblProductCategory.setBackground(new java.awt.Color(255, 255, 255));
        lblProductCategory.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblProductCategory.setForeground(new java.awt.Color(0, 0, 0));
        lblProductCategory.setText("Category:");

        cmbProductCategory.setBackground(new java.awt.Color(255, 255, 255));
        cmbProductCategory.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cmbProductCategory.setForeground(new java.awt.Color(0, 0, 0));
        cmbProductCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Category", "IPhone", "Desktop", "ILaptop", "Tablet", "Accesories" }));

        btnAddProduct.setBackground(new java.awt.Color(0, 0, 0));
        btnAddProduct.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 204));
        btnAddProduct.setText("ADD");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 204));
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crudLpanelLayout = new javax.swing.GroupLayout(crudLpanel);
        crudLpanel.setLayout(crudLpanelLayout);
        crudLpanelLayout.setHorizontalGroup(
            crudLpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudLpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crudLpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProductName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProductPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProductQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbProductCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(crudLpanelLayout.createSequentialGroup()
                        .addGroup(crudLpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductName)
                            .addComponent(lblProductPrice)
                            .addComponent(lblProductQty)
                            .addComponent(lblProductCategory))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(crudLpanelLayout.createSequentialGroup()
                        .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        crudLpanelLayout.setVerticalGroup(
            crudLpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudLpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProductName)
                .addGap(1, 1, 1)
                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProductPrice)
                .addGap(2, 2, 2)
                .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProductQty)
                .addGap(2, 2, 2)
                .addComponent(txtProductQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProductCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(crudLpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout crudBackgroundLayout = new javax.swing.GroupLayout(crudBackground);
        crudBackground.setLayout(crudBackgroundLayout);
        crudBackgroundLayout.setHorizontalGroup(
            crudBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudBackgroundLayout.createSequentialGroup()
                .addComponent(crudRPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crudLpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        crudBackgroundLayout.setVerticalGroup(
            crudBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crudRPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(crudLpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crudBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crudBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductQtyActionPerformed

    private void txtProductPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductPriceActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // Get product details from the form
        String productName = txtProductName.getText();
        double productPrice = Double.parseDouble(txtProductPrice.getText());
        int productQty = Integer.parseInt(txtProductQty.getText());
        String productCategory = cmbProductCategory.getSelectedItem().toString();

        // Add the product to the database
        productService.createProduct(productName, productPrice, productCategory, productQty);

        // Display a success message
        JOptionPane.showMessageDialog(this, "Product added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

        // Clear the form fields
        clearFormFields();
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Clear the form fields
        clearFormFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void clearFormFields() {
        txtProductName.setText("");
        txtProductPrice.setText("");
        txtProductQty.setText("");
        cmbProductCategory.setSelectedIndex(0);
    }

    public static void main(String args[]) {
         /* Set the Nimbus look and feel */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(crudProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // Initialize UserService and ProductService here if needed
            UserService userService = new UserService(new DatabaseManager());
            ProductService productService = new ProductService(new DatabaseManager());
            new crudProduct(userService, productService).setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> cmbProductCategory;
    private javax.swing.JPanel crudBackground;
    private javax.swing.JPanel crudLpanel;
    private javax.swing.JPanel crudRPanel;
    private javax.swing.JLabel lblProductCategory;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductPrice;
    private javax.swing.JLabel lblProductQty;
    private java.awt.TextField txtProductName;
    private java.awt.TextField txtProductPrice;
    private java.awt.TextField txtProductQty;
    // End of variables declaration//GEN-END:variables
}
