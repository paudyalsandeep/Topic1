package com.example.topic1;

public class Arithmetic {

    public Arithmetic(int first, int second) {
        this.first = first;
        this.second = second;
    }

    private int first;
    private int second;

    public int add() {
        return first + second;
    }

    public int sub() {
        return first - second;
    }

    public int multiply() {
        return first * second;
    }

    public int divide() {
        return first / second;
    }

    public String displayAdd()
    {
        return first + "+" + second;
    }

    public String displaySub()
    {
        return first + "-" + second;
    }

    public String displayMultiply()
    {
        return first + "*" + second;
    }

    public String displayDivide()
    {
        return first + "/" + second;
    }

}
