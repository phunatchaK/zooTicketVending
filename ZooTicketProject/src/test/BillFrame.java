/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;
  
/**
 *
 * @author MaZZ
 */
public class BillFrame extends javax.swing.JFrame {

    int countAdult1 = 0;
    int countKids1 = 0;
    int combname;
    int sumPrice = 0;
    String Lastname, FisrtName;

    /**
     * Creates new form BillFrame
     */
    public BillFrame() {
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

        NameLabel3 = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        sumPriceAdultLabel1 = new javax.swing.JLabel();
        AmountLabelAdult1 = new javax.swing.JLabel();
        TpyeLabel = new javax.swing.JLabel();
        SumKidsPriceLabel = new javax.swing.JLabel();
        AmountLabelKids = new javax.swing.JLabel();
        sumPriceTotalLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        DisPriceLabel = new javax.swing.JLabel();
        TpyeLabel1 = new javax.swing.JLabel();
        NameLabel2 = new javax.swing.JLabel();
        NumLabel = new javax.swing.JLabel();
        NameLabel4 = new javax.swing.JLabel();
        NameLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        VATPriceLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        CashLabel2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ChangeLabel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        NameLabel3.setText("Date");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(414, 318));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DateLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DateLabel.setText("Date");
        getContentPane().add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        sumPriceAdultLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sumPriceAdultLabel1.setText("0");
        getContentPane().add(sumPriceAdultLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        AmountLabelAdult1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AmountLabelAdult1.setText("0");
        getContentPane().add(AmountLabelAdult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        TpyeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TpyeLabel.setText("Adult");
        getContentPane().add(TpyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        SumKidsPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SumKidsPriceLabel.setText("0");
        getContentPane().add(SumKidsPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        AmountLabelKids.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AmountLabelKids.setText("0");
        getContentPane().add(AmountLabelKids, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        sumPriceTotalLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sumPriceTotalLabel.setText("0");
        getContentPane().add(sumPriceTotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Price");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("VAT");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Bath");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Bath");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Bath");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Bath");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        DisPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DisPriceLabel.setText("0");
        getContentPane().add(DisPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        TpyeLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TpyeLabel1.setText("Kids");
        getContentPane().add(TpyeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        NameLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NameLabel2.setText("Name Ticket");
        getContentPane().add(NameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        NumLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NumLabel.setText("No.");
        getContentPane().add(NumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        NameLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NameLabel4.setText("Date");
        getContentPane().add(NameLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        NameLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NameLabel5.setText("No.");
        getContentPane().add(NameLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Amount");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Total");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        VATPriceLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VATPriceLabel1.setText("0");
        getContentPane().add(VATPriceLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Bath");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabel22.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel22.setText("Thank you for your buy");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        CashLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CashLabel2.setText("0");
        getContentPane().add(CashLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Bath");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        ChangeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ChangeLabel.setText("0");
        getContentPane().add(ChangeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Cash/Change");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Stencil", 3, 24)); // NOI18N
        jLabel9.setText("Zoo Ticket");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 151, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Discount");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/White_full.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 470, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel AmountLabelAdult1;
    public javax.swing.JLabel AmountLabelKids;
    public javax.swing.JLabel CashLabel2;
    public javax.swing.JLabel ChangeLabel;
    public javax.swing.JLabel DateLabel;
    public javax.swing.JLabel DisPriceLabel;
    public javax.swing.JLabel NameLabel2;
    public javax.swing.JLabel NameLabel3;
    public javax.swing.JLabel NameLabel4;
    public javax.swing.JLabel NameLabel5;
    public javax.swing.JLabel NumLabel;
    public javax.swing.JLabel SumKidsPriceLabel;
    public javax.swing.JLabel TpyeLabel;
    public javax.swing.JLabel TpyeLabel1;
    public javax.swing.JLabel VATPriceLabel1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JLabel sumPriceAdultLabel1;
    public javax.swing.JLabel sumPriceTotalLabel;
    // End of variables declaration//GEN-END:variables
}
