package com.company;

import java.util.ArrayList;

public class Fibonacci {

    public void printFibonacci(){
        ArrayList<Integer> nums = new ArrayList();
        nums.add(0);
        nums.add(1);

        for(int i=0; i<40; i++){
            int numsCurrent = nums.get(nums.size()-1);
            int numsPrevious = nums.get(nums.size()-2);
            nums.add(numsPrevious + numsCurrent);
        }

        System.out.println(nums);
    }
}
