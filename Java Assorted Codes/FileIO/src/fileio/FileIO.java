/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.*;
import java.util.*;

/**
 *
 * @author Ashna Ahmed
 */
public class FileIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader fread = null;
        BufferedWriter fwrite = null;
        try {
            fread = new BufferedReader(new FileReader("g:\\filetest.txt"));
            fwrite = new BufferedWriter(new FileWriter("g:\\example.txt"));
            Scanner input = new Scanner(fread);
            String c;
            while (input.hasNext()) {
                c = input.next();
                fwrite.write(c);

            }
        } finally {
            if (fread != null) {
                fread.close();
            }
            if (fwrite != null) {
                fwrite.close();
            }
        }
        try {
            fread = new BufferedReader(new FileReader("g:\\example.txt"));

            Scanner input = new Scanner(fread);
            String c;
            while (input.hasNext()) {
                input.useDelimiter("\n");
                System.out.println(input.next());
                
                
            }
        } finally {
            if (fread != null) {
                fread.close();
            }

        }
    }

}
