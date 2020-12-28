package codewar.stream.api;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main (String [] args){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,67,7);
        List<Integer> evens= list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(evens);

        List<String> stringList=Arrays.asList("ABS", "cfdgrew", "ggw", "", "abcde", "ttewds");
        long countList= stringList.stream().filter(x->! x.isEmpty()).count();
        System.out.println("Not Empty String"+countList);

        /*Length more that 3 */
        long length= stringList.stream().filter(x->x.length()>3).count();
        System.out.println("Length:"+ length);

        /*Remove Empty Strings*/
        List<String> noneIsEmptyList= stringList.stream().filter(x->! x.isEmpty()).collect(Collectors.toList());
        System.out.println(noneIsEmptyList);

        /*Convert to UpperCase and join with Comma*/
        String strListWithComma= stringList.stream().map(x->x.toLowerCase()).filter(y->! y.isEmpty()).collect(Collectors.joining(", "));
        System.out.println(strListWithComma);

        /*List of the Square of all the Distinct Numbers*/
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

        List<Integer> squareList= numbers.stream().map(x->x*x).distinct().collect(Collectors.toList());
        System.out.println(squareList);

        /*Count, Sum, Average, Min, and Max*/
        int sum = numbers.stream().reduce(0 ,(a,b)->a+b);
        System.out.println(sum);

        int sum2 = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum2);

        int sum3 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum3);

        IntSummaryStatistics statistics= numbers.stream().mapToInt(x->x).summaryStatistics();
        System.out.println("Average:"+statistics.getAverage()+" Max: "+ statistics.getMax()+ " Min:"+ statistics.getMin());

    }
}
