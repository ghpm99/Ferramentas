/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Certificados;

import Cadastro.Produto;
import static Certificados.Incluir.addMsg;

/**
 *
 * @author Qualidade
 */
public class IncluirCertificado {

    public static void incluir(String cnpj, String cliente, String nPedido, String nNota, String quantidade, Produto produto,
            String complemento, String complementoValor, String tratamento) {
        addMsg("Setando informações.");
        Certificado.setCnpj(cnpj);
        Certificado.setCliente(cliente);
        Certificado.setPedido(nPedido);
        Certificado.setNota(nNota);
        Certificado.setQnt(quantidade);
        Certificado.setProduto(produto);
        Certificado.setComplemento(complemento);
        Certificado.setComplementoValor(complementoValor);
        Certificado.setTratamento(tratamento);

    }

    public static boolean verificar() {
        if (dados()) {
            Certificado.salvar();
            System.out.println("Gerou");
            return true;
        } else {
            addMsg("Nao Gerou.");
            System.out.println("Nao Gerou");
            return false;
        }

    }

    public static boolean verificar(int numero) {
        if (dados()) {
            Certificado.salvar(numero);
            System.out.println("Gerou");
            return true;
        } else {
            addMsg("Nao Gerou.");
            System.out.println("Nao Gerou");
            return false;
        }

    }

    public static StringBuffer msg() {
        StringBuffer msg = new StringBuffer();
        if (Certificado.getProduto() == null) {
            msg.append("**Codigo de Produto invalido ou ausente.** \n");
        }
        if (Certificado.getCliente() == null || Certificado.getCliente().equals("")) {
            msg.append("**Cliente Invalido ou ausente.** \n");
        }
        if (Certificado.getCNPJ() == null || Certificado.getCNPJ().equals("")) {
            msg.append("**CNPJ Invalido ou ausente.** \n");
        }
        if (Certificado.getNota() == null || Certificado.getNota().equals("")) {
            msg.append("**Nota Invalida ou ausente.** \n");
        }
        if (Certificado.getProduto().getCodigo() == null || Certificado.getProduto().getCodigo().equals("")) {
            msg.append("**Codigo de Produto Invalido ou ausente.** \n");
        }
        if (Certificado.getProduto().getDescricao() == null || Certificado.getProduto().getDescricao().equals("")) {
            msg.append("**Descricao de Produto Invalido ou ausente.** \n");
        }
        try {
            String a = Certificado.getQnt().split(" ")[0];
        } catch (Exception e) {
            msg.append("**Quantidade Invalida ou ausente.** \n");
        }
        if (Certificado.getQnt().split(" ")[0] == null || Certificado.getQnt().split(" ")[0].equals("")) {
            msg.append("**Quantidade Invalida ou ausente.** \n");
        }
        if (Certificado.getComplemento() == null || Certificado.getComplemento().equals("")) {
            msg.append("Campo de Complemento Invalido ou ausente. \n");
        }
        if (Certificado.getComplementoDescricao() == null || Certificado.getComplementoDescricao().equals("")) {
            msg.append("Campo de Complemento Invalido ou ausente. \n");
        }
        if (Certificado.getPedido() == null || Certificado.getPedido().equals("")) {
            msg.append("Campo de Pedido Invalido ou ausente. \n");
        }
        if (Certificado.getProduto().getCertificado() == null || Certificado.getProduto().getCertificado().equals("")) {
            msg.append("Numero de Certificado Original Invalido ou ausente. \n");
        }

        return msg;
    }

    private static boolean dados() {
        try {
            System.out.println(Certificado.getProduto() != null);
            System.out.println(Certificado.getCliente() != null);
            System.out.println(!Certificado.getCliente().equals(""));
            System.out.println(Certificado.getCNPJ() != null);
            System.out.println(!Certificado.getCNPJ().equals(""));
            System.out.println(Certificado.getNota() != null);
            System.out.println(!Certificado.getNota().equals(""));
            System.out.println(Certificado.getProduto().getCodigo() != null);
            System.out.println(Certificado.getProduto().getDescricao() != null);
            System.out.println(!Certificado.getProduto().getCodigo().equals(""));
            System.out.println(!Certificado.getProduto().getDescricao().equals(""));
            System.out.println(Certificado.getQnt().split(" ")[0] != null);
            System.out.println(!Certificado.getQnt().split(" ")[0].equals(""));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Certificado.getProduto() != null
                && Certificado.getCliente() != null
                && !Certificado.getCliente().equals("")
                && Certificado.getCNPJ() != null
                && !Certificado.getCNPJ().equals("")
                && Certificado.getNota() != null
                && !Certificado.getNota().equals("")
                && Certificado.getProduto().getCodigo() != null
                && Certificado.getProduto().getDescricao() != null
                && !Certificado.getProduto().getCodigo().equals("")
                && !Certificado.getProduto().getDescricao().equals("")
                && Certificado.getQnt().split(" ")[0] != null
                && !Certificado.getQnt().split(" ")[0].equals("");
    }

}
