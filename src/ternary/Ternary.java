
package ternary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) throws FileNotFoundException {
        
        long [] arr = new long[46];
	arr[0] = 1;
	arr[1] = 3;

	//like fibonacci series, every result depends on the previous 2 numbers
        for (int i = 2; i < 46; i++)
		arr[i] = (arr[i - 1] * 3) - arr[i - 2];

	int N; //test cases
	int L; //length
        
        File in = new File("in.txt");
        Scanner reader = new Scanner(in);
        N = reader.nextInt();
        
        try (PrintWriter p = new PrintWriter(new File("out.txt"))) {
            
            for(int i=0; i<N; i++){
                L = reader.nextInt();
                if(L == 0)
                    p.println(0);
                else
                    p.println(arr[L]);
                //System.out.println(arr[L]);
            }
            
        }
    }
    
}
