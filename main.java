import java.math.*;
import java.util.*;
import java.io.*;

public class main {
    static privateClass pClass;
    public static void main(String args[]){
        pClass = new privateClass();
        System.out.println(pClass.getHN());
        boolean win = false;
        while(!win){
            win = makeGuess();
        }
    }

    public static boolean makeGuess(){
        // reads input, System.in reads from command line //
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        return pClass.guessHN(guess);

    }
}
