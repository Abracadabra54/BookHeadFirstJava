package page93.B;
// ответ в книге другой, но мне он показался менее правильным
public class Hobbits {
    String name;

    public static void  main (String  [] args){
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while (z<3){ // уменьшено до "3"
            h[z]=new Hobbits();
            h[z].name = "Bilbo";
            if (z==1){
                h[z].name = "Frodo";
            }
            if (z==2){
                h[z].name = "Sam";
            }
            System.out.print(h[z].name + " - ");
            System.out.println("good hobbits name");
            z=z+1; // перенесено из начала в конец цикла
        }
    }
}
