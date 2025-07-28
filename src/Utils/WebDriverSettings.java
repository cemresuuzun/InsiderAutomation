package Utils;

public class WebDriverSettings {
    public static void Wait(int s){
        try {
            Thread.sleep(1000*s);

        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
