package rotateArray;

import java.util.Scanner;

public class RotateArrayAtK {

    void reverse(int[] arr, int start, int end){
        for(int i = start, j = end; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    int[] rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k);
        reverse(arr, k+1, n-1);
        return arr;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        RotateArrayAtK obj = new RotateArrayAtK();
        int[] ans = obj.rotateArray(arr,k);
        System.out.print("The rotated array is : ");
        for(int i = 0; i < n ; i++){
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}