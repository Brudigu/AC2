package catalago.rick.e.morty;

import conexoes.MySQL;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetos.ProdutosDados;

public class catalago extends javax.swing.JFrame {
     MySQL conectar = new MySQL();
     ProdutosDados novoProduto = new ProdutosDados();
     String primeiroProduto = "Camiseta de frases Cor preta";
     String segundoProduto = "Caneca porcelana Rick ilustração";
     String terceiroProduto = "Chinelo slide Rick picles";
     String quartoProduto = "Funko POP portal gun";
     String quintoProduto = "Quadro decorativo";
     String sextoProduto = "Short de picles do Rick";
     
    public catalago() {
        initComponents();
    }
   private void comprarProduto1(){
        this.conectar.conectaBanco();
        try {            
            this.conectar.updateSQL(
                "UPDATE  cadastroprodutos "
                + " SET produto_quantidade = produto_quantidade - 1 "
                + " WHERE "
                    + "produto_nome = '" + primeiroProduto + "'"
                + ";"            
            );
        } catch (Exception e) {
            System.out.println("Erro ao comprar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao comprar o produto");
        }finally{
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Sua compra foi feita!");            
        }
        }
   private void comprarProduto2(){
        this.conectar.conectaBanco();
        try {            
            this.conectar.updateSQL(
                "UPDATE  cadastroprodutos "
                + " SET produto_quantidade = produto_quantidade - 1 "
                + " WHERE "
                    + "produto_nome = '" + segundoProduto + "'"
                + ";"            
            );
        } catch (Exception e) {
            System.out.println("Erro ao comprar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao comprar o produto");
        }finally{
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Sua compra foi feita!");            
        }
        }
   private void comprarProduto3(){
        this.conectar.conectaBanco();
        try {            
            this.conectar.updateSQL(
                "UPDATE  cadastroprodutos "
                + " SET produto_quantidade = produto_quantidade - 1 "
                + " WHERE "
                    + "produto_nome = '" + terceiroProduto + "'"
                + ";"            
            );
        } catch (Exception e) {
            System.out.println("Erro ao comprar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao comprar o produto");
        }finally{
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Sua compra foi feita!");            
        }
        }
   private void comprarProduto4(){
        this.conectar.conectaBanco();
        try {            
            this.conectar.updateSQL(
                "UPDATE  cadastroprodutos "
                + " SET produto_quantidade = produto_quantidade - 1 "
                + " WHERE "
                    + "produto_nome = '" + quartoProduto + "'"
                + ";"            
            );
        } catch (Exception e) {
            System.out.println("Erro ao comprar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao comprar o produto");
        }finally{
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Sua compra foi feita!");            
        }
        }
   private void comprarProduto5(){
        this.conectar.conectaBanco();
        try {            
            this.conectar.updateSQL(
                "UPDATE  cadastroprodutos "
                + " SET produto_quantidade = produto_quantidade - 1 "
                + " WHERE "
                    + "produto_nome = '" + quintoProduto + "'"
                + ";"            
            );
        } catch (Exception e) {
            System.out.println("Erro ao comprar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao comprar o produto");
        }finally{
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Sua compra foi feita!");            
        }
        }
   private void comprarProduto6(){
        this.conectar.conectaBanco();
        try {            
            this.conectar.updateSQL(
                "UPDATE  cadastroprodutos "
                + " SET produto_quantidade = produto_quantidade - 1 "
                + " WHERE "
                    + "produto_nome = '" + sextoProduto + "'"
                + ";"            
            );
        } catch (Exception e) {
            System.out.println("Erro ao comprar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao comprar o produto");
        }finally{
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Sua compra foi feita!");            
        }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Catálago de compras");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_catalago/icon.png"))); // NOI18N
        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setText("CATÁLAGO");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_catalago/camisetaimg.jpg.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_catalago/canecaimg.jpg.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_catalago/chineloimg.jpg.png"))); // NOI18N

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_catalago/icon.png"))); // NOI18N
        jButton2.setText("Comprar");

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_catalago/icon.png"))); // NOI18N
        jButton3.setText("Comprar");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_catalago/colecionavelimg.jpg.png"))); // NOI18N
        jLabel5.setToolTipText("");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_catalago/quadroimg.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_catalago/shortimg.jpg.png"))); // NOI18N

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_catalago/icon.png"))); // NOI18N
        jButton4.setText("Comprar");

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_catalago/icon.png"))); // NOI18N
        jButton5.setText("Comprar");

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_catalago/icon.png"))); // NOI18N
        jButton6.setText("Comprar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(132, 132, 132)
                .addComponent(jButton6)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(140, 140, 140)
                .addComponent(jButton3)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))))
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 11, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 870, 897);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        comprarProduto1();
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
            java.util.logging.Logger.getLogger(catalago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(catalago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(catalago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(catalago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new catalago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
