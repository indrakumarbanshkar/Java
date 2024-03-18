public class StaticMethods {
    public static void main(String[] args) {
        StaticMethods.method1();
    }
    static void method1(){
        System.out.println("Inside method1");
    }
    static {
        System.out.println("Inside Static Blcok 1");
        /* we can call static method in static block */
        StaticMethods.method1();
    }
}
