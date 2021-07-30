/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Qualidade
 */
public class ListarCadastro implements Runnable {

    

    @Override
    public void run() {
       
        File produtos = new File("C:\\Emisor\\PRODUTOS");
        buscar(produtos);

        Listar.jButton1.setEnabled(true);
    }

    private void buscar(File file) {
        File[] pastas = file.listFiles();
        if (pastas == null) {
            return;
        }
        for (File arquivo : pastas) {
            if (arquivo == null) {
                continue;
            }
            if (arquivo.isDirectory()) {
                buscar(arquivo);
            } else {
                Listar.caminho.setText(arquivo.getName() + "\n");
                try {
                    abrir(arquivo);
                } catch (Exception e) {

                }
            }
        }
    }

    private void abrir(File caminho) throws IOException {

        Produto prod = new Produto(caminho);
        prod.carregar();
        DefaultTableModel model = (DefaultTableModel) Listar.msg.getModel();

        String[] linha = {prod.getCodigo(), prod.getDescricao(),prod.getUnidade(),prod.getNorma(),prod.getCertificado()};
        model.addRow(linha);
        
        
    }

}
