// { Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int t = sc.nextInt();
    
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int s = sc.nextInt();
    
                int[] m = new int[n];
                for (int j = 0; j < n; j++) {
                    m[j] = sc.nextInt();
                }
                
                Solution obj = new Solution();
                ArrayList<Integer> res = obj.subarraySum(m, n, s);
                for(int ii = 0;ii<res.size();ii++)
                    System.out.print(res.get(ii) + " ");
                System.out.println();
            }
        }
    
    }// } Driver Code Ends
    
    
    class Solution
    {
        //Function to find a continuous sub-array which adds up to a given number.
        static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
        {
            int checkSum = 0;
            int start=0,end = 0;
            for(int i = 0; i< n; i++){
                
                checkSum += arr[i];
                if(checkSum == s){
                    end = i;
                    break;
                }
                else if(checkSum < s){
                    end = i;
                }
                else {
                    i = start;
                    start += 1;
                    checkSum = 0;
                }
            }
            
            ArrayList<Integer> result = new ArrayList();
            if(checkSum == s){
                result.add(start);
                result.add(end);
            }else {
                result.add(-1);
            }
            return result;
        }
    }