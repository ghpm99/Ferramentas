/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;

import Cadastro.Referencias;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Qualidade
 */
public class Produtos {

    private String codigo, descricao, quantidade,tratamento;
    private Properties pro;

    public Produtos(String arg0, String arg1, String arg2) {
        codigo = arg0.replaceAll(" ", "");
        descricao = arg1;
        quantidade = arg2;
        pro = new Properties();
        abrir();
    }

    public String getQuantidade() {
        return quantidade;
    }

    private void abrir() {
        try {
            this.pro.load(new FileInputStream(new File(Referencias.PASTACERTIFICADOS + codigo.substring(0, 1) + Referencias.BARRA + codigo + Referencias.TXT)));
        } catch (IOException ex) {
            try {
                this.pro.load(new FileInputStream(new File("C:\\Emisor\\PRODUTOS\\E\\ERRO.txt")));
            } catch (IOException ex1) {
                ex1.printStackTrace();
            }
        }
    }

    private String getPropriedade(String propriedade) {
        if (this.pro == null) {
            return "Erro: pro == null";
        } else {
            return this.pro.getProperty(propriedade);
        }
    }

    private void setPropriedade(String propriedade, String valor) {
        this.pro.setProperty(propriedade, valor);
    }

    public String getDescricao() {
        return getPropriedade("Descricao");
    }

    public String getCodigo() {
        return getPropriedade("Codigo");
    }

    public String getUnidade() {
        return getPropriedade("Unidade");
    }

    public String getNorma() {
        return getPropriedade("Norma");
    }

    public String getCertificado() {
        return getPropriedade("Certificado");
    }

    public String getQ1() {
        return getPropriedade("q1");
    }

    public String getQ2() {
        return getPropriedade("q2");
    }

    public String getQ3() {
        return getPropriedade("q3");
    }

    public String getQ4() {
        return getPropriedade("q4");
    }

    public String getQ5() {
        return getPropriedade("q5");
    }

    public String getQ6() {
        return getPropriedade("q6");
    }

    public String getQ7() {
        return getPropriedade("q7");
    }

    public String getQ8() {
        return getPropriedade("q8");
    }

    public String getQ9() {
        return getPropriedade("q9");
    }

    public String getQ10() {
        return getPropriedade("q10");
    }

    public String getQ11() {
        return getPropriedade("q11");
    }

    public String getQ12() {
        return getPropriedade("q12");
    }

    public String getQ13() {
        return getPropriedade("q13");
    }

    public String getQ14() {
        return getPropriedade("q14");
    }

    public String getV1() {
        return getPropriedade("v1");
    }

    public String getV2() {
        return getPropriedade("v2");
    }

    public String getV3() {
        return getPropriedade("v3");
    }

    public String getV4() {
        return getPropriedade("v4");
    }

    public String getV5() {
        return getPropriedade("v5");
    }

    public String getV6() {
        return getPropriedade("v6");
    }

    public String getV7() {
        return getPropriedade("v7");
    }

    public String getV8() {
        return getPropriedade("v8");
    }

    public String getV9() {
        return getPropriedade("v9");
    }

    public String getV10() {
        return getPropriedade("v10");
    }

    public String getV11() {
        return getPropriedade("v11");
    }

    public String getV12() {
        return getPropriedade("v12");
    }

    public String getV13() {
        return getPropriedade("v13");
    }

    public String getV14() {
        return getPropriedade("v14");
    }

    public String getF1() {
        return getPropriedade("f1");
    }

    public String getF2() {
        return getPropriedade("f2");
    }

    public String getF3() {
        return getPropriedade("f3");
    }

    public String getF4() {
        return getPropriedade("f4");
    }

    public String getF5() {
        return getPropriedade("f5");
    }

    public String getF6() {
        return getPropriedade("f6");
    }

    public String getF7() {
        return getPropriedade("f7");
    }

    public String getUF1() {
        return getPropriedade("uf1");
    }

    public String getUF2() {
        return getPropriedade("uf2");
    }

    public String getUF3() {
        return getPropriedade("uf3");
    }

    public String getUF4() {
        return getPropriedade("uf4");
    }

    public String getUF5() {
        return getPropriedade("uf5");
    }

    public String getUF6() {
        return getPropriedade("uf6");
    }

    public String getUF7() {
        return getPropriedade("uf7");
    }

    public String getVF1() {
        return getPropriedade("vf1");
    }

    public String getVF2() {
        return getPropriedade("vf2");
    }

    public String getVF3() {
        return getPropriedade("vf3");
    }

    public String getVF4() {
        return getPropriedade("vf4");
    }

    public String getVF5() {
        return getPropriedade("vf5");
    }

    public String getVF6() {
        return getPropriedade("vf6");
    }

    public String getVF7() {
        return getPropriedade("vf7");
    }

    public void setDescricao(String valor) {
        setPropriedade("Descricao", valor);
    }

    public void setCodigo(String valor) {
        setPropriedade("Codigo", valor);
    }

    public void setUnidade(String valor) {
        setPropriedade("Unidade", valor);
    }

    public void setNorma(String valor) {
        setPropriedade("Norma", valor);
    }

    public void setCertificado(String valor) {
        setPropriedade("Certificado", valor);
    }

