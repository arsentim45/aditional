import java.util.Random;

public class King extends Character{
    private KickBehavior kickBehavior = new Sword();
    public King() {
        super(5 + new Random().nextInt(10), 5 + new Random().nextInt(10), "King");
    }

    @Override
    public void kick(Character otherCharacter){
        kickBehavior.kick(this, otherCharacter);
    }



}
