import java.util.Scanner;
import java.util.Random;
public class körök {
   static int  Körszámláló=1;

    public static void getKöröm(){
        Körszámláló=Körszámláló;
    }
    public static void Rounds(){
        
        hero Főhős;
        badguy Badguy;
        Főhős = new hero();
        Badguy = new badguy();
        Scanner bevitel = new Scanner(System.in);
        int Körszámláló=1;
        System.out.println("\t\s\sMegkezdődött az 1. kör\n");
/* Hős lépési interakció */
        do{
            if(hero.getÉlet()<1){
                System.out.println("\nA játék végetért, mert "+Főhős.getHős_neve()+"-t elpusztították"+"\s|\s"+"Összes játszott kör száma: "+Körszámláló);
                break;
            }
            System.out.println("\t\t"+Főhős.getHős_neve()+ " lép ");
            System.out.println("Hős léphető opciói"+"\s|\sSaját élet = "+hero.getÉlet()+"\nA = Támadás, H = Healelás, D = Damage Boost támadás, E = Játék befejezése"+"\s |\s"+Badguy.getBadguy_neve()+"Életereje = "+Badguy.getÉlet()+"");
            String Hős_válasz = bevitel.next().toUpperCase();
            String Hős_Választott_lépés="AHD";
            if(Hős_válasz.contains("E")){
                System.out.println("Játék bezárva");
                break;
            }

            while (!Hős_Választott_lépés.contains(Hős_válasz)) {
                System.out.println("Helytelen lépés. | A = Támadás, H = Healelás, D = Damage Boost támadás, E = Játék befejezése");
                Hős_válasz = bevitel.next().toUpperCase();
            }





            switch(Hős_válasz){
                case "A":
                    Badguy.getÉlet();
                    Badguy.setÉlet(Badguy.getÉlet()-Főhős.getDamage());
                    System.out.println("Sikeres támadás bevitel");

                    break;
                case "H":
                    System.out.println(""+Főhős.getHős_neve()+" Healelt");
                    Főhős.Healelés();
                    System.out.println("Így az élete "+hero.getÉlet()+" re nőtt");
                    break;
                case "D":
                    Főhős.Boost_damagebe();
                    Főhős.getDamage();
                    Badguy.setÉlet(Badguy.getÉlet()-Főhős.getDamage());
                    break;


                default:
                    System.out.print("Helytelen beivetl miat próbáld újra");

            }
            /*Gonosz lépési interakció */

            if(badguy.getÉlet()<1){
                System.out.println("\nA játék végetért, mert "+Badguy.getBadguy_neve()+"-t elpusztítottad "+"\s|\s"+"Összes játszott kör száma: "+Körszámláló);
                break;
            }
                System.out.println("\n\t\t"+Badguy.getBadguy_neve()+ " lép ");

                System.out.println("Léphető opciók "+"\s\s|\s\s"+Badguy.getBadguy_neve() +"élet = "+Badguy.getÉlet());
                System.out.println("A = Támadás, M = Mérgezés, E = Játék befejezése"+"\s\s|"+"\s\s"+Főhős.getHős_neve()+"Életereje = "+Főhős.getÉlet());
                String Badguy_válasz = bevitel.next().toUpperCase();
                String Badguy_Választott_lépés="AM";

                if(Badguy_válasz.contains("E")){
                    System.out.println("Játék bezárva");
                    break;
                }
    
                while (!Badguy_Választott_lépés.contains(Badguy_válasz)) {
                    System.out.println("Helytelen lépés. | A = Támadás, M = Mérgezés, E = Játék befejezése");
                    Badguy_válasz = bevitel.next().toUpperCase();
                }

                switch(Badguy_válasz){
                    case "A":
                        Főhős.getÉlet();
                        Főhős.setÉlet(Főhős.getÉlet()-Badguy.getDamage());
                        System.out.println("Sikeres támadás bevitel");
                        break;

                    case "M":
                        System.out.println("Méregezés sikeres");
                        Badguy.Mérgezés();
                        break;

                    default:
                    
                        break;
                    
    
                }
                Körszámláló++;
                System.out.println("\n\t\s\sJelenlegi kör száma = "+Körszámláló+"\n");

        }
        while (Badguy.getÉlet()>1|Főhős.getÉlet()>1);


    
    


}
}

