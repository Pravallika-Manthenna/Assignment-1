package com.stackroute.assignment;

public class MissingNumber {
  public int findNumber(){
    int total_num,result=0;
   int[] numbers = new int[]{1,2,3,4,6,7,8,9};
    total_num = 9;
    int expected_num_sum = total_num * ((total_num + 1) / 2);
    int num_sum = 0;
    for (int i: numbers) {
      num_sum += i;
    }
      result = (expected_num_sum - num_sum);
    return result;
  }
}
