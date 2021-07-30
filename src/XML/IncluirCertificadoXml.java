/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;

import Certificado.Item;
import Certificado.Nota;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Qualidade
 */
public class IncluirCertificadoXml {

    private Document doc = null;
    private Element ele = null;
    private SAXBuilder builder = null;
    private Nota nota = null;

    public IncluirCertificadoXml(File arg0) {
        try {
            builder = new SAXBuilder();
            doc = builder.build(arg0);

            ele = (Element) doc.getRootElement();
        } catch (JDOMException | IOException e) {
            e.printStackTrace();
        }
    }

    public Nota getNota() {
        return nota;
    }

    
    
    public void abrir() {

        List<Element> linhas = ele.getChildren();

        Iterator itera = linhas.iterator();

        Namespace name = Namespace.getNamespace("http://www.portalfiscal.inf.br/nfe");
        String nome, cnpj, nNota;
        ArrayList<Item> produtos = new ArrayList<>();
        while (itera.hasNext()) {
            try {
                Element linha = (Element) itera.next();
                if (!linha.getName().equals("NFe")) {
                    continue;
                }
                //System.out.println(linha.getAttribute("Id"));
                //System.out.println(linha.getAttribute("versao"));
                Element valor = linha.getChild("infNFe", name);
                Element ide = valor.getChild("ide", name);
                Element emit = valor.getChild("dest", name);
                List<Element> itens = valor.getChildren("det", name);
                nome = emit.getChildText("xNome", name);
                cnpj = emit.getChildText("CNPJ", name);
                nNota = ide.getChildText("nNF", name);
                Iterator iterat = itens.iterator();

                while (iterat.hasNext()) {
                    Element linh = (Element) iterat.next();
                    Element item = linh.getChild("prod", name);

                    produtos.add(Item.carregar(item.getChildText("cProd", name)));
                }
                // if(nNota != null && nome != null){
                nota = new Nota(nNota, cnpj, nome, produtos);

            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

        }

    }

}
