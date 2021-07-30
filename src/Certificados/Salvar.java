/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Certificados;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.jooreports.templates.DocumentTemplate;
import net.sf.jooreports.templates.DocumentTemplateFactory;
import org.artofsolving.jodconverter.OfficeDocumentConverter;
import org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration;
import org.artofsolving.jodconverter.office.OfficeManager;



/**
 *
 * @author Qualidade
 */
public class Salvar {

    public static void salvar() {
        try {
            DocumentTemplateFactory document = new DocumentTemplateFactory();
            DocumentTemplate template = document.getTemplate(new File("C:\\Emisor\\Certificado.odt"));
            Map modelo = new HashMap();
            System.out.println("Setando modelo");
            //Incluir.addMsg("Setando modelo");

            modelo.put("ncertificado", Certificado.getNumero());
            modelo.put("npedido", Certificado.getPedido());
            modelo.put("nnota", Certificado.getNota());
            modelo.put("cnpj", Certificado.getCNPJ());
            modelo.put("cliente", Certificado.getCliente());
            modelo.put("codproduto", Certificado.getProduto().getCodigo());
            modelo.put("descricao", Certificado.getProduto().getDescricao());
            modelo.put("quantidade", Certificado.getQnt());
            modelo.put("norma", Certificado.getProduto().getNorma());
            modelo.put("noriginal", Certificado.getProduto().getCertificado());
            modelo.put("q1", Certificado.getProduto().getQ1());
            modelo.put("q2", Certificado.getProduto().getQ2());
            modelo.put("q3", Certificado.getProduto().getQ3());
            modelo.put("q4", Certificado.getProduto().getQ4());
            modelo.put("q5", Certificado.getProduto().getQ5());
            modelo.put("q6", Certificado.getProduto().getQ6());
            modelo.put("q7", Certificado.getProduto().getQ7());
            modelo.put("q8", Certificado.getProduto().getQ8());
            modelo.put("q9", Certificado.getProduto().getQ9());
            modelo.put("q10", Certificado.getProduto().getQ10());
            modelo.put("q11", Certificado.getProduto().getQ11());
            modelo.put("q12", Certificado.getProduto().getQ12());
            modelo.put("q13", Certificado.getProduto().getQ13());
            modelo.put("q14", Certificado.getProduto().getQ14());
            modelo.put("v1", Certificado.getProduto().getV1());
            modelo.put("v2", Certificado.getProduto().getV2());
            modelo.put("v3", Certificado.getProduto().getV3());
            modelo.put("v4", Certificado.getProduto().getV4());
            modelo.put("v5", Certificado.getProduto().getV5());
            modelo.put("v6", Certificado.getProduto().getV6());
            modelo.put("v7", Certificado.getProduto().getV7());
            modelo.put("v8", Certificado.getProduto().getV8());
            modelo.put("v9", Certificado.getProduto().getV9());
            modelo.put("v10", Certificado.getProduto().getV10());
            modelo.put("v11", Certificado.getProduto().getV11());
            modelo.put("v12", Certificado.getProduto().getV12());
            modelo.put("v13", Certificado.getProduto().getV13());
            modelo.put("v14", Certificado.getProduto().getV14());
            modelo.put("f1", Certificado.getProduto().getF1());
            modelo.put("f2", Certificado.getProduto().getF2());
            modelo.put("f3", Certificado.getProduto().getF3());
            modelo.put("f4", Certificado.getProduto().getF4());
            modelo.put("f5", Certificado.getProduto().getF5());
            modelo.put("f6", Certificado.getProduto().getF6());
            modelo.put("f7", Certificado.getProduto().getF7());
            modelo.put("uf1", Certificado.getProduto().getUF1());
            modelo.put("uf2", Certificado.getProduto().getUF2());
            modelo.put("uf3", Certificado.getProduto().getUF3());
            modelo.put("uf4", Certificado.getProduto().getUF4());
            modelo.put("uf5", Certificado.getProduto().getUF5());
            modelo.put("uf6", Certificado.getProduto().getUF6());
            modelo.put("uf7", Certificado.getProduto().getUF7());
            modelo.put("vf1", Certificado.getProduto().getVF1());
            modelo.put("vf2", Certificado.getProduto().getVF2());
            modelo.put("vf3", Certificado.getProduto().getVF3());
            modelo.put("vf4", Certificado.getProduto().getVF4());
            modelo.put("vf5", Certificado.getProduto().getVF5());
            modelo.put("vf6", Certificado.getProduto().getVF6());
            modelo.put("vf7", Certificado.getProduto().getVF7());

            modelo.put("tratamento", Certificado.getTratamento());
            modelo.put("complemento", Certificado.getComplemento());
            modelo.put("complementodescricao", Certificado.getComplementoDescricao());
            //Incluir.addMsg("Substituindo...");
            template.createDocument(modelo, new FileOutputStream("C:\\Emisor\\ODT\\" + Certificado.getNumero() + ".odt"));

            converterPdf();

        } catch (Exception e) {

        }
    }

