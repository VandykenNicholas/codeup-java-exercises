public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.printf("Your number is now %d %n", i);
//            i++;
//        }
//
//
////    }
//        int i = 0;
//        do {
//            System.out.printf("the number is now %d %n", i);
//            i += 2;
//        }
//        while (i <= 100);
//        int i = 100;
//
//        do {
//            System.out.printf("the number is now %d %n", i);
//            i -=5;
//        }
//        while (i >= -10);

//        long lineNew = 2;
//
//        do{
//            System.out.println(lineNew);
//            lineNew  =  lineNew * lineNew;
//
//        }
//        while (lineNew < 1000000);

//        for (int i = 5; i <=15; i++){
//            System.out.println(i);
//        }
//
//        for (long i = 2; i < 1000000; i = i * i){
//            System.out.println(i);
//        }

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i%5 == 0){
                System.out.println("Buzz");
            }
        }

    }
}
