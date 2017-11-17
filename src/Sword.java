public class Sword implements KickBehavior {
    @Override
    public void kick(Character first, Character second){
        second.setHp(second.getHp() - first.getPower());
    }
}