    public void setQ1(String valor) {
        setPropriedade("q1", valor);
    }

    public void setQ2(String valor) {
        setPropriedade("q2", valor);
    }

    public void setQ3(String valor) {
        setPropriedade("q3", valor);
    }

    public void setQ4(String valor) {
        setPropriedade("q4", valor);
    }

    public void setQ5(String valor) {
        setPropriedade("q5", valor);
    }

    public void setQ6(String valor) {
        setPropriedade("q6", valor);
    }

    public void setQ7(String valor) {
        setPropriedade("q7", valor);
    }

    public void setQ8(String valor) {
        setPropriedade("q8", valor);
    }

    public void setQ9(String valor) {
        setPropriedade("q9", valor);
    }

    public void setQ10(String valor) {
        setPropriedade("q10", valor);
    }

    public void setQ11(String valor) {
        setPropriedade("q11", valor);
    }

    public void setQ12(String valor) {
        setPropriedade("q12", valor);
    }

    public void setQ13(String valor) {
        setPropriedade("q13", valor);
    }

    public void setQ14(String valor) {
        setPropriedade("q14", valor);
    }

    public void setV1(String valor) {
        setPropriedade("v1", valor);
    }

    public void setV2(String valor) {
        setPropriedade("v2", valor);
    }

    public void setV3(String valor) {
        setPropriedade("v3", valor);
    }

    public void setV4(String valor) {
        setPropriedade("v4", valor);
    }

    public void setV5(String valor) {
        setPropriedade("v5", valor);
    }

    public void setV6(String valor) {
        setPropriedade("v6", valor);
    }

    public void setV7(String valor) {
        setPropriedade("v7", valor);
    }

    public void setV8(String valor) {
        setPropriedade("v8", valor);
    }

    public void setV9(String valor) {
        setPropriedade("v9", valor);
    }

    public void setV10(String valor) {
        setPropriedade("v10", valor);
    }

    public void setV11(String valor) {
        setPropriedade("v11", valor);
    }

    public void setV12(String valor) {
        setPropriedade("v12", valor);
    }

    public void setV13(String valor) {
        setPropriedade("v13", valor);
    }

    public void setV14(String valor) {
        setPropriedade("v14", valor);
    }

    public void setF1(String valor) {
        setPropriedade("f1", valor);
    }

    public void setF2(String valor) {
        setPropriedade("f2", valor);
    }

    public void setF3(String valor) {
        setPropriedade("f3", valor);
    }

    public void setF4(String valor) {
        setPropriedade("f4", valor);
    }

    public void setF5(String valor) {
        setPropriedade("f5", valor);
    }

    public void setF6(String valor) {
        setPropriedade("f6", valor);
    }

    public void setF7(String valor) {
        setPropriedade("f7", valor);
    }

    public void setUF1(String valor) {
        setPropriedade("uf1", valor);
    }

    public void setUF2(String valor) {
        setPropriedade("uf2", valor);
    }

    public void setUF3(String valor) {
        setPropriedade("uf3", valor);
    }

    public void setUF4(String valor) {
        setPropriedade("uf4", valor);
    }

    public void setUF5(String valor) {
        setPropriedade("uf5", valor);
    }

    public void setUF6(String valor) {
        setPropriedade("uf6", valor);
    }

    public void setUF7(String valor) {
        setPropriedade("uf7", valor);
    }

    public void setVF1(String valor) {
        setPropriedade("vf1", valor);
    }

    public void setVF2(String valor) {
        setPropriedade("vf2", valor);
    }

    public void setVF3(String valor) {
        setPropriedade("vf3", valor);
    }

    public void setVF4(String valor) {
        setPropriedade("vf4", valor);
    }

    public void setVF5(String valor) {
        setPropriedade("vf5", valor);
    }

    public void setVF6(String valor) {
        setPropriedade("vf6", valor);
    }

    public void setVF7(String valor) {
        setPropriedade("vf7", valor);
    }

    public void setTratamento(String valor){
        this.tratamento = valor;
    }
    
    public String getTratamento(){
        return tratamento;
    }
    
    public String getCaracteristica() {

        return Referencias.PROPRIEDADE + getF1() + Referencias.UNIDADE + getUF1() + Referencias.VALOR + getVF1() + Referencias.QUEBRA
                + Referencias.PROPRIEDADE + getF2() + Referencias.UNIDADE + getUF2() + Referencias.VALOR + getVF2() + Referencias.QUEBRA
                + Referencias.PROPRIEDADE + getF3() + Referencias.UNIDADE + getUF3() + Referencias.VALOR + getVF3() + Referencias.QUEBRA
                + Referencias.PROPRIEDADE + getF4() + Referencias.UNIDADE + getUF4() + Referencias.VALOR + getVF4() + Referencias.QUEBRA
                + Referencias.PROPRIEDADE + getF5() + Referencias.UNIDADE + getUF5() + Referencias.VALOR + getVF5() + Referencias.QUEBRA
                + Referencias.PROPRIEDADE + getF6() + Referencias.UNIDADE + getUF6() + Referencias.VALOR + getVF6() + Referencias.QUEBRA
                + Referencias.PROPRIEDADE + getF7() + Referencias.UNIDADE + getUF7() + Referencias.VALOR + getVF7() + Referencias.QUEBRA;
    }
    
}
