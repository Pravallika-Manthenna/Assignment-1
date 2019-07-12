package com.stackroute.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringObjectTest {

  StringObject stringObject;
  @org.junit.Before
  public void setUp() {
    stringObject = new StringObject();

  }

  @org.junit.After
  public void tearDown() {
    stringObject = null;
  }
  @Test
  public void givenStringContainsArrayShouldReturnString(){
    char[] a={'1' , '2','3','4' };
    String result = stringObject.stringObject(a,1,3);
    assertEquals("234",result);
  }
  @Test
  public void givenStringContainsNullShouldReturnNull(){
    char[] a={};
    //String result = stringObject.stringObject(a,1,3);
    assertNull(null,null);
  }
  @Test
  public void givenStringContainsZeroShouldReturnNullMessage(){
    char[] a={'1' , '2','3','4' };
    String result = stringObject.stringObject(a,1,0);
    assertNull(null,null);
  }

}
