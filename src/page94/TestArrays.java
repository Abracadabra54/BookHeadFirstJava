package page94;

public class TestArrays {

    public static void main (String[] args){
        int [] index = new int [4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        String[] islands = new String[4];
        islands[0] = "Bermuds";
        islands[1] = "Fidgi";
        islands[2] = "Azors";
        islands[3] = "Cosumel";
        int y=0;
        int ref;

        while (y<4){
            ref = index[y];
            System.out.print("islands = "); // в задании "islands = " не выводится на экран, но в ответе выводится. опечатка в книге
            System.out.println (islands[ref]);
            y=y+1;
        }
    }
}
