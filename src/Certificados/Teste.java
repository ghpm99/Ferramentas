/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Certificados;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.odftoolkit.odfdom.converter.pdf.PdfOptions;
import org.odftoolkit.odfdom.converter.pdf.PdfConverter;
import org.odftoolkit.odfdom.doc.OdfTextDocument;

/**
 *
 * @author Qualidade
 */
public class Teste {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        try {
            // 1) Load odt with ODFDOM
            OdfTextDocument document = OdfTextDocument.loadDocument("C:\\Users\\Qualidade\\Desktop\\odt.converters-1.0.4-sample\\odt.converters-1.0.4\\src\\fr\\opensagres\\xdocreport\\samples\\odt\\converters\\30657.odt");

            // 2) Convert ODFDOM OdfTextDocument 2 PDF with iText
            File outFile = new File("target/30657.pdf");
            outFile.getParentFile().mkdirs();
            System.out.println(outFile.getAbsolutePath());
            OutputStream out = new FileOutputStream(outFile);
            PdfOptions options = PdfOptions.create().fontEncoding("windows-1250");
            PdfConverter.getInstance().convert(document, out, options);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        System.out.println("Generate ODTBig.pdf with " + (System.currentTimeMillis() - startTime) + " ms.");
    }

}
