package com.villagecoder.PeakElementAndMaxSubarraywithMaxTwoUniqueElement;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,3,5,6,4);
        int peak = findPeak(list);
        System.out.println("index of peak: "+ peak);
        List<Integer> arr = Arrays.asList(1, 2, 3);
        int n = arr.size();
        int size = 0;
        int i= 0, j=0;
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(j=0;j<n;j++){
            mp.put(arr.get(j),mp.getOrDefault(arr.get(j),0)+1);
            while(mp.size()>2){
                mp.put(arr.get(i),mp.get(arr.get(i))-1);
                if(mp.get(arr.get(i))==0)
                    mp.remove(arr.get(i));
                i++;
            }
            size = Math.max(j-i+1,size);
        }
        System.out.println("max size: "+size);
    }

    public static int findPeak(List<Integer> list) {
        int low = 0, high = list.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midElement = list.get(mid);
            if (mid == 0 || mid == list.size() - 1) return mid;
            if (midElement > list.get(mid - 1) && midElement > list.get(mid + 1)) {
                return mid;
            }
            if (midElement < list.get(mid - 1)) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return 0;
    }
}
