import java.util.Random;

public class Knight extends Character{
    private KickBehavior kickBehavior = new Sword();
    public Knight() {
        super(2 + new Random().nextInt(10), 2 + new Random().nextInt(10), "Knight");
    }

    @Override
    public void kick(Character otherCharacter){
        kickBehavior.kick(this, otherCharacter);
    }



}