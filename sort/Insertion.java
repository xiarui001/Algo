package sort;

import java.util.Scanner;

/**原地排序，稳定排序，O(n2)
 * 插入排序:将一个元素插入到一个有序数组中，维持有序
 * 有点绕，注意：查找插入位置时，要倒着比较，顺着比较就很费劲
 * 耗费一个多小时。。。
 */
public class Insertion {
    static int size ;
    static int[] nums;

    public static void main(String[] args) {
        //初始化
        init();
        //排序
        sort();
        //输出
        out();
    }

    private static void sort() {

        for(int i=1;i<size;i++){
            int tem = nums[i];
            int j=0;
            for(j=i-1;j>=0;j--){
                if(tem<nums[j]){
                    nums[j+1] = nums[j];

                }else{
                //    nums[j] = tem;
                    break;
                }
            }

            nums[j+1] = tem;
            //nums[index] = value;
        }
    }

    public static void init(){
        System.out.println("请输入数组位数:");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        nums = new int[size];
        System.out.println("开始输入：");
        int i = 0;
        while (i<size){
            nums[i] = scanner.nextInt();
            i++;
        }
    }

    public static void out(){

        Bubble.outt(nums,size);
    }
}

