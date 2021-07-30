/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cadastro;

import java.io.File;

/**
 *
 * @author Qualidade
 */
public class Referencias {
    
   
    public static final String PASTADATA = "C:\\Emisor\\cert\\";
    public static final String PASTACERTIFICADOS = "C:\\Emisor\\PRODUTOS\\";
    public static final String PASTACADASTRO = "C:\\Emisor\\CADASTRO\\";
    public static final String PASTANOTA = "C:\\Emisor\\NOTAS\\";
    public static final String PASTAODT = "C:\\Emisor\\ODT\\";
    public static final String PASTAEMISOR = "C:\\Emisor\\";
    public static final String PASTAPDF = "C:\\Emisor\\Certificados\\";
    public static final String PASTADATAE = "E:\\data\\";
    public static final String PASTAPDFE = "E:\\PDF\\";
    public static final String BARRA = "\\";
    public static final String ARQUIVOERRO = "C:\\Emisor\\PRODUTOS\\E\\ERRO.txt";
    public static final String TXT = ".txt";
    public static final String CERT = ".cert";
    public static final String XML = ".xml";
    
    public static final String PROPRIEDADE = "Propriedade: ";
    public static final String UNIDADE = " Unidade: ";
    public static final String VALOR = " Valor: ";
    public static final String QUEBRA = "\n";
    
    
    
    public static File getPastaCertificados(String arg0){
        return new File(PASTACERTIFICADOS + arg0.substring(0, 1) + BARRA + arg0 + TXT);
    }
    
}
