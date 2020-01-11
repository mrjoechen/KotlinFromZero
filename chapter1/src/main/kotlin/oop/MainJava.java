package oop;

/**
 * @Classname MainJava
 * @Description TODO
 * @Date 2020-01-10 16:27
 * @Created by chenqiao
 */
public class MainJava {


    public static void main(String[] args) {

        Latitude latitude = Latitude.ofDouble(0.22222);

        Latitude.Companion.ofLatitude(latitude);

        String tag = Latitude.TAG;

        StaticsKt.times("aaa", 10);

    }

}
