/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Certificados;

import Cadastro.Produto;
import Cadastro.Referencias;
import GUIPrincipal.Inicial;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Qualidade
 */
public class Incluir extends javax.swing.JInternalFrame implements Runnable {

    //variaveis
    private Produto produto;
    private Fornecedores fornecedor;

    /**
     * Creates new form Incluir
     */
    public Incluir() {
        fornecedor = new Fornecedores();
        initComponents();
        addFornecedores();
        nCertificado.setText(Certificado.getNumeroCertificado());
    }

    private void addFornecedores() {
        String[] forn = fornecedor.getFornecedores();
        for (String a : forn) {
            cliente.addItem(a.split(";")[0]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cliente = new javax.swing.JComboBox();
        cnpj = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nNota = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nPedido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        codProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        valorQnt = new javax.swing.JTextField();
        unidadeQnt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tratamento = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        complemento = new javax.swing.JTextField();
        complementoValor = new javax.swing.JTextField();
        incluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensagem = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        nCertificado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        norma = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        nCertOrig = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        composicao = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        caracteristica = new javax.swing.JTextArea();
        descricao = new javax.swing.JTextField();
        imprimir = new javax.swing.JCheckBox();

        setClosable(true);
        setTitle("Incluir - Certificado");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Cadastro/icone2.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 360, -1));
        getContentPane().add(cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 11, 300, 14));

        jLabel2.setText("Nº Nota:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 106, -1));
        getContentPane().add(nNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 117, -1));

        jLabel3.setText("Nº Pedido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, 107, -1));

        nPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(nPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, 107, -1));

