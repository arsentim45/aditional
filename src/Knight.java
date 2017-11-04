import java.util.Random;

public  class Knight extends Character{
    int knight_power = 2 + new Random().nextInt(10);
    int knight_hp = 2 + new Random().nextInt(10);

    public int getKnigh_power(knight_power) {
        this.knight_power = knight_power;
    }

    public int getKnight_hp(knight_hp){
        this knight_hp = knight_hp
    }

    public Knight(){
        super(this.knight_power, this.knight_hp,  "King");
    }



}