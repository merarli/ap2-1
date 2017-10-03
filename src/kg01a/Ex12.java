package kg01a;

import java.io.*;

public class Ex12 {
    public static void main(String[] args) {
        File inFile = new File(".\\src\\kg01a\\test.txt");
        File outFile = new File(".\\src\\kg01a\\out.txt");
        String line;
        try {
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            while ((line = br.readLine()) != null) {
                pw.println(line);
            }

            br.close();
            pw.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
