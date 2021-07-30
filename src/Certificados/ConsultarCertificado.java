/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Certificados;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Qualidade
 */
public class ConsultarCertificado {
    
    public static Certificado consultarCertificado(int numero){
        try {
            return new Certificado(numero);
        } catch (IOException ex) {            
            Logger.getLogger(ConsultarCertificado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Certificado não encontrado.");
            return null;
        }
    }
    
    
    
}
