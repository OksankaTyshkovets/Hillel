package com.hillel.lesson8.homework;

public class Task3 {
    private byte a;
    private short b;
    private int c;
    private float d;
    private double n;
    private long m;
    private char l;
    private boolean e;
    private String str;

    public Task3() {

    }

    public Task3(int c) {
        this('q', true, "word");
        this.c = c;
    }

    public Task3(boolean e, String str) {
        this.e = e;
        this.str = str;
    }

    public Task3(char l, boolean e, String str) {
        this.l = l;
        this.e = e;
        this.str = str;
    }

    public Task3(long m, char l, boolean e, String str) {
        this.m = m;
        this.l = l;
        this.e = e;
        this.str = str;
    }

    public Task3(double n, long m, char l, boolean e, String str) {
        this.n = n;
        this.m = m;
        this.l = l;
        this.e = e;
        this.str = str;
    }

    public Task3(float d, double n, long m, char l, boolean e, String str) {
        this.d = d;
        this.n = n;
        this.m = m;
        this.l = l;
        this.e = e;
        this.str = str;
    }

    public Task3(int c, float d, double n, long m, char l, boolean e, String str) {
        this.c = c;
        this.d = d;
        this.n = n;
        this.m = m;
        this.l = l;
        this.e = e;
        this.str = str;
    }
    public Task3(short b, int c, float d, double n, long m, char l, boolean e, String str) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.n = n;
        this.m = m;
        this.l = l;
        this.e = e;
        this.str = str;
    }

    public Task3(byte a, short b, int c, float d, double n, long m, char l, boolean e, String str) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.n = n;
        this.m = m;
        this.l = l;
        this.e = e;
        this.str = str;
    }

    public byte getA() {
        return a;
    }

    public void setA(byte a) {
        this.a = a;
    }

    public short getB() {
        return b;
    }

    public void setB(short b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public long getM() {
        return m;
    }

    public void setM(long m) {
        this.m = m;
    }

    public char getL() {
        return l;
    }

    public void setL(char l) {
        this.l = l;
    }

    public boolean isE() {
        return e;
    }

    public void setE(boolean e) {
        this.e = e;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Task3{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", n=" + n +
                ", m=" + m +
                ", l=" + l +
                ", e=" + e +
                ", str='" + str + '\'' +
                '}';
    }
}
