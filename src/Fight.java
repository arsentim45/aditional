import java.util.Random;

public class Fight {
    public void fight(Character first, Character second) {
        boolean b = true, tie = false;

        int udar = new Random().nextInt(1);

        while (first.isAlive() && second.isAlive()) {
            if (udar == 1) {
                first.kick(second);
                udar++;
            } else {
                second.kick(first);
                udar = 1;
            }

            if (first.getHp() == 0 && 0 == second.getHp()) {
                tie = true;
            }
        }
        if (tie) {
            System.out.println("ALL DEAD SO GOD WINS");
        } else if (first.isAlive()) {
            HORRAY(first);
        } else {
            HORRAY(second);
        }
    }
        private void HORRAY( Character p) {
            System.out.println(p.name + " WINNER OF THE BATTLE");
            System.out.println("ALL GLORY TO" + p.name );
        }
    }


