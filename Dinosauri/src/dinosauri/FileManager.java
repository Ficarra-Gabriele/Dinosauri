/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ficarra.gabriele
 */
public class FileManager {
    List<String[]> righe = new ArrayList<>();
    String filePath = "mazzo.txt";
    
    public void leggiFile(){
        try(BufferedReader r = new BufferedReader(new FileReader(filePath))){
            
            String riga;
            
            while ((riga = r.readLine()) != null) {
                String[] valori = riga.split(",");
                righe.add(valori);
            }
        } catch (IOException e) {
            System.err.println("Errore nella lettura del file");
        }
        for (String[] riga : righe) {
                System.out.println(Arrays.toString(riga));
        }
    }
}
