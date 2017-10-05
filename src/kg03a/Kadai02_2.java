package kg03a;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Kadai02_2 {
    public static void main(String[] args) {

        double weihgt=0;
        double age=0;
        int num=0;
        double avew;
        double avea;

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
                weihgt+=Double.parseDouble(word[7]);
                age+=Double.parseDouble(word[6]);
                num+=1;
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        avew=weihgt/num;
        avea=age/num;
        System.out.printf("登録されているネコの平均体重は %.2f kg です。 \n",avew);
        System.out.printf("登録されているネコの平均年齢は %.2f 才 です。 \n",avea);
    }
}
