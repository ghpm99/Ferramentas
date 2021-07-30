/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Certificados;

import Cadastro.Produto;
import Cadastro.Referencias;
import java.io.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qualidade
 */
public class Certificado {

    private static Produto produto;

    private static int numero;

    private long cnpj;
    
    private static String cliente, nPedido, nNota, quantidade,
            complemento, complementoValor, tratamento;

    public Certificado(int nume, boolean salvar) throws IOException {
        this(nume);
        numero = nume;
        System.out.println(numero);

        Salvar.salvar();
    }

    public Certificado(int numero) throws FileNotFoundException, IOException {

        File certificad = new File(Referencias.PASTADATA + numero + Referencias.CERT);

        BufferedReader buff = new BufferedReader(new FileReader(certificad));

        Certificado.numero = Integer.parseInt(buff.readLine());
        nPedido = buff.readLine();
        nNota = buff.readLine();
        cnpj = Long.valueOf(buff.readLine());
        cliente = buff.readLine();

        String pro = buff.readLine();

        produto = new Produto(new File(Referencias.PASTACERTIFICADOS + pro.substring(0, 1) + Referencias.BARRA + pro + Referencias.TXT), true);

        quantidade = buff.readLine();
        tratamento = buff.readLine();
        complemento = buff.readLine();
        complementoValor = buff.readLine();

    }

    public static int getNumero() {
        return numero;
    }

    public static String getPedido() {
        return nPedido;
    }

    public static String getNota() {
        return nNota;
    }

    public static long getCNPJ() {
        return cnpj;
    }

    public static String getCliente() {
        return cliente;
    }

    public static Produto getProduto() {
        return produto;
    }

    public static String getQnt() {
        return quantidade;
    }

    public static String getTratamento() {
        return tratamento;

    }

    public static String getComplemento() {
        return complemento;
    }

    public static String getComplementoDescricao() {
        return complementoValor;
    }

    public static String setProduto(Produto arg0) {

        produto = arg0;
        return "Setando Produto para " + arg0.getCodigo();
    }

    public static String setQnt(String arg0) {
        quantidade = arg0;
        return "Setando quantidade para " + arg0 + ".";
    }

    public static String setPedido(String arg0) {
        nPedido = arg0;
        return "Setando Pedido para " + arg0 + ".";
    }

    public static String setComplemento(String arg0) {
        complemento = arg0;
        return "Setando Complemento para " + arg0 + ".";
    }

    public static String setComplementoValor(String arg0) {

        complementoValor = arg0;
        return "Setando ComplementoValor para " + arg0 + ".";
    }

    public static String setCnpj(long arg0) {

        cnpj = arg0;
        return "Setando CNPJ para " + arg0 + ".";
    }

    public static String setCliente(String arg0) {

        cliente = arg0;
        return "Setando Cliente para " + arg0 + ".";
    }

    public static String setNota(String arg0) {

        nNota = arg0;
        return "Setando Nota para " + arg0 + ".";
    }

    public static String setNumero(int arg0) {

        numero = arg0;
        return "Setando Numero para " + arg0 + ".";
    }

    public static String setTratamento(String arg0) {

        tratamento = arg0;
        return "Setando Tratamento para " + arg0 + ".";
    }

    public static synchronized void gerarNumero() {
        File file = null;
        try {
            file = new File("C:\\Emisor\\config.data");

            Properties pro = new Properties();

            pro.load(new FileInputStream(file));

            setNumero(Integer.parseInt(pro.getProperty("numero")) + 1);
            
            System.out.println(numero);

            pro.setProperty("numero", String.valueOf(Integer.parseInt(pro.getProperty("numero")) + 1));

            pro.store(new FileOutputStream(file), "Configuracoes");
        } catch (Exception e) {
            System.out.println("Falhou");
            return;
        }
    }

    public static void salvar() {
        gerarNumero();
        salvar(getNumero());

    }

    public static void salvar(int numero) {

        File certifi = new File(Referencias.PASTADATA + numero + Referencias.CERT);
        BufferedWriter buff = null;

        try {

            buff = new BufferedWriter(new FileWriter(certifi));

            buff.write(numero + Referencias.QUEBRA);
            buff.write(nPedido + Referencias.QUEBRA);
            buff.write(nNota + Referencias.QUEBRA);
            buff.write(cnpj + Referencias.QUEBRA);
            buff.write(cliente + Referencias.QUEBRA);
            buff.write(produto.getCodigo() + Referencias.QUEBRA);
            buff.write(quantidade + Referencias.QUEBRA);
            buff.write(tratamento + Referencias.QUEBRA);
            buff.write(complemento + Referencias.QUEBRA);
            buff.write(complementoValor + Referencias.QUEBRA);

            Salvar.salvar();

        } catch (Exception e) {

        } finally {
            try {
                buff.flush();
                buff.close();
            } catch (IOException ex) {
                Logger.getLogger(Certificado.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static String getNumeroCertificado() {
        try {
            File file = new File("C:\\Emisor\\config.data");

            Properties pro = new Properties();

            pro.load(new FileInputStream(file));

            return pro.getProperty("numero");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Certificado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Certificado.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
