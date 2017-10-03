package en14;

/**
 * Created by C0116289 on 2017/07/17.
 */
public class Coffee {
    private int volume;
    private static int totalVol;

    public Coffee(int volume) {
        this.volume = volume;
        totalVol += volume;
    }

    public static int getTotalVol() {
        return totalVol;
    }
}
