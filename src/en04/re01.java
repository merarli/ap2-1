package en04;

/**
 * Created by C0116289 on 2017/05/08.
 */
public class re01 {
    public static void main(String[] args) {

        int n= 12345678;
        double d=-9876.54321;
        String  str;

        str = String.format("%,d",n);
        System.out.println(str);

        str= String.format("%010d",n);
        System.out.println(str);

        str=String.format("%.3f",d);
        System.out.println(str);

        str=String .format("%0,10.2f",d);
        System.out.println(str);
        //マイナスやカンマ、小数点も文字数に入る
        //だから出力結果全部で10桁

        str=String .format("%+dと%f",n,d);
        System.out.println(str);

        str=String.format("%2$dと%1$f",d,n);
        System.out.println(str);
        //indexの例
        //２$で引数の二つ目を入れる


        //replaceAll()の使い方
        String istr="1404-1, Katakuramachi.";
        String ostr;

        ostr=istr.replaceAll("a","o");
        System.out.println(ostr);
        //aをoに置き換える
        //ただしもとのistrは変更されない

        ostr=istr.replaceAll(" ","*");
        System.out.println(ostr);
        //空欄も置き換え可能

        ostr=istr.replaceAll("[aui]","@");
        System.out.println(ostr);
        //a,u,iを@に置き換え

        ostr=istr.replaceAll("[3-9]","@");
        System.out.println(ostr);

        ostr=istr.replaceAll(".","?");
        System.out.println(ostr);
        //.(ピリオド)は特別な意味を持つため注意
        //ピリオドを置き換えるときは\\.でエスケープする
        //.はワイルドカードみたいなかんじ？

        ostr=istr.replaceAll("a.","@");
        System.out.println(ostr);
        //aとその次の文字

        ostr=istr.replaceAll("[a-z]+","@");
        System.out.println(ostr);
        //回数制限
        //+①文字以上続くような



    }
}
