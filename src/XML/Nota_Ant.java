/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package XML;

import Cadastro.Produto;
import java.util.ArrayList;

/**
 *
 * @author Qualidade
 */
public class Nota_Ant {
    
    private String numero,cnpj,cliente,pedido;

     private ArrayList<Produto> itens = new ArrayList<Produto>();
    
    public Nota_Ant(String numero, String cnpj, String cliente,ArrayList<Produto> itens){
        this.numero = numero;
        this.cnpj = cnpj;
        this.cliente = cliente;
        this.itens = itens;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public ArrayList<Produto> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Produto> itens) {
        this.itens = itens;
    }
    
    public Produto getProduto(int index){
        
        return itens.get(index);
    }
   
    
    public void setProduto(int index,Produto arg0){
        itens.set(index, arg0);
    }
    
}
