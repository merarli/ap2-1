package kg02a;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex21 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\C0116289\\IdeaProjects\\ap2-2017\\src\\kg02a\\tweet.csv")));

            String line;

            while ((line = br.readLine()) != null) {
                String[] word = line.split(",");
                System.out.println("twitterID: " + word[0]);
                System.out.println("氏名: " + word[1]);

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
