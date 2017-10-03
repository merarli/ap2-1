package en00a;

public class Q01 {
    public static void main(String[] args) {

        String str = "1024";
        try {
            int n = Integer.valueOf(str);
            int ans = n + 6;
            System.out.println(ans);
        } catch (NumberFormatException e) {
            System.out.println("数値に変換できません");
        }


    }
}
