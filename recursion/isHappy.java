package recursion.src;

import java.util.*;
class isHappy{
// import java.lang.*

    static boolean isHappy  (int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n=n/10;
        }
        if(sum==1){
            return true;
        }
        if(sum==temp){
            return false;
        }
        if(sum==4){
            return false;
        }
        return isHappy(sum);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isHappy(n));


    }
}

