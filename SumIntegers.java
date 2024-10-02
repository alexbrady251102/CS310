import java.util.Map;
import java.util.Hashtable;

public class SumIntegers {
    public static void main(String[] args) {

         int[] intArray = {15,5,10,7,25,30,42,33,11,57,92};
         int sum = 67;


        {
            Map<Integer, Integer> intMap = new Hashtable<Integer, Integer>();
            for (int i=0; i<intArray.length; i++)
            {
                intMap.put(i, intArray[i]);
                if(intMap.containsValue(sum - intArray[i]))
                    System.out.println("Found numbers : "+intArray[i] +" and "+(sum - intArray[i]));

            }
            System.out.println(intMap);
        }


    }
}
