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
public class IncluirProduto {

    
    private static File cadastro;
    private static Produto produto;

    public static Produto incluir(String codigo) throws IOException {
      
        cadastro = new File(Referencias.PASTACERTIFICADOS + codigo.substring(0, 1) + Referencias.BARRA + codigo + Referencias.TXT);
        if(cadastro.exists()){
            return null;
        }
        cadastro.createNewFile();
        
        produto = new Produto(cadastro);
        
        return produto;
    }

    
    
}
