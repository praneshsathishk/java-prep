public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        HelloWorld numAdd = new HelloWorld();
        System.out.println(intSquare(5));
    }
    public Integer intAdd(Integer num1, Integer num2) {
        Integer num3 = num1 + num2;
        return num3;
    }
    public static Integer intSquare(Integer num5) {
        Integer num6 = num5 * num5;
        return num6;
    }
}