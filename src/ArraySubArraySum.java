import java.util.ArrayList;
import java.util.List;

public class ArraySubArraySum{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int targetSum = 15;
        // int [] arr = {1,2,3,7,5};
        // int targetSum = 12;
        int checkSum = 0;
        int start=0,end = 0;
        for(int i = 0; i< arr.length; i++){
            
            checkSum += arr[i];
            if(checkSum == targetSum){
                end = i;
                break;
            }
            else if(checkSum < targetSum){
                end = i;
            }
            else {
                i = start;
                start += 1;
                checkSum = 0;
            }
        }

        System.out.println("start position : "+(start+1)+"\nend position : "+(end+1));
    
        List<Integer> result = new ArrayList<>();
        if(checkSum == targetSum){
            result.add(start);
            result.add(end);
        }else {
            result.add(-1);
        }
    }
}