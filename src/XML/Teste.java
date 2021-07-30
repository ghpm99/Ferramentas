/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;

import Cadastro.Produto;
import Certificado.Item;
import Cadastro.Referencias;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qualidade
 */
public class Teste {

    public static void main(String[] args) {
        
        gerarCadastro();
        
    }

    private static void gerarCadastro() {
        buscar(new File("C:\\XMLFORNECEDORES\\"));

    }

    private static void buscar(File file) {
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
                try {
                    abrir(arquivo);
                } catch (IOException ex) {
                    Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private static void abrir(File arquivo) throws IOException {
        String caminho = arquivo.getParentFile().getParentFile().getName();
        String nome = arquivo.getName();
        BufferedWriter buff = new BufferedWriter(new FileWriter(new File("C:\\Notas.txt"), true));
        buff.write(caminho + " Nfe: " + nome);
        buff.newLine();
        buff.flush();
        buff.close();
        
    }

}
