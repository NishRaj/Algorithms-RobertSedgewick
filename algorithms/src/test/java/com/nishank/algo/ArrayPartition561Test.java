package com.nishank.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArrayPartition561Test {

    @Test
    void isMaxSumOfPairs() {
    	ArrayPartition561 arrayPartition = new ArrayPartition561(new int[] {1,2,3,4,5,6});
    	int sum = arrayPartition.arrayPairSum();
    	Assertions.assertEquals(sum , 9);
    }
}
