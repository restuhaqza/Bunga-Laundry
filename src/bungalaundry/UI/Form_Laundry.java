/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bungalaundry.UI;
import bungalaundry.Authenticate;
import bungalaundry.Transaksi;
/**
 *
 * @author Restuhaqza
 */
public class Form_Laundry extends javax.swing.JFrame {

    /**
     * Creates new form Form_Laundry
     */
    
    Authenticate data = new Authenticate();
    double totalHarga;
    Transaksi listTrans = new Transaksi();
    
    public Form_Laundry() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNama = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtOwnerName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        lblWeight = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JSpinner();
        DryCleaning = new javax.swing.JRadioButton();
        FlashClean = new javax.swing.JRadioButton();
        WashingIron = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblNoHp = new javax.swing.JLabel();
        txtNoHp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnTotalHarga = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JTextField();
        btnRiwayatTransaksi = new javax.swing.JButton();
        KilatWashing = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userAdmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(150, 164, 83));

        jPanel1.setBackground(new java.awt.Color(116, 180, 155));

        jPanel2.setBackground(new java.awt.Color(167, 215, 197));

        lblNama.setText("Nama Pemilik");

        lblDesc.setText("Deskripsi");

        lblAddress.setText("Alamat");

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane2.setViewportView(txtDesc);

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        lblWeight.setText("Berat");

        jLabel7.setText("Choose");

        buttonGroup1.add(DryCleaning);
        DryCleaning.setText("Dry Cleaning");
        DryCleaning.setToolTipText("Rp. 3000");
        DryCleaning.setActionCommand("1");

        buttonGroup1.add(FlashClean);
        FlashClean.setText("Kilat Cleaning");
        FlashClean.setToolTipText("Rp. 5000");
        FlashClean.setActionCommand("2");

        buttonGroup1.add(WashingIron);
        WashingIron.setText("Washing Iron");
        WashingIron.setToolTipText("Rp. 4000");
        WashingIron.setActionCommand("3");

        jLabel8.setText("Jarak");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("1 - 5 km");
        jRadioButton4.setToolTipText("Rp 4.000");
        jRadioButton4.setActionCommand("1");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("6 - 10 km");
        jRadioButton5.setToolTipText("Rp 7.000");
        jRadioButton5.setActionCommand("2");

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("10 - 15 km");
        jRadioButton6.setToolTipText("Rp 12.000");
        jRadioButton6.setActionCommand("3");

        btnSave.setText("Simpan");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblNoHp.setText("No. Hp");

        jLabel3.setText("Kg");

        btnTotalHarga.setText("Hitung Harga");
        btnTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalHargaActionPerformed(evt);
            }
        });

        lblTotal.setText("Total Harga");

        txtTotalHarga.setText("0");

        btnRiwayatTransaksi.setText("Lihat Riwayat Transaksi");
        btnRiwayatTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiwayatTransaksiActionPerformed(evt);
            }
        });

        buttonGroup1.add(KilatWashing);
        KilatWashing.setText("Kilat Washing Iron");
        KilatWashing.setToolTipText("Rp. 8000");
        KilatWashing.setActionCommand("4");

        jLabel2.setFont(new java.awt.Font("Cantarell", 3, 12)); // NOI18N
        jLabel2.setText("*Kami tidak melayani ekpedisi > 15 KM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDesc)
                            .addComponent(lblNama)
                            .addComponent(lblNoHp)
                            .addComponent(lblAddress))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addComponent(txtOwnerName)
                            .addComponent(txtNoHp))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWeight)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4)
                            .addComponent(DryCleaning)
                            .addComponent(FlashClean)
                            .addComponent(WashingIron)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton5)
                            .addComponent(KilatWashing)))
                    .addComponent(btnRiwayatTransaksi)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTotalHarga)
                            .addComponent(lblTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWeight)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNama)
                                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDesc)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DryCleaning)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FlashClean)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WashingIron)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KilatWashing)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTotalHarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNoHp)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTotal))
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnReset)
                    .addComponent(btnRiwayatTransaksi))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Input Data Transaksi Laundry");

        userAdmin.setText(data.getUsername());

        jLabel1.setText("Hallo, ");

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userAdmin)
                        .addGap(79, 79, 79)
                        .addComponent(btnLogOut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(userAdmin)
                    .addComponent(btnLogOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reset(){
        txtOwnerName.setText("");
        txtDesc.setText("");
        txtAddress.setText("");
        txtNoHp.setText("");
        txtWeight.setValue(0);
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        txtTotalHarga.setText("");   
    }
    
    private int kalkulasiHarga(){
        int berat;
        String type;
        int type_price = 0;
        String kurir;
        int kurir_price = 0;
        int totalharga;
        
        berat = (int)this.txtWeight.getValue();
        type = this.buttonGroup1.getSelection().getActionCommand();
        if(null != type)switch (type) {
            case "1":
                type_price = 3000;
                break;
            case "2":
                type_price = 5000;
                break;
            case "3":
                type_price = 4000;
                break;
            case "4":
                type_price = 8000;
                break;
            default:
                type_price = 0;
                break;
        }
        
        kurir = this.buttonGroup2.getSelection().getActionCommand();
        if(type_price != 0){
            if(null == kurir) {
            } else {
                switch (kurir) {
                    case "1":
                        kurir_price = 4000;
                        break;
                    case "2":
                        kurir_price = 7000;
                        break;
                    case "3":
                        kurir_price = 12000;
                        break;
                    default:
                        kurir_price = 0;
                        break;
                }
            }
        }
        
       
        if(berat == 0 || type == null){
            totalharga = 0;
        }else{
            totalharga = (berat * type_price) + kurir_price;
        }
        return totalharga;
    }
        
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here: 
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

//    private double totalHarga(){
//        
//    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String nama = this.txtOwnerName.getText();
        String desc = this.txtDesc.getText();
        String alamat = this.txtAddress.getText();
        String nohp = this.txtNoHp.getText();
        int weight = (Integer)this.txtWeight.getValue();
        String Choose = this.buttonGroup1.getSelection().getActionCommand();
        String Kurir = this.buttonGroup2.getSelection().getActionCommand();
        String harga =  this.txtTotalHarga.getText();
        int TotalHarga = Integer.parseInt(harga);
        String cetak;
        //debug data
        this.listTrans.SimpanData(nama,desc,alamat,nohp,weight,Choose,Kurir,TotalHarga);
        cetak = this.listTrans.CetakStruk(nama, desc, alamat, nohp, weight, Choose, Kurir, TotalHarga);
        this.listTrans.showData();
        reset(); 
        StrukPembayaran struk = new StrukPembayaran(cetak);
        struk.setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalHargaActionPerformed
        // TODO add your handling code here
            txtTotalHarga.setText("" + kalkulasiHarga()); 
    }//GEN-LAST:event_btnTotalHargaActionPerformed

    private void btnRiwayatTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiwayatTransaksiActionPerformed
        // TODO add your handling code here:
        RiwayatTransaksi panel = new RiwayatTransaksi();
        panel.ImportData(this.listTrans);
        panel.setVisible(true);
    }//GEN-LAST:event_btnRiwayatTransaksiActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login_Auth().setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Form_Laundry().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DryCleaning;
    private javax.swing.JRadioButton FlashClean;
    private javax.swing.JRadioButton KilatWashing;
    private javax.swing.JRadioButton WashingIron;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRiwayatTransaksi;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTotalHarga;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNoHp;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtNoHp;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtTotalHarga;
    private javax.swing.JSpinner txtWeight;
    private javax.swing.JLabel userAdmin;
    // End of variables declaration//GEN-END:variables
}
