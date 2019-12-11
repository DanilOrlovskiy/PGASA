package com.company;

public class task9 {

    public void performance(){
        int[] G = {1,2,3,4,5,6,7,8,9,10};
        int maxIndex = 0, max = 0;
        for(int i = 1; i<10; i++){
            maxIndex = G[i] > G[i-1] ? maxIndex = i : maxIndex;
            max = G[i] > G[i-1] ? max = G[i] : max;
        }
        System.out.println("Max element: "+ max + "\nIndex of max element "+ maxIndex);
    }
}
