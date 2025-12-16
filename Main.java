class Main {
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
        printHelloWorld();

        int[] arr = new int[];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int num = 1;
        System.out.println(num,2);
        smile();
    }

    public static void printHelloWorld() {
        System.out.println("Hello, World!");
        printArr(arr);
    }

    public static printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}