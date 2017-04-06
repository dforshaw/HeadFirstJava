package com.headfirstjava.ch7;

import static com.headfirstjava.ch7.MonsterSound.DRAGON;
import static com.headfirstjava.ch7.MonsterSound.MONSTER;
import static com.headfirstjava.ch7.MonsterSound.VAMPIRE;

enum MonsterSound {
    MONSTER("arrrgh"),
    VAMPIRE("a bite?"),
    DRAGON("breath fire");

    String sound;

    private MonsterSound(String sound_to_use) {
        this.sound = sound_to_use;
    }

    public String getSound() {
        return sound;
    }
}

public class Monsters {
    static class Monster1 {
        boolean frighten(int d) {
            System.out.print(MONSTER.getSound() + ", ");
            return true;
        }
    }

    static class Monster2 {
        boolean frighten(int x) {
            System.out.print(MONSTER.getSound() + ", ");
            return true;
        }
    }

    static class Monster3 {
        boolean frighten(int x) {
            System.out.print(MONSTER.getSound() + ", ");
            return false;
        }
    }

    static class Monster4 {
        boolean frighten(int z) {
            System.out.print(MONSTER.getSound() + ", ");
            return true;
        }
    }

    static class Vampire1 extends Monster1 {
        boolean frighten(int x) {
            System.out.print(VAMPIRE.getSound() + ", ");
            return false;
        }
    }

    static class Vampire2 extends Monster2 {
        boolean frighten(int f) {
            System.out.print(VAMPIRE.getSound() + ", ");
            return false;
//            return 1;
        }
    }

    static class Vampire3 extends Monster3 {
        boolean scare(int x) {
            System.out.print(VAMPIRE.getSound() + ", ");
            return true;
        }
    }

    static class Vampire4 extends Monster4 {
        boolean frighten(byte b) {
            System.out.print(VAMPIRE.getSound() + ", ");
            return true;
        }
    }

    static class Dragon1 extends Monster1 {
        boolean frighten(int degree) {
            System.out.print(DRAGON.getSound() + ", ");
            return true;
        }
    }

    static class Dragon2 extends Monster2 {
        boolean frighten(int degree) {
            System.out.print(DRAGON.getSound() + ", ");
            return true;
        }
    }

    static class Dragon3 extends Monster3 {
        boolean frighten(int degree) {
            System.out.print(DRAGON.getSound() + ", ");
            return true;
        }
    }

    static class Dragon4 extends Monster4 {
        boolean frighten(int degree) {
            System.out.print(DRAGON.getSound() + ", ");
            return true;
        }
    }
}
