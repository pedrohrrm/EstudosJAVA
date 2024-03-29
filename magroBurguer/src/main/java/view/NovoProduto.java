/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author pedro
 */
public class NovoProduto extends javax.swing.JFrame {

    /**
     * Creates new form NovoProduto
     */
    public NovoProduto() {
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

        NomeProduto = new javax.swing.JLabel();
        CaixaTextoNomeProduto = new javax.swing.JTextField();
        IngredientesProduto = new javax.swing.JLabel();
        CaixaTextoIngredientesProduto = new javax.swing.JTextField();
        ValorProduto = new javax.swing.JLabel();
        CaixaTextoValorProduto = new javax.swing.JTextField();
        BotaoCadastrar = new javax.swing.JButton();
        DescricaoProduto = new javax.swing.JLabel();
        CaixaDescricaoProduto = new javax.swing.JTextField();
        FundoCadastroFuncionario = new javax.swing.JLabel();
        FundoPrincipal = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        BotaoCadastroFuncionario = new javax.swing.JMenuItem();
        BotaoCadastroCliente = new javax.swing.JMenuItem();
        ProdutosBebidas = new javax.swing.JMenuItem();
        ProdutoLanches = new javax.swing.JMenuItem();
        MenuPedidos = new javax.swing.JMenu();
        IncluirPedido = new javax.swing.JMenuItem();
        EditarPedido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NomeProduto.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        NomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        NomeProduto.setText("Nome:");
        getContentPane().add(NomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, -1, -1));

        CaixaTextoNomeProduto.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(CaixaTextoNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 290, 370, -1));

        IngredientesProduto.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        IngredientesProduto.setForeground(new java.awt.Color(255, 255, 255));
        IngredientesProduto.setText("Ingredientes:");
        getContentPane().add(IngredientesProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, -1, -1));

        CaixaTextoIngredientesProduto.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(CaixaTextoIngredientesProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 330, 370, -1));

        ValorProduto.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        ValorProduto.setForeground(new java.awt.Color(255, 255, 255));
        ValorProduto.setText("Valor:");
        getContentPane().add(ValorProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, -1, -1));

        CaixaTextoValorProduto.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(CaixaTextoValorProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, 370, -1));

        BotaoCadastrar.setBackground(new java.awt.Color(204, 255, 255));
        BotaoCadastrar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        BotaoCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 440, -1, -1));

        DescricaoProduto.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        DescricaoProduto.setForeground(new java.awt.Color(255, 255, 255));
        DescricaoProduto.setText("Descrição:");
        getContentPane().add(DescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, -1, -1));

        CaixaDescricaoProduto.setBackground(new java.awt.Color(255, 255, 255));
        CaixaDescricaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaDescricaoProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(CaixaDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 410, 370, -1));

        FundoCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewImagens/FundoDosCadastros.png"))); // NOI18N
        FundoCadastroFuncionario.setText("jLabel1");
        getContentPane().add(FundoCadastroFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        FundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewImagens/MenuPrincipal.png"))); // NOI18N
        getContentPane().add(FundoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuCadastro.setText("Cadastro");

        BotaoCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewImagens/Icons/Funcionário.png"))); // NOI18N
        BotaoCadastroFuncionario.setText("Funcionário");
        BotaoCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroFuncionarioActionPerformed(evt);
            }
        });
        MenuCadastro.add(BotaoCadastroFuncionario);

        BotaoCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewImagens/Icons/Cliente.png"))); // NOI18N
        BotaoCadastroCliente.setText("Cliente");
        BotaoCadastroCliente.setMinimumSize(new java.awt.Dimension(144, 42));
        BotaoCadastroCliente.setPreferredSize(new java.awt.Dimension(144, 42));
        BotaoCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroClienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(BotaoCadastroCliente);

        ProdutosBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewImagens/Icons/Refri.png"))); // NOI18N
        ProdutosBebidas.setText("Bebidas");
        MenuCadastro.add(ProdutosBebidas);

        ProdutoLanches.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewImagens/Icons/Hamburger.png"))); // NOI18N
        ProdutoLanches.setText("Lanches");
        ProdutoLanches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutoLanchesActionPerformed(evt);
            }
        });
        MenuCadastro.add(ProdutoLanches);

        BarraMenu.add(MenuCadastro);

        MenuPedidos.setText("Pedido");

        IncluirPedido.setText("Incluir Pedido");
        IncluirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncluirPedidoActionPerformed(evt);
            }
        });
        MenuPedidos.add(IncluirPedido);

        EditarPedido.setText("Editar Pedido");
        EditarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarPedidoActionPerformed(evt);
            }
        });
        MenuPedidos.add(EditarPedido);

        BarraMenu.add(MenuPedidos);

        setJMenuBar(BarraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCadastroFuncionarioActionPerformed

    private void BotaoCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCadastroClienteActionPerformed

    private void ProdutoLanchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutoLanchesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdutoLanchesActionPerformed

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void CaixaDescricaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaDescricaoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaDescricaoProdutoActionPerformed

    private void IncluirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncluirPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IncluirPedidoActionPerformed

    private void EditarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditarPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JMenuItem BotaoCadastroCliente;
    private javax.swing.JMenuItem BotaoCadastroFuncionario;
    private javax.swing.JTextField CaixaDescricaoProduto;
    private javax.swing.JTextField CaixaTextoIngredientesProduto;
    private javax.swing.JTextField CaixaTextoNomeProduto;
    private javax.swing.JTextField CaixaTextoValorProduto;
    private javax.swing.JLabel DescricaoProduto;
    private javax.swing.JMenuItem EditarPedido;
    private javax.swing.JLabel FundoCadastroFuncionario;
    private javax.swing.JLabel FundoPrincipal;
    private javax.swing.JMenuItem IncluirPedido;
    private javax.swing.JLabel IngredientesProduto;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenu MenuPedidos;
    private javax.swing.JLabel NomeProduto;
    private javax.swing.JMenuItem ProdutoLanches;
    private javax.swing.JMenuItem ProdutosBebidas;
    private javax.swing.JLabel ValorProduto;
    // End of variables declaration//GEN-END:variables
}
