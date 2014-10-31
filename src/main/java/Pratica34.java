/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Pratica34 {
     public static void main(String[] args){
        for(int i = 0 ; fatorial(i)!=0 ; i++){
            if(fatorial(i+1)!=0)
                System.out.println(fatorial(i));
        }
        System.out.println(mdc(12, 24));
        System.out.println(mdc(7, 5));
    }
    
    public static long fatorial(int num){
        long fact=1;
        for(int i = num ; i>0 ; i--){
            fact*=i;
        }
        if(fact > 0) 
            return fact;
        else 
            return 0;
    }
    
    public static int mdc(int m, int n){
            if (n > m)
                mdc(n, m);
            else if (n > 0)
                return mdc(n, m%n);
            return m;
    }
}
