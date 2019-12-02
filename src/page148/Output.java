package page148;

public class Output {
    public static void main (String [] args){
        Output o = new Output();
        o.go();
    }

    void go (){
        int y = 7;
        for (int x=1; x<8; x++){ // 1, 2, 3, 4, 5, 6
            y++; // 8, 9, 10, 11, 12, 14
            if (x>4){
                System.out.print(++y + " "); // 13, 15
            }
            if (y>14){
                System.out.println(" x = " + x); // x= 6
                break;
            }
        }
    }
}
