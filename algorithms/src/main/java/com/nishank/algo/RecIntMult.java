package com.nishank.algo;

public class RecIntMult {

    public long product(long num1 , long num2){
        long noOneLength = countDigit(num1);
        long noTwoLength = countDigit(num2);
        if(num1 < 10 && num2 < 10)
            return Math.multiplyExact(num1, num2);
        long maxNumLength= Math.max(noOneLength, noTwoLength);
        Long halfMaxLength = maxNumLength/2 + maxNumLength%2;
        long a = num1/(long)Math.pow(10,halfMaxLength);
        long b = num1 % (long)Math.pow(10,halfMaxLength);
        long c = num2/(long)Math.pow(10,halfMaxLength);
        long d = num2 % (long)Math.pow(10,halfMaxLength);

        long w0 = product(a,c);
        long x0 = product(a,d);
        long y0 = product(b,c);
        long z0 = product(b,d);
        long result = (long) (Math.pow(10, maxNumLength)*w0 + Math.pow(10, halfMaxLength)*(x0 + y0) + z0);
        return result;
    }
    private int countDigit(long number){
        if (number/10 ==0)
            return 1;
        else
            return 1 + countDigit(number/10);
    }
    public static void main(String [] args){
        RecIntMult obj = new RecIntMult();
        long result = obj.product(1,1098);
        System.out.println("Hi " + result);

    }
}
