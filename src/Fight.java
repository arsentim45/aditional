import java.util.Random;

public class Fight {
    void fight(Character first, Character second){
        boolean b = true, tie = false;

        inr udar = new Random().nextInt(1);

        while( first.isAlive() && second.isAlive()){
            if (udar == 1) {
                first.kick(second);
                udar ++;
            }
            else {
                second.kick(first);
                udar = 1;
            }

            if(first.power == 0 && 0 == second.power) {
                tie = true;
            }
        }
        if(tie){
            System.out.println("ALL DEAD SO GOD WINS");
        }
        else if(first.isAlive()){
            HORRAY(first);
        }
        else {
            HORRAY(second);
        }

        void HORRAY( Character p) {
            System.out.println(p.name + " WINNER OF THE BATTLE");
            System.out.println("ALL GLORY TO" + p.name );
        }
    }
    }

