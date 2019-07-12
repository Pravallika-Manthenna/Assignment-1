package com.stackroute.assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {
  MissingNumber missingNumber;
  @Before
  public void setUp()  {

    missingNumber = new MissingNumber();
  }

  @After
  public void tearDown() {
    missingNumber = null;
  }
  @Test
  public void givenStringContainsIntArrayShouldMissingNumber(){
    //int[] a={'1','2','3','4','6','7','8' , '9' };
    int result = missingNumber.findNumber();
    assertEquals(5,result);
  }
}
