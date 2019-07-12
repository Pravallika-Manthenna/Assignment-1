package com.stackroute.assignment;

public class StringObject {
  public String stringObject(char[] arr, int first, int last) {
    String result;
    if (arr == null)
      result = null;
    if (last == 0)
      result = null;
    else {
      String str = String.copyValueOf(arr, first, last);

      result= str;
    }
    return result;
  }

}
