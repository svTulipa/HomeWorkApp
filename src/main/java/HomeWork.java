public class HomeWork {
    public static void main(String[] args) {
        printThreeWords();
        compareNumbers();
        printColor();
        checkSumSing();
    }
    public static void printThreeWords() {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }

    public static void printColor(){
        int value = 88;
        if (value < 1) {
            System.out.println("Красный");
        }
        if (value < 101){
            System.out.println("Желтый");
        }
        if (value >100 )
            System.out.println("Зеленый");
    }

    public static void compareNumbers(){
        int a = 9;
        int b = 8;
        if (a >= b){
            System.out.println( "a>=b");
        } else if (a <b){
            System.out.println("a<b");
        }

    }
    private static void checkSumSing() {
        int a = -11;
        int b = 4;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
}
