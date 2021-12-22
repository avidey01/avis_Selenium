package Helper;


public class Misc {
    /**
     * there are two way user can access the method
     * one by the OBJECT other by the classname
     */
    public static void sleep(int seconds) {

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}