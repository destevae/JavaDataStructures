class privateClass{

    private int hidden_number;

    public privateClass(){
        hidden_number = ((int)(Math.random()*11));
    }

    public int getHN(){
        return hidden_number;
    }

    public boolean guessHN(int n){
        if(n==hidden_number){
            return true;
        }
        return false;
    }
}