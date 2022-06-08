import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] input = {{6,8},{1,9},{2,4},{4,7}};
        // int[][] input = {{1,3},{2,5},{7,9},{10,13},{12,18}};
        int output[][] = new int[input.length][input[0].length];
        // pureArrayApproachFailed(input, output);
        output = arrayListApproach(input);
        int lenOutput = output.length;
        for(int i = 0; i < lenOutput; i++){
            System.out.println("["+
            output[i][0]+" , "+output[i][1]+"]");
        }

    }

    private static void pureArrayApproachFailed(int[][] input, int[][] output) {
        int n = input.length;

        //first sort input 
        
        output[0] = input[0];
        int j = 0;
        for(int i = 1; i<n; i++){
            if(output[j][1] > input[i][0]){
                output[j][1] = input[i][1];
                j++;
            }else {
                j++;
                output[j] = input[i];
            }
        }
    }

    public static int[][] arrayListApproach(int[][] intervals){
        
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        
        for(int[] element : intervals){
            if(result.size() == 0){
                result.add(element);
            }else {
                int[] previousElement = result.get(result.size()-1);
                if(previousElement[1] >= element[0]){
                    previousElement[1] = Math.max(
                        previousElement[1], element[1]);
                }else {
                    result.add(element);
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
