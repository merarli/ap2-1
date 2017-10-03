package kg01a;

import java.io.File;

public class Ex11 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\C0116289\\IdeaProjects\\ap2-2017\\src\\kg01a\\test.txt");
        File f2 = new File(".\\src\\kg01a\\test.txt");

        System.out.println(f2.length());

        System.out.println("ファイル名: " + f1.getName());
        System.out.println("絶対パス: " + f1.getAbsolutePath());
        System.out.println("サイズ :" + f1.length() + "バイト");

    }
}
