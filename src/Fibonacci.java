import java.math.BigInteger;

/*
* This program was created by Sebastian Vasco
* The program is designed to find fibonacci number of given number.  If the number is over 6 digits long, program will
* only display the last 6 digits.*/
public class Fibonacci {

    public static void main(String[] args) {

        //Number below will be used to find fibonacci
        System.out.println("\n"+solution(120));
    }

    public static int solution(int N) {

        BigInteger numOne=new BigInteger("0");
        BigInteger numTwo=new BigInteger("1");
        BigInteger numThree=new BigInteger("0");
        //Integer numTwo=1;
        //Integer numThree=0;

        //Calcs fib number
        for(int index=1;index<N;++index) {
            numThree = numOne.add(numTwo);
            numOne = numTwo;
            numTwo = numThree;
        }


        //String temp= Integer.toString(numThree); //Converts number to string
        String temp=String.valueOf(numThree);
        if (6<temp.length()) { //if string is more than 6 digits then cut it
            char[] charFib = temp.toCharArray(); //each digit is in a array of char

            char[] tempHold = new char[6]; //temp bucket to hold shortened number
            int charArrayCount = 5; //temp array counter

            //Loop starts from last digit, and loops 6 times
            for (int index = charFib.length - 1; charFib.length - 6 <= index; index--) {
                tempHold[charArrayCount] = charFib[index];  //saving digits back to new temp char array
                charArrayCount--;
            }

            for (int x = 0; x < tempHold.length; x++)
                System.out.print(tempHold[x]);
            return Integer.parseInt(new String(tempHold));
        }
        return Integer.valueOf(temp);
    }

}