package main;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Syötä pelaajan nimi: ");
        String name = sc.nextLine();
        Player player = new Player(name);
        Cave cave = new Cave(player);



        


       

    boolean exit = false;
    while(!exit){
        System.out.println("1) Lisää luolaan hirviö");
        System.out.println("2) Listaa hirviöt");
        System.out.println("3) Hyökkää hirviöön");
        System.out.println("4) Tallenna peli");
        System.out.println("5) Lataa peli");
        System.out.println("0) Lopeta peli");


        if(sc.hasNext()) {
            int i = 0;
            String stringInput = sc.nextLine();
            i = Integer.parseInt(stringInput);

            switch(i) {
                case 1:
                    System.out.println("Anna hirviön tyyppi: ");
                    String type = sc.nextLine();
                    System.out.println("Anna hirviön elämän määrä numerona: ");
                    int Health = Integer.parseInt(sc.nextLine());

                    cave.addMonster(new Monster(type, Health));
                    
                    break;
                case 2:
                        System.out.println("Luolan hirviöt:");
                        cave.listMonsters();
                                       
                    

                    break;
                case 3:



                    break; 
                case 4:



                    break;
                case 5:



                    break;

                case 0:
                    System.out.println("Peli päättyy. Kiitos pelaamisesta!");
                    exit = true;
                    break;
                default:
                    System.out.println("Syöte oli väärä");
                    break;    
                }

            }
        }
        sc.close();
    }
    

    
}
