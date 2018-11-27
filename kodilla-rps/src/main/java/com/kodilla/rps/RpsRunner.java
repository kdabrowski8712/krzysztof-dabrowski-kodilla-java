package com.kodilla.rps;

import java.util.Random;

public class RpsRunner {
    public static void main(String[] args) {
        System.out.println("RPS Module");
       //RpsGame game  = new RpsGame();
        //game.start();
       Random r = new Random();

       for(int i=0; i<20; i++) {
           System.out.print((r.nextInt(3)+1)+ " ") ;
       }

    //    Character c = '3';
  //      Integer val = 1;
//        Character char2 = val.toString().charAt(0);
//        System.out.println(char2);
    }
}

class Test {
    private int testVal;
    private boolean testVal2;

    public int getTestVal() {
        return testVal;
    }

    public void setTestVal(int testVal) {
        this.testVal = testVal;
    }

    public boolean isTestVal2() {
        return testVal2;
    }

    public void setTestVal2(boolean testVal2) {
        this.testVal2 = testVal2;
    }
}
