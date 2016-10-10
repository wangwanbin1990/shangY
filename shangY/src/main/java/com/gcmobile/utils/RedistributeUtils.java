package com.gcmobile.utils;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * <p>
 * Description:将数组随机打乱工具类<br />
 * </p>
 * @title RedistributeUtils.java
 * @package com.cxdai.utils 
 * @author YangShiJin
 * @version 0.1 2015年4月12日
 */
public class RedistributeUtils {
	
	/**
	 * 
	 * <p>
	 * Description:洗牌程序原理随机打乱数组<br />
	 * </p>
	 * @author YangShiJin
	 * @version 0.1 2015年4月12日
	 * @param array
	 * @param random
	 * void
	 */
	public static void shuffle(int[] array, Random  random){  
        for(int i = array.length; i >= 1; i--){  
        	// 实现随机的两张牌调换
            swap(array,i-1,random.nextInt(i));  
        }  
    }  
	      
	/**
	 * 
	 * <p>
	 * Description:调换位置<br />
	 * </p>
	 * @author YangShiJin
	 * @version 0.1 2015年4月12日
	 * @param array
	 * @param i
	 * @param j
	 * void
	 */
    public static void swap(int[] array, int i , int j){  
        int  temp = array[i];  
        array[i] = array[j];  
        array[j] = temp;  
    }  
    
    
    /**
     * 
     * <p>
     * Description:生成随机索引交换原理打乱数组<br />
     * </p>
     * @author YangShiJin
     * @version 0.1 2015年4月12日
     * @param s
     * void
     */
    public static int [] redistribute(int[] s){  
        Random random = new Random();  
        Set<Integer> set = new LinkedHashSet<Integer>();  
        while(true){  
            int t =random.nextInt(s.length);  
            set.add(t);  
            if(set.size()== s.length)  
            break;  
        }  
        int [] out  = new int[s.length];  
        int  count = 0;  
        for(Iterator<Integer> iterator = set.iterator(); iterator.hasNext();){  
            out[count] = s[iterator.next()];  
            count++;  
        }  
        return out;
    }  
    
    
    public static void main(String[] args) {  
        int[]  s = {1,5,4,3,6,9,8,7,0,8,5,6,7,2};  
        System.err.println("方法一：=========");
        System.out.println("before redistribute1:---");  
        for(int i = 0 ; i<s.length; i++){  
            System.out.print(s[i]+" ");  
        }  
        System.out.println();
        int [] out = redistribute(s);  
        for(int i = 0 ; i<s.length; i++){  
            System.out.print(out[i]+" ");  
        } 
        System.out.println();
        System.out.println("after redistribute1:---");  
        
        System.err.println("方法二：=========");
        int[]  ss = {1,5,4,3,6,9,8,7,0,8,5,6,7,2}; 
        
        System.out.println("before redistribute2:---");  
        for(int i = 0 ; i<ss.length; i++){  
            System.out.print(ss[i]+" ");  
        }  
        shuffle(ss,new Random());  
        
        System.out.println();  
        for(int i = 0 ; i<ss.length; i++){  
            System.out.print(ss[i]+" ");  
        }  
        System.out.println();  
        System.out.println("after redistribute2:---");  
    }  
}
