package page54;

class PoolPuzzleOne {
    public static void main (String [] args){
        int x=0;

        while (x<4){ //short
            System.out.print("a"); //long
            if(x<1){
                System.out.print(" "); //long
            }
            System.out.print("n"); //long
            if (x>1){ //short
                System.out.print(" oyster"); //long
                x=x+2; //short
            }
            if (x==1){
                System.out.print("noys"); //long
            }
            if (x<1){ //short
                System.out.print("oise"); //long
            }
            System.out.println("");
            x=x+1; //short
        }
    }
}
