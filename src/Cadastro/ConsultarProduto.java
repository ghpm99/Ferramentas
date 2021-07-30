/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Qualidade
 */
public class ConsultarProduto {

    private static Produto produto;
    private static File[] produtos;
    private static int leng;

    public static Produto consultar(String prod) throws IOException {

        
            // File loca = new File("C:\\Emisor\\PRODUTOS\\" + prod.substring(0, 1) + "\\" + prod + ".txt");
            produtos = new File(Referencias.PASTACERTIFICADOS + prod.substring(0, 1) + Referencias.BARRA).listFiles();
            
            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i].getName().equals(prod + Referencias.TXT)) {
                    leng = i;
                }
            }
            produto = new Produto(produtos[leng]);
            produto.carregar();
            return produto;
        
    }

    public static Produto proximo() throws IOException {
        leng++;
        verificar();
        return new Produto(produtos[leng],true);
    }

    private static void verificar() {
        if (leng > produtos.length) {
            leng = 0;
        }
        if (leng < 0) {
            leng = produtos.length;
        }
    }

    public static Produto anterior() throws IOException {
        leng--;
        verificar();
        return new Produto(produtos[leng],true);
    }

}
