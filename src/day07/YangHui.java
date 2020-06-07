package day07;

import java.util.Scanner;

public class YangHui {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入行数");
        int n = input.nextInt(); //输入行数
        // 二维数组来实现行列
        int[][] yanghui = new int[n][];
        //初始化
        for (int i = 0; i<yanghui.length;i++){
            // 每行的个数是所在行数加一
            yanghui[i] = new int[i+1];
            for(int j = 0;j<yanghui[i].length;j++){
                yanghui[i][0]=1;  //第一个数是1
                yanghui[i][yanghui[i].length-1] = 1;  // 最后一个数也是1
                if(i > 1 && j > 0 && j < i){
                    //第三行开始，第二个数开始，但不到最后一个数
                    yanghui[i][j] = yanghui[i-1][j]+yanghui[i-1][j-1];
                }
            }
        }

        //遍历，打印
        for(int i = 0; i<yanghui.length;i++){
            for(int j = 0; j < yanghui[i].length; j++){
                System.out.print(yanghui[i][j]+ "\t");
            }
            System.out.println();
        }

    }
}
