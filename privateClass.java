class privateClass{

    private int hidden_number;

    public privateClass(){
        // generates the range for the hidden number to be in //
        int min = ((int)(Math.random()*10));
        int max = ((int)(Math.random()*10) + 10);
        hidden_number = ((int)(Math.random()*max) + min);
        System.out.println("Range: " + min + " to " + (min + max) + ".");
    }

    public int getHN(){
        return hidden_number;
    }
    static privateClass zClass;

    public boolean guessHN(int n){
        // checking if the user input equals the correct number //
        if(n==hidden_number){
            System.out.println("You got it! You win!");
            return true;
        }
        System.out.println("WRONG! Guess again!!");
        zClass = new privateClass();
        return false;
    }
}