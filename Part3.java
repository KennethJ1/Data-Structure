/*
 *  This file <Fill In>
 *
 *  by <Fill In>
 *
 *
 */
public class Part3 {

  /**
   * Testing of reverseInt method, using standard out.
   *
   * @param args the command line arguments (none)
   */
  public static void main(String[] args) {
    System.out.println("2000000003 --> " + reverseInt(2000000003));
  }



  /**
   * <Fill in>
   * @param num
   * @return
   */
  public static int reverseInt(int num){
    if (num == Integer.MAX_VALUE){
      return num;
    } else if (num == Integer.MIN_VALUE) {
      return num;
    }
    boolean sign;

    if (num<0){
      sign = false;
    }
    else{
      sign = true;
    }



    int reversedNumber = 0;
    while (num != 0){
      int reversedInteger = num %10;
      num /= 10;
      reversedNumber = reversedNumber * 10 + reversedInteger;
      if(sign=false){
        reversedNumber = reversedNumber * -1;
      }
    }



    return reversedNumber; //Replace this with your own
  }//reverseInt
}//end of file
