/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPrincipal;

import java.util.Random;

/**
 *
 * @author Qualidade
 */
public class Sobre {

    private static String[] frases = {};

    public static String getVersao() {
        return "V1.51";
    }

    public static String getAutor() {
        return "Guilherme H.";
    }

    public static String getFrase() {
        Random random = new Random();        
        return frases[random.nextInt(3)];
    }

}
