/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import java.awt.JobAttributes;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MaZZ
 */
public class summarize extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public summarize() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        sumPriceAdultLabel1 = new javax.swing.JLabel();
        AmountLabelAdult1 = new javax.swing.JLabel();
        TpyeLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        SumKidsPriceLabel = new javax.swing.JLabel();
        AmountLabelKids = new javax.swing.JLabel();
        sumPriceTotalLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        PayTextflied = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        DisPriceLabel = new javax.swing.JLabel();
        TpyeLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        DisTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(50, 60));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Individual service fee ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 20));

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Name Ticket");
        getContentPane().add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        sumPriceAdultLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sumPriceAdultLabel1.setForeground(new java.awt.Color(255, 255, 255));
        sumPriceAdultLabel1.setText("0");
        getContentPane().add(sumPriceAdultLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        AmountLabelAdult1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AmountLabelAdult1.setForeground(new java.awt.Color(255, 255, 255));
        AmountLabelAdult1.setText("0");
        getContentPane().add(AmountLabelAdult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        TpyeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TpyeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TpyeLabel.setText("Adult");
        getContentPane().add(TpyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 70, -1));

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 70, -1));

        SumKidsPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SumKidsPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        SumKidsPriceLabel.setText("0");
        getContentPane().add(SumKidsPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        AmountLabelKids.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AmountLabelKids.setForeground(new java.awt.Color(255, 255, 255));
        AmountLabelKids.setText("0");
        getContentPane().add(AmountLabelKids, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        sumPriceTotalLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sumPriceTotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        sumPriceTotalLabel.setText("0");
        getContentPane().add(sumPriceTotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Discount");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Code Discount");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jButton4.setText("Ok");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 51, -1));
        getContentPane().add(PayTextflied, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 110, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Bath");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Bath");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Bath");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Bath");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Code: 7896, 4562, 9812");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        DisPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DisPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        DisPriceLabel.setText("0");
        getContentPane().add(DisPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        TpyeLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TpyeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        TpyeLabel1.setText("Kids");
        getContentPane().add(TpyeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Price");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Amount");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Pay");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));
        getContentPane().add(DisTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 110, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/Untitled-2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 410, 310));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Pay");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Pay");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Pay");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Main pageMain = new Main();
    int Adult = 0;
    int countKids1 = 0;
    int ComboName;
    int priceKids = 100;
    int priceAdult = 500;
    int sumPrice = 0;
    String Lastname = " ", FristName = " ", FullName = " ";
    int min = 000000;
    int max = 500000;
    int discount = 100;
    int sumDiscount = 0;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        FristName = pageMain.FirstNameTextField.getText();
        if (Adult > 0) {
            pageMain.AdultTpyeCheck.setSelected(true);
        }
        if (countKids1 > 0) {
            pageMain.KidsTpyeChack.setSelected(true);
        }
        pageMain.AmoutAduleLabel.setText(String.valueOf(Adult));
        pageMain.Adult = Adult;
        pageMain.Kids = countKids1;
        pageMain.AmoutChildenLabel.setText(String.valueOf(countKids1));
        pageMain.LastnameTxTField.setText(Lastname);
        pageMain.FirstNameTextField.setText(FristName);
        pageMain.ComboName.setSelectedIndex(ComboName);
        pageMain.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        while ((Adult-=4)<4) {            
//            discount += priceAdult;
//        }
        Integer Check = Integer.valueOf(DisTextField1.getText());
        int[] Code = {7896, 4562, 9812};
        for (int i = 0; i < Code.length; i++) {
            if (Code[i] == Check) {
                Check = 1;
            }
        }
        if (Check == 1) {
            sumDiscount+=discount;
            sumPrice -= sumDiscount;
            DisTextField1.setText("Used");
            remove(jButton4);
            DisPriceLabel.setText(String.valueOf(sumDiscount));
            BillFrame.DisPriceLabel.setText(String.valueOf(sumDiscount));
            JOptionPane.showMessageDialog(this, "Code is Successed");
        } else {
            JOptionPane.showMessageDialog(this, "Code Not Founded");
            DisTextField1.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    BillFrame BillFrame = new BillFrame();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int RandNum = (int) (Math.random() * (max - min + 1) + min);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        try {
            Integer getPay = Integer.valueOf(PayTextflied.getText());
            if (getPay >= sumPrice) {
                BillFrame.show();
                dispose();
                BillFrame.CashLabel2.setText(String.valueOf(getPay));
                BillFrame.ChangeLabel.setText(String.valueOf(getPay - sumPrice));
            }
            if (getPay < sumPrice) {
                JOptionPane.showMessageDialog(this, "More than " + String.valueOf(sumPrice));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Plesase Input in numberic");
        }
        double vat = (sumPrice * 7) / 100;
        BillFrame.DateLabel.setText(formatter.format(date));
        BillFrame.NumLabel.setText(String.valueOf(RandNum));
        BillFrame.AmountLabelAdult1.setText(String.valueOf(Adult));
        BillFrame.AmountLabelKids.setText(String.valueOf(countKids1));
        BillFrame.NameLabel2.setText(FullName);
        BillFrame.VATPriceLabel1.setText(String.valueOf(vat));
        sumPriceTotalLabel.setText(String.valueOf(sumPrice));
        BillFrame.sumPriceTotalLabel.setText(String.valueOf(sumPrice));
        BillFrame.sumPriceAdultLabel1.setText(String.valueOf(Adult * priceAdult));
        BillFrame.SumKidsPriceLabel.setText(String.valueOf(Adult * priceKids));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(summarize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(summarize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(summarize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(summarize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new summarize().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel AmountLabelAdult1;
    public javax.swing.JLabel AmountLabelKids;
    public javax.swing.JLabel DisPriceLabel;
    public javax.swing.JTextField DisTextField1;
    public javax.swing.JLabel NameLabel;
    public javax.swing.JTextField PayTextflied;
    public javax.swing.JLabel SumKidsPriceLabel;
    public javax.swing.JLabel TpyeLabel;
    public javax.swing.JLabel TpyeLabel1;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel sumPriceAdultLabel1;
    public javax.swing.JLabel sumPriceTotalLabel;
    // End of variables declaration//GEN-END:variables
}
