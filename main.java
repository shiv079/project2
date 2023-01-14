 /*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		System.out.println(fact(number));

	}
    static int fact(int n){
        int f = 1;
        for(int i=2;i<=n;i++){
            f = f*i;
        }
        int res =0;
        while(f%10==0){
            res++;
            f=f/10;
        } 
        return res;
    }
}
