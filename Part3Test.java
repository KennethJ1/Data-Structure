/*
 *  This file tests the reverseInt method, as per the specification of
 *  Assignment 1 for AUSCI 235.
 *
 *  by R. Heise
 *  Sep 15, 2023 at 2:26:52 p.m.
 *
 */

import static org.junit.jupiter.api.Assertions.*;

public class Part3Test {



  /** ================================================================
   * Test of reverseInt method, of class Part3.
   */
  @org.junit.jupiter.api.Test
  public void testReverseInt0() {
    System.out.println("reverseInt on 0");
    int x = 0;
    int expResult = 0;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseInt1() {
    System.out.println("reverseInt on 1");
    int x = 1;
    int expResult = 1;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseInt10() {
    System.out.println("reverseInt on 10");
    int x = 10;
    int expResult = 1;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseInt123456789() {
    System.out.println("reverseInt on 123456789");
    int x = 123456789;
    int expResult = 987654321;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseIntNeg1() {
    System.out.println("reverseInt on -1");
    int x = -1;
    int expResult = -1;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }
  @org.junit.jupiter.api.Test
  public void testReverseIntNeg10() {
    System.out.println("reverseInt on -10");
    int x = -10;
    int expResult = -1;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }
  @org.junit.jupiter.api.Test
  public void testReverseIntNeg123456789() {
    System.out.println("reverseInt on -123456789");
    int x = -123456789;
    int expResult = -987654321;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseInt907() {
    System.out.println("reverseInt on 907");
    int x = 907;
    int expResult = 709;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseIntNeg907() {
    System.out.println("reverseInt on -907");
    int x = -907;
    int expResult = -709;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseInt2000000000() {
    System.out.println("reverseInt on two billion");
    int x = 2000000000;
    int expResult = 2;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseInt2000000001() {
    System.out.println("reverseInt on 2,000,000,001");
    int x = 2000000001;
    int expResult = 1000000002;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseIntNeg2000000000() {
    System.out.println("reverseInt on neg two billion");
    int x = -2000000000;
    int expResult = -2;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseIntNeg2000000001() {
    System.out.println("reverseInt on -2,000,000,001");
    int x = -2000000001;
    int expResult = -1000000002;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseInt2000000003() {
    System.out.println("reverseInt on 2,000,000,003");
    int x = 2000000003;
    int expResult = Integer.MAX_VALUE;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseIntNeg2000000003() {
    System.out.println("reverseInt on -2,000,000,003");
    int x = -2000000003;
    int expResult = Integer.MIN_VALUE;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseIntMaxInt() {
    System.out.println("reverseInt on max int");
    int x = Integer.MAX_VALUE;
    int expResult = Integer.MAX_VALUE;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseIntMinInt() {
    System.out.println("reverseInt on min int");
    int x = Integer.MIN_VALUE;
    int expResult = Integer.MIN_VALUE;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseIntNeg2147483641() {
    System.out.println("reverseInt on -2,147,483,641");
    int x = -2147483641;
    int expResult = -1463847412;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }

  @org.junit.jupiter.api.Test
  public void testReverseIntNeg20103083() {
    System.out.println("reverseInt on -20103083");
    int x = -20103083;
    int expResult = -38030102;
    int result = Part3.reverseInt(x);
    assertEquals(expResult, result);
  }
}
