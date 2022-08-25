import java.math.*;
import java.util.*;
import java.io.*;

public class main {
    static privateClass pClass;
    public static void main(String args[]){
        pClass = new privateClass();
        System.out.println("Hint: the right number is " + pClass.getHN());
        boolean win = false;

        while(!win){ // while win is false //
            win = makeGuess();
        }
    }

    public static boolean makeGuess(){
        // reads input, System.in reads from command line //
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        boolean win = pClass.guessHN(guess);
        return win;

    }
}
