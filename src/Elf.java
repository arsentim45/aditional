public class Elf extends Character{
    public Elf(){
        super(10, 10, "Elf");
    }

    public void kick(Character otherCharacter ){
        if(otherCharacter.power < this.power)
            otherCharacter.hp = 0;
        else{
            while(otherCharacter.power > this.power){
                otherCharacter.power--;
            }
        }

    }



}
