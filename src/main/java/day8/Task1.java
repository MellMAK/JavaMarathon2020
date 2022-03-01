package day8;

/*Create a string consisting of numbers from 0 to 20000. It is important to understand that this is one
a string obtained by concatenating ("gluing") numbers from a range separated by a space
(0 + “ “ + 1 + “ “ + 2 + ... + 20000).
After creating such a line, calling System.out.println() on that line should
output to the console all the numbers from the range at once:
0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000. To feel the performance difference between
concatenation regular strings (class String ) and using StringBuilder , implement described task in these two ways,
measuring the running time of the program. */
public class Task1 {
    public static void main(String[] args) {
// Version1
//        String numbers="";
//
//        long before = System.currentTimeMillis();
//
//        for (int i = 0; i <= 20000; i++) {
//            numbers += i + " ";
//        }
//        long after = System.currentTimeMillis();
//
//        System.out.print(numbers);
//        System.out.println();
//        System.out.printf("Process time with String: %d ms", (after-before));

// Version2
        StringBuilder stringBuilder = new StringBuilder();

        long before = System.currentTimeMillis();

        for (int i = 0; i <=20000 ; i++) {
            stringBuilder.append(i).append(" ");
        }

        long after = System.currentTimeMillis();

        System.out.print(stringBuilder);
        System.out.println();
        System.out.printf("Process time with StringBuilder: %d ms", (after-before));

    }
}
