package com.gembali;

public class Bharat {
    private String name;
    int richness;
    int choc;

    Bharat(int n3, int n2, String n1)//constructer
    {
        name = n1;
        richness = n2;
        choc = n3;
    }

    int hela() {
        return name.length();
    }





    void ram() {
        System.out.println(richness);
    }

    String sita() {
        return name;

    }

    int wastega() {
        return choc;
    }
}
