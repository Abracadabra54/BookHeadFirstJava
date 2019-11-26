package page93.A;

public class BooksTestDrive {
    public static void main (String [] args){

        Books [] myBooks = new Books[3];

        // * нехватающая часть кода
        myBooks[0]= new Books();
        myBooks[1]= new Books();
        myBooks[2]= new Books();
        // *

        int x=0;
        myBooks[0].title = "Plody Java";
        myBooks[1].title = "java Gadsby";
        myBooks[2].title = "Java recept";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Suy";
        myBooks[2].author = "Yan";

        while (x<3){
            System.out.print(myBooks[x].title);
            System.out.print(", autor "); // не хватало пробела в конце строки
            System.out.println(myBooks[x].author);
            x=x+1;
        }
    }
}
