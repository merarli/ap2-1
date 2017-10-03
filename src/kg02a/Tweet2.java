package kg02a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tweet2 {

    private int tweetNo;
    private String twitterID;
    private String name;
    private Date tweetTime;
    private String text;

    public Tweet2() {
    }

    public void setTweetNo(int tweetNo) {
        this.tweetNo = tweetNo;
    }

    public void setTwitterID(String twitterID) {
        this.twitterID = twitterID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTweetTime(Date tweetTime) {
        this.tweetTime = tweetTime;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTweetTime(String tm) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
            Date date = sdf.parse(tm);
            this.tweetTime = date;

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Date getTime() {
        return tweetTime;
    }

    public void printTweet() {
        System.out.println(tweetNo + ":"
                + twitterID + "(" + name + ")\n"
                + tweetTime + "\n" + text);
    }
}
