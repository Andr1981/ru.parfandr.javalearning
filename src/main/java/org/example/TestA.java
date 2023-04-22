package org.example;

public class TestA implements Sum {
    String name;
    int paramA;
    int paramZ;

    public TestA(String name, int paramA, int paramZ) {
        this.name = name;
        this.paramA = paramA;
        this.paramZ = paramZ;
    }


    public int sum() {
        int sumParamA = paramA+paramZ;
        return sumParamA;
    }
}
