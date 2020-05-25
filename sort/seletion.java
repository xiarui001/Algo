package sort;

import java.util.Scanner;

/**
 * 原地 不稳定 O(n2)
 * 选择排序
 */
public class seletion {
    static int[] nums = {};
    static int size = 0;
    public static void main(String[] args) {
        //接收一堆数字
        init();
        //排序
        sort();
        //输出
        out();
    }


    public static void sort(){

        for(int i = 0;i<size-1;i++){
            int max = nums[i+1];
            int index = i+1;
            for(int j=i;j<size;j++){
                //int m = nums[j];
                if(max<nums[j]){
                    max = nums[j];
                    index = j;
                }
            }
            nums[index] = nums[i];
         nums[i] = max;

        }
    }

    public static void init() {
        System.out.println("请输入数组位数：");

        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        nums = new int[size];
        int i = 0;
        System.out.println("开始输入");
        while (i < size) {
            nums[i] = in.nextInt();
            i++;
        }
    }

    public static void out() {
        StringBuffer buffer = new StringBuffer("[");
        for(int i = 0; i < size-1;i++){
            buffer.append(nums[i]).append(",");
        }
        buffer.append(nums[size-1]);
        buffer.append("]");
        System.out.println(buffer.toString());
        //return "";
    }

    public static void outt(int[] nums, int size) {
        StringBuffer buffer = new StringBuffer("[");
        for(int i = 0; i < size-1;i++){
            buffer.append(nums[i]).append(",");
        }
        buffer.append(nums[size-1]);
        buffer.append("]");
        System.out.println(buffer.toString());
        //return "";:
    }


}