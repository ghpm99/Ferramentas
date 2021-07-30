/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPrincipal;

import Cadastro.Cadastro;
import Certificado.Material;
import Certificados.IncluirXml;
import Certificados.Listar;
import XMLNotas.RelatorioCTE;
import XMLNotas.RelatorioXml;
import ferramentas.MaterialFrame;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Qualidade
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            futuro = sdf.parse("22/09/2014");
            atual = new Date();
            System.out.println(atual);
            System.out.println(futuro);
            System.out.println(atual.after(futuro));
            if(!atual.after(futuro)){
            Inicial.progresso.setValue(25);
            initComponents();
            Material.getInstancia().carregar();
            Inicial.progresso.setValue(95);
            }else{
                JOptionPane.showMessageDialog(null, "SEM LICENÇA");
            }
        } catch (Exception e) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        areaTrabalho = new javax.swing.JDesktopPane();
        imagemFundo = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadastroBut = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emisor");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(200, 112, 1200, 675));
        setIconImage(new ImageIcon("C:\\Emisor\\icone2.png").getImage());
        setMaximumSize(new java.awt.Dimension(9999, 999));
        setMinimumSize(new java.awt.Dimension(1200, 675));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        areaTrabalho.setBackground(new java.awt.Color(255, 255, 255));
        areaTrabalho.setDoubleBuffered(true);
        areaTrabalho.setPreferredSize(new java.awt.Dimension(1200, 675));

        imagemFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIPrincipal/fundo1.png"))); // NOI18N
        imagemFundo.setLabelFor(menuPrincipal);
        imagemFundo.setMaximumSize(new java.awt.Dimension(1200, 675));
        imagemFundo.setMinimumSize(new java.awt.Dimension(1200, 675));
        imagemFundo.setPreferredSize(new java.awt.Dimension(1200, 675));
        areaTrabalho.add(imagemFundo);
        imagemFundo.setBounds(0, 4, 1200, 650);

        jPanel1.add(areaTrabalho, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Cadastro");

        cadastroBut.setText("Cadastro");
        cadastroBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButActionPerformed(evt);
            }
        });
        jMenu1.add(cadastroBut);

        jMenuItem10.setText("Listar Cadastro");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        menuPrincipal.add(jMenu1);

        jMenu2.setText("Certificados");

        jMenuItem4.setText("Certificado");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem12.setText("Incluir Xml");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem7.setText("Listar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Renomear Ori.");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        menuPrincipal.add(jMenu2);

        jMenu3.setText("Notas");

        jMenuItem9.setText("Renomear");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem13.setText("Renomear Cte");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        menuPrincipal.add(jMenu3);

        jMenu5.setText("Tabela");

        jMenuItem1.setText("Materiais");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem2.setText("Contas");
        jMenu5.add(jMenuItem2);

        menuPrincipal.add(jMenu5);

        jMenu4.setText("Sobre");

        jMenuItem11.setText("Sobre");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        menuPrincipal.add(jMenu4);

        setJMenuBar(menuPrincipal);

        setSize(new java.awt.Dimension(1216, 713));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButActionPerformed
        // TODO add your handling code here:

        areaTrabalho.add(Cadastro.getInstancia());
        menuPrincipal.setVisible(false);
        Cadastro.getInstancia().setVisible(true);
    }//GEN-LAST:event_cadastroButActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:

        areaTrabalho.add(Cadastro.getInstancia());
        menuPrincipal.setVisible(false);
        Cadastro.getInstancia().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Certificados.Renomear renomear = new Certificados.Renomear();
        areaTrabalho.add(renomear);
        menuPrincipal.setVisible(false);
        renomear.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        new RelatorioXml().criar();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        certificadoListar = new Certificados.Listar();
        areaTrabalho.add(certificadoListar);
        menuPrincipal.setVisible(false);
        certificadoListar.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Listar cadastroListar = new Listar();
        areaTrabalho.add(cadastroListar);
        menuPrincipal.setVisible(false);
        cadastroListar.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Versao: " + Sobre.getVersao() + "\nAutor:" + Sobre.getAutor() + "\n" + Sobre.getFrase());
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        IncluirXml.getInstancia().setPai(this);
        areaTrabalho.add(IncluirXml.getInstancia());
        menuPrincipal.setVisible(false);
        IncluirXml.getInstancia().setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        new RelatorioCTE().criar();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        MaterialFrame frame = new MaterialFrame();
        areaTrabalho.add(frame);
        menuPrincipal.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static Certificados.Listar certificadoListar;
    private Date atual, futuro;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JMenuItem cadastroBut;
    private javax.swing.JLabel imagemFundo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}