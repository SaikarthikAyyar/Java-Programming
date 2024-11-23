import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int[] Result = longestIncreasingSubsequence(arr);
        for(int i = 0;i<N;i++){
            System.out.print(Result[i]+ " ");
        }
    }
    public static int[]  longestIncreasingSubsequence(int[] array){
        int n = array.length;
        int[] Sol = new int[n];
        for(int i=0;i<n;i++){
            if(i == 0){
                Sol[i] = 1;
            }
            else if(i == 1){
                Sol[i] = 0;
                if(array[i] > array[i-1]){
                    Sol[i] = Sol[i-1];
                    Sol[i] +=1;
                }
                else{
                    Sol[i] +=1;
                }
            }
            else{
                Sol[i] = 0;
                for(int j = i-1;j>0;j--){
                    if(array[i] > array[j]){
                        if(Sol[j] > Sol[i]){
                            Sol[i] = Sol[j];
                        }
                    }
                }
                if(Sol[i] == 0){
                    Sol[i] = 1;
                }
                else{
                    Sol[i] += 1;
                }
            }
        }
        return Sol;
    }
}
