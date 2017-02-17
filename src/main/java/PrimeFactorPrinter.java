package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bingwang on 2/16/17.
 */
public class PrimeFactorPrinter {
    public void printFactor(int number){
        List numbers = new ArrayList();
        for(int i = 2;i<number;i++){
            if(number%i==0){
                numbers.add(i);
            }
        }
        for (int j=0;j<numbers.size();j++){
            for(int m=0;m<j;m++){
                if((int)numbers.get(j)%(int)numbers.get(m)==0&&(int)numbers.get(m)!=1){
                    numbers.set(j,1);
                }
            }
        }
        for(int n=0;n<numbers.size();n++){
            if((int)numbers.get(n)!=1){
                System.out.print(numbers.get(n)+"\n");

            }
        }
    }
}
