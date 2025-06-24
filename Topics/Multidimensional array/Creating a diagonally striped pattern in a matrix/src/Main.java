import java.util.Scanner;

public class Main{

    public static void printPattern(int n) {
        // You should declare a two-dimensional array here.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - i - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // You should write a nested for loop to iterate over element in the array.
        // In the for loop you can identify the positions that should hold '#' and ' '. 

        // You should print out the elements of each row of the array. Use 'System.out.print' 
        // to avoid automatic newline after every element and 'System.out.println' 
        // at the end of every row to print a newline.
    }
    static class SomeClass {

        int val = 50;
        String str = "default";

        public SomeClass() {
            this(100);
        }

        public SomeClass(int val) {
            val = val;
        }

        public SomeClass(String str) {
            this();
            this.str = "some-value";
        }

        public SomeClass(int val, String str) {
            this(str);
        }
    }
    public static void main(String[] args){
        SomeClass instance = new SomeClass(300, "another-value");
        System.out.println(instance.str + " " + " " +instance.val);
    }
}