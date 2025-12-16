class Main {
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
        printHelloWorld();

        int num = 1;
        System.out.println(num,2);
        smile();
    }

    public static void printHelloWorld() {
        System.out.println("Hello, World!");
    }

    public static void sum(int a, int b) {
        return a + b;
    }

    public static void smile(){
        System.out.println(":)");
    }



}