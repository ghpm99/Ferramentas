/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Certificados;

import Cadastro.Produto;
import Cadastro.Referencias;
import GUIPrincipal.MenuPrincipal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Qualidade
 */
public class ListarCertificados implements Runnable {

    @Override
    public void run() {
        File certifi = new File(Referencias.PASTADATA);
        File[] certi = new File[certifi.listFiles().length];
        certi = certifi.listFiles();
        String numero, nota, cliente, quantidade;
       
        Produto produto;

        for (File a : certi) {

            try {
                BufferedReader buff = new BufferedReader(new FileReader(a));

                numero = buff.readLine();
                buff.readLine();
                nota = buff.readLine();
                buff.readLine();
                cliente = buff.readLine();

                String pro = buff.readLine();

                produto = new Produto(new File(Referencias.PASTACERTIFICADOS + pro.substring(0, 1) + Referencias.BARRA + pro + Referencias.TXT), true);

                quantidade = buff.readLine();
                //tring antes = MenuPrincipal.certificadoListar.msg.getText();
                DefaultTableModel model = (DefaultTableModel) Certificados.Listar.msg.getModel();

        String[] linha = {numero,cliente,nota,produto.getCodigo(),produto.getDescricao(),quantidade};
        model.addRow(linha);
               // MenuPrincipal.certificadoListar.msg.append(numero + " - " + cliente + " - " + nota + " - " + produto.getCodigo() + " - " + produto.getDescricao() + " - " + quantidade + "\n");

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                MenuPrincipal.certificadoListar.status.setText(a.getName());
            }

        }
        Certificados.Listar.listar.setEnabled(true);
    }

}
