import java.util.*;
class Solution {
	static float power(float x, int y)
	{
		//WRITE YOUR CODE HERE
		if(y==0){
		    return 1;
		}
		
		float t=power(x,y/2);
		if(y%2==0){
		    return t*t;
		}else{
		     if(y<0){
		         return 1/x*t*t;
		    
		     }
		  return x*t*t;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float K = sc.nextFloat();
		int N = sc.nextInt();
		System.out.printf("%f", power(K, N));
	}
}

