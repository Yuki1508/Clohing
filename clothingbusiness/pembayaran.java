/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clothingbusiness;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class pembayaran extends javax.swing.JFrame {

    /**
     * Creates new form pembayaran
     */
   public Statement st; 
    public ResultSet rs; 
    Connection conn = koneksi.koneksiDB.Koneksi();
    
    public pembayaran() {
        initComponents();
        koneksi.koneksiDB.Koneksi();
    }
    
    private void Clear(){
        txtidorder.setText("");
        txtitem.setText("");
        txtqty.setText("");
        txtprice.setText("");
        txttotalprice.setText("");
        
        btnPAY.setText("PAY");
        txtidorder.setEditable(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idOrder = new javax.swing.JLabel();
        item = new javax.swing.JLabel();
        qty = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        txtidorder = new javax.swing.JTextField();
        txtitem = new javax.swing.JTextField();
        txtqty = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        btnPAY = new javax.swing.JButton();
        btnhitung = new javax.swing.JButton();
        totalPrice = new javax.swing.JLabel();
        txttotalprice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Payment");

        idOrder.setText("Id Order");

        item.setText("Item ");

        qty.setText("Qty");

        price.setText("Price");

        txtidorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidorderActionPerformed(evt);
            }
        });

        btnPAY.setText("PAY");
        btnPAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPAYActionPerformed(evt);
            }
        });

        btnhitung.setText("Hitung");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });

        totalPrice.setText("Total Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item)
                            .addComponent(idOrder)
                            .addComponent(qty)
                            .addComponent(price)
                            .addComponent(totalPrice))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtitem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtidorder, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txttotalprice, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(txtprice))
                                        .addGap(12, 12, 12)
                                        .addComponent(btnhitung))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnPAY)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idOrder)
                    .addComponent(txtidorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(item)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qty, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnhitung)
                    .addComponent(totalPrice)
                    .addComponent(txttotalprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btnPAY)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidorderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidorderActionPerformed

    private void btnPAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPAYActionPerformed
    try {
        st = conn.createStatement();
        if (txtidorder.getText().equals("") || 
            txtitem.getText().equals("") || 
                txtqty.getText().equals("") ||
                txtprice.getText().equals("") ||
                txttotalprice.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data harus diisi", "Validasi data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
         if (btnPAY.getText() == "PAY" ) {
            String bayar = "INSERT INTO 'order' VALUES ('" + txtidorder.getText() + "','" +
                    txtitem.getText() + "','" + txtqty.getText() + txtprice.getText() + txttotalprice.getText() + "'),";
            st.executeQuery(bayar);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Pembayaran Berhasil");
            } else {
                String sql = "SELECT * FROM 'order' WHERE 'Order_Id' = ?" + txtidorder.getText() + "'" ;
                java.sql.PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, txtidorder.getText());
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Id Sudah Ada");
                Clear();
            }
        } else {
            //UPDATE
            String update = "UPDATE 'order' SET 'Item_name' = '" + txtitem.getText() + "', 'Item_Price' = '" + 
                    txtprice.getText() + "' WHERE 'Order_Id' = '" + txtidorder.getText() + "'";
            st.executeUpdate(update);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            Clear();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_btnPAYActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        // TODO add your handling code here:
        int totalPrice = 0;
        String qty = txtqty.getText();
        String price = txtprice.getText();
        int ke1 = Integer.parseInt(qty);
        int ke2 = Integer.parseInt(price);
        totalPrice = ke1 * ke2;
        txttotalprice.setText("" + totalPrice);
    }//GEN-LAST:event_btnhitungActionPerformed

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
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPAY;
    private javax.swing.JButton btnhitung;
    private javax.swing.JLabel idOrder;
    private javax.swing.JLabel item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel price;
    private javax.swing.JLabel qty;
    private javax.swing.JLabel totalPrice;
    private javax.swing.JTextField txtidorder;
    private javax.swing.JTextField txtitem;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txttotalprice;
    // End of variables declaration//GEN-END:variables
}