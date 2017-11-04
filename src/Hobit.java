public class Hobit extends Character {

    public Hobit(){
        super(0,3, "Hobbit");

    }

    public void kick(Character c){
        toCry();

    }
    public void toCry(){
        System.out.println("Crying");
        System.out.println("Making no dmg");
        System.out.println("DOING NOTHING");
        System.out.println("Run Away");
    }


}