public class badguy {

    /*static kellet a név elé, hogy tudja kezelni  hero.Név/badguy.Név formában másik programkód */
    static String Név="Diablo";
    private static int Élet=100;
    String Heal;
    int Poison=10;
    int Damage=5;



    public String getBadguy_neve(){
        return Név;
    }

    public static int getÉlet(){
        return Élet;
    }
    public void setÉlet(int Életmegadása){
        Élet=Életmegadása;
    }


    public void Mérgezés(){
        /*getKöröm még nem működik. Cél, hogy 2 körig mérgezzen és ne lehessen csak 3-4 körönként használni */
        körök.getKöröm();
        
        int Hős_élet= hero.getÉlet();
        int sebzett_élet= Hős_élet-Poison;
        
        hero.setÉlet(sebzett_élet);
        
        System.out.println("\nA hős életéből levett a méreg: "+Poison+"-et, így a fennmaradó mennyiség = "+sebzett_élet);
    }

    public void Mérgezés_nagysága(){
    System.out.println("\nA hősünk ("+hero.Név+")"+" mérgezett sebzése: "+Poison);
    }

    public int getDamage(){
        return Damage;
    }




}