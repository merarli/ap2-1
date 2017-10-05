package kg03a;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Kadai02_1 {
    public static void main(String[] args) {
        List<Cat> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\C0116289\\IdeaProjects\\ap2-2017\\src\\kg03a\\data2.csv")));

            String line;

            while ((line = br.readLine()) != null) {
                Cat cat = new Cat();
                String[] word = line.split(",");
                cat.setNo(Integer.parseInt(word[0]));
                cat.setName(word[1]);
                cat.setKind(word[2]);
                cat.setKenami(word[3]);
                cat.setColor(word[4]);
                cat.setSex(word[5]);
                cat.setAge(Integer.parseInt(word[6]));
                cat.setWeight(Double.parseDouble(word[7]));

                list.add(cat);

            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Cat cat : list
                ) {
            cat.printCat();
        }


    }
}
