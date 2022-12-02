import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

//        String[] names = {"john", "alex", "martha"};
//        Person[] personsArr = new Person[3];
//        for (int i = 0; i < personsArr.length; i++){
//            personsArr[i] = new Person(names[i]);
//            personsArr[i].sayHello();
//        }




    }
    public static Person[] addPerson(Person[] arr, Person newPerson) {
//        int length = arr.length + 1;
//        Person[] addedArr = new Person[length];
//        for (int i = 0; i < addedArr.length; i++){
//            if (i == (length - 1)){
//                addedArr[i] = newPerson;
//            }
//            else{
//                addedArr[i] = arr[i];
//            }
//
//        }
//        return addedArr;
//    }
        Person[] addedArr = Arrays.copyOf(arr, arr.length + 1);
        addedArr[arr.length - 1] = newPerson;
        return addedArr;
    }
}
