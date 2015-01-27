/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibnetonetomany;

import hibnetonetomany.DAO.hibempcertDAO;
import hibnetonetomany.mapping.Certificate;
import java.util.HashSet;

/**
 *
 * @author CAN
 */
public class HibNetOnetoMany {

    public static void main(String[] args) {

        HashSet set1 = new HashSet();
        
        set1.add(new Certificate("C"));
        set1.add(new Certificate("C++"));
        set1.add(new Certificate("C^#"));
        set1.add(new Certificate("C+++"));
        
        hibempcertDAO.addEmployee("Ahmet", "Mehmet", 3000, set1);
        
        System.out.println("Çalışıyor");
    }

}