        jLabel4.setText("Item:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 62, 122, -1));

        codProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProdutoActionPerformed(evt);
            }
        });
        codProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codProdutoFocusLost(evt);
            }
        });
        getContentPane().add(codProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 82, 122, -1));

        jLabel5.setText("Quantidade:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 104, -1));
        getContentPane().add(valorQnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 94, -1));
        getContentPane().add(unidadeQnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 32, 20));

        jLabel7.setText("Tratamento:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 113, 100, -1));

        tratamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem Tratamento", "Zincado Branco", "Zincado Amarelo", "Zincado Preto", "Zincado Fogo", "Polido", "Oxidado" }));
        getContentPane().add(tratamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 133, 140, -1));

        jLabel8.setText("Complemento:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, -1, -1));
        getContentPane().add(complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, 200, -1));
        getContentPane().add(complementoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 133, 176, -1));

        incluir.setText("Incluir");
        incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirActionPerformed(evt);
            }
        });
        getContentPane().add(incluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 387, -1, -1));

        mensagem.setEditable(false);
        mensagem.setColumns(20);
        mensagem.setForeground(new java.awt.Color(204, 0, 0));
        mensagem.setRows(5);
        mensagem.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        jScrollPane1.setViewportView(mensagem);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, 394, 239));

        jLabel6.setText("Nº Certificado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        nCertificado.setEditable(false);
        getContentPane().add(nCertificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 100, -1));

        jLabel9.setText("Descrição:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 62, 253, -1));

        jLabel10.setText("Norma:");

        norma.setEditable(false);

        jLabel11.setText("Nº Cert. Origi:");

        nCertOrig.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(norma))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nCertOrig, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(norma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nCertOrig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Geral", jPanel1);

        composicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Composição", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(composicao);

        jTabbedPane1.addTab("Quimica", jScrollPane2);

        caracteristica.setEditable(false);
        caracteristica.setColumns(20);
        caracteristica.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        caracteristica.setRows(5);
        jScrollPane3.setViewportView(caracteristica);

        jTabbedPane1.addTab("Fisica", jScrollPane3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 260, 210));

        descricao.setEditable(false);
        getContentPane().add(descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 82, 253, -1));

        imprimir.setText("Imprimir");
        getContentPane().add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nPedidoActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        Inicial.principal.menuPrincipal.setVisible(true);
    }//GEN-LAST:event_formInternalFrameClosing

    private void codProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codProdutoFocusLost
       
            // TODO add your handling code here:
            produto = new Produto(new File(Referencias.PASTACERTIFICADOS + codProduto.getText().substring(0, 1) + Referencias.BARRA + codProduto.getText() + Referencias.TXT), true);
            descricao.setText(produto.getDescricao());
            unidadeQnt.setText(produto.getUnidade());
            norma.setText(produto.getNorma());
            nCertOrig.setText(produto.getCertificado());

            composicao.setValueAt(produto.getQ1(), 0, 0);
            composicao.setValueAt(produto.getV1(), 0, 1);
            composicao.setValueAt(produto.getQ2(), 1, 0);
            composicao.setValueAt(produto.getV2(), 1, 1);
            composicao.setValueAt(produto.getQ3(), 2, 0);
            composicao.setValueAt(produto.getV3(), 2, 1);
            composicao.setValueAt(produto.getQ4(), 3, 0);
            composicao.setValueAt(produto.getV4(), 3, 1);
            composicao.setValueAt(produto.getQ5(), 4, 0);
            composicao.setValueAt(produto.getV5(), 4, 1);
            composicao.setValueAt(produto.getQ6(), 5, 0);
            composicao.setValueAt(produto.getV6(), 5, 1);
            composicao.setValueAt(produto.getQ7(), 6, 0);
            composicao.setValueAt(produto.getV7(), 6, 1);
            composicao.setValueAt(produto.getQ8(), 7, 0);
            composicao.setValueAt(produto.getV8(), 7, 1);
            composicao.setValueAt(produto.getQ9(), 8, 0);
            composicao.setValueAt(produto.getV9(), 8, 1);
            composicao.setValueAt(produto.getQ10(), 9, 0);
            composicao.setValueAt(produto.getV10(), 9, 1);
            composicao.setValueAt(produto.getQ11(), 10, 0);
            composicao.setValueAt(produto.getV11(), 10, 1);
            composicao.setValueAt(produto.getQ12(), 11, 0);
            composicao.setValueAt(produto.getV12(), 11, 1);
            composicao.setValueAt(produto.getQ13(), 12, 0);
            composicao.setValueAt(produto.getV13(), 12, 1);
            composicao.setValueAt(produto.getQ14(), 13, 0);
            composicao.setValueAt(produto.getV14(), 13, 1);

            caracteristica.setText(produto.getCaracteristica());

        

    }//GEN-LAST:event_codProdutoFocusLost

    //private static StringBuffer msg = new StringBuffer();

    public static void addMsg(String arg0) {
       // msg.append(arg0).append(Referencias.QUEBRA);
        //mensagem.setText(msg.toString());
        mensagem.append(arg0 + "\n");
    }

    private void incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirActionPerformed
        // TODO add your handling code here:
        incluir.setEnabled(false);
        mensagem.setText("");
        new Thread(this).start();
    }//GEN-LAST:event_incluirActionPerformed

    public static void imprimir(String certificado) {
        try {
            //PDDocument pdf = PDDocument.load(new File("C:\\Emisor\\Certificados\\" + certificado + ".pdf"));
            
            Desktop.getDesktop().print(new File("C:\\Emisor\\Certificados\\" + certificado + ".pdf"));
            //pdf.print(PrinterJob.getPrinterJob());
            //pdf.close();
       } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
        cnpj.setText(fornecedor.getCNPJ(cliente.getSelectedIndex()));
    }//GEN-LAST:event_clienteActionPerformed

    private void codProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea caracteristica;
    private javax.swing.JComboBox cliente;
    private javax.swing.JLabel cnpj;
    private javax.swing.JTextField codProduto;
    private javax.swing.JTextField complemento;
    private javax.swing.JTextField complementoValor;
    private javax.swing.JTable composicao;
    private javax.swing.JTextField descricao;
    private javax.swing.JCheckBox imprimir;
    private javax.swing.JButton incluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTextArea mensagem;
    private javax.swing.JTextField nCertOrig;
    private javax.swing.JTextField nCertificado;
    private javax.swing.JTextField nNota;
    private javax.swing.JTextField nPedido;
    private javax.swing.JTextField norma;
    private javax.swing.JComboBox tratamento;
    private javax.swing.JLabel unidadeQnt;
    private javax.swing.JTextField valorQnt;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
       try {

            addMsg(Certificado.setCnpj(cnpj.getText()));
            
            addMsg(Certificado.setCliente((String) cliente.getSelectedItem()));
            
            addMsg(Certificado.setPedido(nPedido.getText()));
            
            addMsg(Certificado.setNota(nNota.getText()));
            
            addMsg(Certificado.setQnt(valorQnt.getText() + " " + unidadeQnt.getText()));
            
            addMsg(Certificado.setProduto(new Produto(Referencias.getPastaCertificados(codProduto.getText()), true)));
            
            addMsg(Certificado.setComplemento(complemento.getText()));
            
            addMsg(Certificado.setComplementoValor(complementoValor.getText()));
            
            addMsg(Certificado.setTratamento((String) tratamento.getSelectedItem()));

            if (!IncluirCertificado.verificar()) {
                addMsg(IncluirCertificado.msg().toString());
                incluir.setText("Verificar");
            } else {
                addMsg(IncluirCertificado.msg().toString());
                incluir.setText("Incluiu");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Falhou");
        } finally {
            nCertificado.setText(Certificado.getNumeroCertificado());
           // msg.delete(0, msg.length());
            incluir.setEnabled(true);
        }
        
        if(imprimir.isSelected()){
            imprimir(Certificado.getNumeroCertificado());
        }
        
    }
}