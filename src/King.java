import java.util.Random;

public  class King extends Character{
    int king_power = 5 + new Random().nextInt(10);
    int king_hp = 5 + new Random().nextInt(10);

    public int getKing_power(king_power) {
        this.king_power = king_power;
    }

    public int getKing_hp(king_hp){
        this king_hp = king_hp
    }

    public King(){
        super(this.king_power, this.king_hp,  "King");
    }



}
