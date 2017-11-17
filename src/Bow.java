public class Bow implements KickBehavior {
    @Override
    public void kick(Character first, Character second){
        if(first.getPower() > second.getPower() ){
            second.setPower(second.getPower()-1);
        }
        else{
            second.setHp(second.getHp() - first.getPower());
        }
    }
}
