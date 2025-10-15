import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        int x =sc.nextInt();
        int y=sc.nextInt();
        System.out.println(x/y);
        }catch(InputMismatchException ex){
            System.out.println(ex.getClass().getName());
        } 
            catch(ArithmeticException ie){
                System.out.println(ie.getClass().getName()+": "+ie.getMessage());
                
            }
        
        
    }
}
