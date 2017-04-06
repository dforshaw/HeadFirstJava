package com.headfirstjava.ch7;

import com.headfirstjava.ch7.Monsters.*;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MonstersTestDrive {
//    public static void main(String[] args) {
//        Monster4[] ma = new Monster4[3];
//        ma[0] = new Monsters.Vampire4();
//        ma[1] = new Monsters.Dragon4();
//        ma[2] = new Monsters.Monster4();
//
//        for(int x=0 ; x<3 ; x++) {
//            ma[x].frighten(x);
//        }
//    }

    @Test
    public void MonstersTestDrive1() {
        String out = "";
        Monster1[] ma = new Monster1[3];
        ma[0] = new Vampire1();
        ma[1] = new Dragon1();
        ma[2] = new Monster1();

        for(int x=0 ; x<3 ; x++) {
            ma[x].frighten(x);
        }

        System.out.println();
    }

    @Test
    public void MonstersTestDrive2() {
        Monster4[] ma = new Monster4[3];
        ma[0] = new Monsters.Vampire4();
        ma[1] = new Monsters.Dragon4();
        ma[2] = new Monsters.Monster4();

        for(int x=0 ; x<3 ; x++) {
            ma[x].frighten(x);
        }

        System.out.println();
    }

    @Test
    public void MonstersTestDrive3() {
        Monster4[] ma = new Monster4[3];
        ma[0] = new Monsters.Vampire4();
        ma[1] = new Monsters.Dragon4();
        ma[2] = new Monsters.Monster4();

        for(int x=0 ; x<3 ; x++) {
            ma[x].frighten(x);
        }

        System.out.println();
    }

    @Test
    public void MonstersTestDrive4() {
        Monster4[] ma = new Monster4[3];
        ma[0] = new Monsters.Vampire4();
        ma[1] = new Monsters.Dragon4();
        ma[2] = new Monsters.Monster4();

        for(int x=0 ; x<3 ; x++) {
            ma[x].frighten(x);
        }

        System.out.println();
    }
}
