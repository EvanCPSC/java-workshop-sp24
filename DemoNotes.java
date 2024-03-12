import java.util.ArrayList; //step 4
import java.util.Scanner; //step 5

public class DemoNotes {
    public static void main(String[] args) {
        //from starter code
        System.out.println("Hello World!");

        //step 1: variables and output
        int x = 5;
        System.out.println(x);

        //step 2: more variables and concatenation
        boolean torf = x < 6;
        String torfResponse = "it is sdjkfghr"; //note: String is a class
        //note: concatenating different types will convert other types to string
        System.out.println(torfResponse.substring(0, 6) + torf + " that " + x + " < 6");
        //note: substring does not include end index

        //step 3: arrays
        int[] arr = {1, 2, 7}; // initialize array
        System.out.println(arr[0]);
        System.out.println(arr[0] + arr[2]);
        arr[0] = 3; // set array element
        System.out.println(arr[0] + arr[2] < arr[1]);
        System.out.println(arr); // prints address

        //step 4: arraylists and conditions
        //note: <> must have class in them e.g. <Integer> <String>
        ArrayList<Boolean> conds = new ArrayList<>();
        //adding and setting elements of an arraylist
        conds.add(false);
        conds.add(torf);
        conds.add(20 < 7);
        conds.set(0, true);
        if ((conds.get(0) && conds.get(1)) || conds.get(2)) {
            System.out.println(conds); // prints arraylist
        }
        // array and arraylist have different ways of getting the size
        System.out.println(arr.length + " " + conds.size());

        //step 5: input with scanners
        @SuppressWarnings("resource") // vs code didnt like the scanner lol
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls put int");
        arr[1] = scanner.nextInt();
        //step 6: functions and static keyword
        printArr(arr);
    }

    //step 6
    /* note: static variables and functions must be used in a "static context"
      or called by a class rather than an object
      e.g. Math.random();
      as opposed to mathObj.random();
      */
    private static void printArr(int[] arr) { 
        // this is a for each loop, a normal loop is written as: for (int i = 0; i < arr.length; i++)
        for (int val : arr) {
            // print is different from println in that println will make the next print statement go to the next line
            System.out.print(val + ", ");
        }
    }
}