    public static synchronized void converterPdf() {
        try {
            OfficeManager office = null;

            office = new DefaultOfficeManagerConfiguration().setOfficeHome(new File("C:\\Program Files (x86)\\OpenOffice 4")).buildOfficeManager();
            office.start();

            OfficeDocumentConverter converter = new OfficeDocumentConverter(office);
            //Incluir.addMsg("Convertendo...");
            converter.convert(new File("C:\\Emisor\\ODT\\" + Certificado.getNumero() + ".odt"), new File("C:\\Emisor\\Certificados\\" + Certificado.getNumero() + ".pdf"));

            office.stop();

            File pdf = new File("C:\\Emisor\\Certificados\\" + Certificado.getNumero() + ".pdf");
            File desti = new File("C:\\Users\\Qualidade\\Desktop\\" + Certificado.getNumero() + ".pdf");
            System.out.println("Copiando...");
            //copyFile(pdf, desti);
            // Incluir.addMsg("Copiando..");

            copyFile(pdf, new File("E:\\PDF\\" + Certificado.getNumero() + ".pdf"));
            //Incluir.addMsg("Finalizando");
            salvar(Certificado.getNota(), Certificado.getProduto().getDescricao(), String.valueOf(Certificado.getNumero()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized void criarPDF(){
        try{
        InputStream is = new FileInputStream(new File("C:\\Emisor\\ODT\\" + Certificado.getNumero() + ".odt"));
        
        }catch(Exception e){
            
        }
    }
    
    public static void copyFile(File source, File destination) throws IOException {
        if (destination.exists()) {
            destination.delete();
        }

        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;

        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destinationChannel = new FileOutputStream(destination).getChannel();
            sourceChannel.transferTo(0, sourceChannel.size(),
                    destinationChannel);
        } finally {
            if (sourceChannel != null && sourceChannel.isOpen()) {
                sourceChannel.close();
            }
            if (destinationChannel != null && destinationChannel.isOpen()) {
                destinationChannel.close();
            }
        }
    }

    private static void salvar(String nota, String produto, String certificado) throws IOException {

        File certi = new File("C:\\Emisor\\Certificados\\" + certificado + ".pdf");
        File pdf = new File("G:\\Certificados Tock\\" + nota + "\\" + certificado + ".pdf");
        File txt = new File("G:\\Certificados Tock\\" + nota + "\\" + nota + ".txt");
        if (!new File("G:\\Certificados Tock\\" + nota).exists()) {
            new File("G:\\Certificados Tock\\" + nota).mkdir();
        }
        copyFile(certi, pdf);
        addTXT(txt, produto, certificado);
    }

    private static void addTXT(File txt, String produto, String numero) throws IOException {

        if (!txt.exists()) {
            boolean criou = txt.createNewFile();
            if (criou) {
                System.out.println("Criou");
            } else {
                System.out.println("Falhou");
            }
        }

        BufferedWriter buff = new BufferedWriter(new FileWriter(txt, true));

        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formatarDate = new SimpleDateFormat("dd-MM-yyyy");

        buff.write(numero + "-" + produto + " -Ultima alteração(dia):" + formatarDate.format(data));
        buff.newLine();
        buff.flush();
        buff.close();
    }
}
