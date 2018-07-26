package com.company;

public class Main {

    public static void main(String[] args) {
        Human wara=new Wara();
        Human farin=new Wara();
        Human onu=new Human() {
            @Override
            void works() {
                System.out.println("clean");

            }
        };




       // Wara wara=new Wara();
        //Farin farin=new Farin();
       Maftuha maftuha=new Maftuha();

        wara.sleeps();
        wara.works();
        onu.sleeps();
        onu.works();

        farin.sleeps();
        farin.works();

       maftuha.sleeps();
        maftuha.works();
    }
}
