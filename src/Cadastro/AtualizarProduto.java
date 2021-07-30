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
public class AtualizarProduto {

    private static File produto;
    private static Produto produt;

    public static Produto atualizar(String produ) throws IOException {
        produto = new File(Referencias.PASTACERTIFICADOS + produ.substring(0, 1) + Referencias.BARRA + produ + Referencias.TXT);
        produt = new Produto(produto);
        produt.carregar();
        return produt;
    }

}
