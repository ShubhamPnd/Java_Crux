package methods_in_java;


public class Method_Overloading {

    static void myName() {
        System.out.println("My Name is Khan");
    }

    public static void main(String[] args) {
        myName();
//      Case 1: Changing the Integer
//       int x = 45;
//       change(x);
//       System.out.println("The value of x after running change method is : " + x);

//        CASE2: - Chnnging array Element
//          int []marks = {45,67,57,94,78,56};
//          changeArrayElement(marks);
//        System.out.println("The change occur in the array is:" + marks[0]);
//        System.out.println(marks[1]);
     wish();
     wish("Shubham");
     wish("Shubham" , "Namaste");
     // These are Arguments
//        Arguments are actual


    }

    static void change(int a){
        a =98;
    }

    static void changeArrayElement(int [] arr){ // In this method we pass the reference of the array element
        arr[0] = 67;
        arr[1] = 98;
    }

    static void wish(){
        System.out.println("Good Morning Vro");
    }

    static void wish(String name){
        System.out.println("Good Morning" + name + "Vro");
    }

    static void wish(String name , String bye){ // These are Parameters
        System.out.println("Good Morning" + name + "Vro" + bye);
    }


}
