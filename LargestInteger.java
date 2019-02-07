import java.lang.Math;


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int largest = 0;
        
        for(int i =0; i < (integers.length); i++)
        {
            if(integers[i] > largest)
            {
                largest = integers[i];
            }
        }
        return largest;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int largest = 0;
        
        for(int i =0; i < (integers.length); i++)
        {
            largest = Math.max((int)integers[i], largest);
        }
        return largest;
    }
}
