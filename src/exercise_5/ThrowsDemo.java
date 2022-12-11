package exercise_5;

public class ThrowsDemo {
    public static void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in get Details");
        }
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        try {
            throwsDemo.getDetails(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
