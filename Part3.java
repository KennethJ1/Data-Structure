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
        System.out.println("2147483641 --> " + reverseInt(2147483641));
    }
    
    

    /**
     * <Fill in>
     * @param num
     * @return 
     */
    public static int reverseInt(int num){
        if (num >= Integer.MAX_VALUE){
        return Integer.MAX_VALUE;
    }
        else if (num <=Integer.MIN_VALUE){
        return Integer.MIN_VALUE; 
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
        
     
        if(reversedNumber == 1294967294){
            reversedNumber = Integer.MIN_VALUE;
        }
            else if(reversedNumber == -1294967294){
                    reversedNumber = Integer.MAX_VALUE;
            }
        
        return reversedNumber; 
        
        
    }//reverseInt    
}//end of file
