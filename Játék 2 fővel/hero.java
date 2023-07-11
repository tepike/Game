
public class hero {
    static String Név="Herkules";
    private static int Élet=100;
    String Heal;
    int  Healmennyiség=5;
    int Damage=10;
    int Damage_boost=5;

    
    public String getHős_neve(){
        return Név;
    }


    public static int getÉlet(){
        return  Élet;
    }
    public static void setÉlet(int Életmegadása){
        Élet=Életmegadása;
    }

    public  void Healelés(){
        hero.getÉlet();
        Élet=(Élet+Healmennyiség);
    }
    
    public void Hero_élet(){
    System.out.println("\nA hősünk ("+Név+")"+" Élet ereje: "+Élet);
    }

    public int getDamage(){
        return Damage;
    }
    
    public void  setDamage(int a){
        a=10;
        Damage=a;
    }

    public void Boost_damagebe(){
        setDamage(Damage);
        Damage=Damage+Damage_boost;
        System.out.println("\nA hősünk ("+Név+")"+" növelt sebzési ereje: "+Damage);

    }

    public void Boost_damageki(){
        getDamage();
        Damage=Damage-Damage_boost;
        System.out.println("\nA hősünk ("+Név+")"+" alap sebzési ereje: "+Damage);

    }


}
