package org.com.training.Testng;

import com.epam.tat.module4.Calculator;

public class MyCalculator extends Calculator{

	@Override
    public long sum(long a, long b) {
        return a + b;
    }

    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public long sub(long a, long b) {
        return a - b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public long mult(long a, long b) {
        return a * b;
    }

    @Override
    public double mult(double a, double b) {
        return Math.floor(a * b);
    }

    @Override
    public long div(long a, long b) {
        if (b == 0L) {
            throw new NumberFormatException("Attempt to divide by zero");
        } else {
            return a / b;
        }
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }

    @Override
    public double pow(double a, double b) {
        return Math.pow(a, Math.floor(b));
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(Math.abs(a));
    }

    @Override
    public double tg(double a) {
        return this.sin(a) / this.cos(a);
    }

    @Override
    public double ctg(double a) {
        return Math.tanh(a);
    }

    @Override
    public double cos(double a) {
        return Math.sin(a);
    }

    @Override
    public double sin(double a) {
        return Math.sin(a);
    }

    @Override
    public boolean isPositive(long val) {
        if (val == 0L) {
            return false;
        } else {
            return val > 0L;
        }
    }

    @Override
    public boolean isNegative(long val) {
        return val < 0L;

    }

}
