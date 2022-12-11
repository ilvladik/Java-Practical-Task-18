package exercise_8;

import java.util.Scanner;

public class ThrowDemo {
    public void getKey() {
        while (true) {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );

    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
}
