package com.tugalsan.api.runnable.client;

public class TGS_RunnableUtils {

    public static TGS_RunnableType1 doNothing1() {
        return w1 -> {
        };
    }

    public static TGS_RunnableType2 doNothing2() {
        return (w1, w2) -> {
        };
    }

    public static TGS_RunnableType3 doNothing3() {
        return (w1, w2, w3) -> {
        };
    }

    public static TGS_RunnableType4 doNothing4() {
        return (w1, w2, w3, w4) -> {
        };
    }

}
