package org.example;

public class TestB implements Sum{
    String name;
    int paramB;
    int paramY;

    public TestB(String name, int paramB, int paramY) {
        this.name = name;
        this.paramB = paramB;
        this.paramY = paramY;
    }


    public int sum() {
        int sumParamB = paramB+paramY;
        return sumParamB;
    }
}
