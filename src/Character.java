import java.util.Random;

public abstract class Character {
    private int power;
    private int hp;
    protected String name;


    public abstract void kick(Character c);

    public void setPower(int power) {
        this.power = power;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public Integer getPower() {
        return this.power;
    }
    public Integer getHp() {
        return this.hp;
    }
    public boolean isAlive() {
        if (hp < 0)
            hp = 0;
        return hp > 0;
    }

    Character(int power, int hp, String name) {
        this.power = power;
        this.hp = hp;
        this.name = name;
    }
    public Character createCharacter(){
        int myChar = new Random().nextInt(3);
        Character myChar;
        switch(myChar){
            case 0: myChar = new Hobbit();
            case 1: myChar = new Elf();
            case 2: myChar = new King();
            case 3: myChar = new Knight();

        }
        return myChar;

    }
}
}

