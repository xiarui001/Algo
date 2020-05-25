package sort;

import java.util.Scanner;

/**
 * 冒泡排序:将大数冒泡到数组靠后的位置
 * 时间复杂度O(n2)，稳定的排序算法
 */
public class Bubble {
    static int[] nums = {};
    static int size = 0;
    public static void main(String[] args) {
        //接收一堆数字
        init();
        //排序
        bubbleSort();
        //输出
        out();
    }

    //优化：如果一开始就是顺序的就不需要在循环了
    public static void bubbleSort(){
        for(int i=0;i<size;i++){
            boolean mask = false;
            for(int j=i+1;j<size;j++){
                if(nums[i]>nums[j]){
                    int tem = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tem;
                    mask = true;
                }
            }
            if(!mask)break;
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
        //return "";
    }


}
