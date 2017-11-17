public class Elf extends Character{
    private KickBehavior kickBehavior = new Bow();
    public Elf(){
        super(10, 10, "Elf");
    }

    @Override
    public void kick(Character otherCharacter ){
        //if(otherCharacter.power < this.power)
            //otherCharacter.hp = 0;
        //else{
            //while(otherCharacter.power > this.power){
                //otherCharacter.power--;
            //}

        //}
        kickBehavior.kick(this, otherCharacter);

    }



}
