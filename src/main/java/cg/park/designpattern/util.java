package cg.park.designpattern;

public class util {

    public static String getClassName() {
        return Thread.currentThread().getStackTrace()[2].getClassName();
    }

}
