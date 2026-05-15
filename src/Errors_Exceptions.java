public class Errors_Exceptions {
    public static void main(String[] args) {
        // Syntax Error Demo

//        int a = 2
//        System.out.println(a);

        // Logical Error Demo
        System.out.println(2);//Arithmetic error
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

        //Runtime Error or Exception Demo
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number to divide :");
        int num = sc.nextInt();//exception comes if user enter 0
        System.out.println(1000/num);

    }
}
