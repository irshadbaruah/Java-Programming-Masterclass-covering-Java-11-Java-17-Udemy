package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Min Value = " + myMaxIntValue);
        System.out.println("Busted Max value = " +(myMaxIntValue+1));
        System.out.println("Busted Min value = " +(myMinIntValue-1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value =" + (myMinByteValue));
        System.out.println("Byte Maximum Value =" + (myMaxByteValue));

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Byte Minimum Value =" + (myMinShortValue));
        System.out.println("Byte Maximum Value =" + (myMaxShortValue));

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value =" + (myMinLongValue));
        System.out.println("Long Maximum Value =" + (myMaxLongValue));
        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
