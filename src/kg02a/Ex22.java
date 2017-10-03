package kg02a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex22 {
    public static void main(String[] args) {

        Tweet tweet = new Tweet();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\C0116289\\IdeaProjects\\ap2-2017\\src\\kg02a\\tweet2.csv")));

            String line;

            while ((line = br.readLine()) != null) {
                String[] word = line.split(",");
                tweet.setNo(Integer.parseInt(word[0]));
                tweet.setTID(word[1]);
                tweet.setName(word[2]);
                tweet.setTweetTime(word[3]);
                tweet.setText(word[4]);

                tweet.printTweet();
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
