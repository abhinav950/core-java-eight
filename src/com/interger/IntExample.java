package com.interger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntExample {
    public static void main(String[] args) {
    	
    	 List<Integer> interges= Arrays.asList(1,4,7,3,6,9,3,4,7,2,3);
    	 
		 //Max Number
		 int max=interges.stream().max(Comparator.naturalOrder()).get();
		 //Min Number
		 int min=interges.stream().min(Comparator.naturalOrder()).get();
		 
		 ArrayList<Double> doubles= new ArrayList<Double>(Arrays.asList(1.38, 2.56, 4.3));
		 Double maxD = doubles.stream().max(Comparator.naturalOrder()).get();
		 Double minD = doubles.stream().min(Comparator.naturalOrder()).get();
		 
		 //Even Odd
		 for (Entry<Boolean, List<Integer>> entry : interges.stream().collect(Collectors.partitioningBy(i->i%2==0)).entrySet()) {
			 if (entry.getKey()) {
				 System.out.println("even : True "+entry.getKey());
			}else {
				System.out.println("odd : False "+entry.getKey());
			}
			 List<Integer> value = entry.getValue();
			 for (int i : value) {
				 System.out.println(""+i);
			 }
		}
		 // Max three number
		 interges.stream().sorted().limit(3).forEach(System.out::println);
		 // Min Three Number
		 interges.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		 //Sum Of all integer numbers
		 int sumInt = interges.stream().collect(Collectors.summingInt(Integer::intValue));
		 System.out.println("Sum Details : 49"+sumInt);
		 
		 IntSummaryStatistics intSummaryStatistics = interges.stream().collect(Collectors.summarizingInt(Integer::intValue));
		 System.out.println("Sum: 49 "+intSummaryStatistics.getSum());
		 System.out.println("Average: 494.4 "+intSummaryStatistics.getAverage());
		 System.out.println("Max: 9 "+intSummaryStatistics.getMax());
		 System.out.println("Min: 1 "+intSummaryStatistics.getMin());
		 
		 //Concate two array and sort 
		 int one[] = new int[] {4, 2, 5, 1};
		 int two[] = new int[] {8, 1, 9, 5};
		 int[] array = IntStream.concat(Arrays.stream(one), Arrays.stream(two)).sorted().distinct().toArray();
		 System.out.println("Array : "+Arrays.toString(array));
		 
		 List<Integer> asInstList = Arrays.asList(11,5,7,9,11,12,23,44,5,73,21,6,7,8);
		 asInstList.stream().map(String::valueOf).filter(i->i.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList()).forEach(System.out::println);
		 
		 System.out.println("Find duplicate");
		 Set<Integer> set = new HashSet<>();
		 asInstList.stream().filter(s->!set.add(s)).collect(Collectors.toSet()).forEach(System.out::println);
		 
		 long count = asInstList.stream().count();// Total No if element
		 
		 int[] array2 = interges.stream().distinct().mapToInt(Integer::intValue).toArray();
		 System.out.println(Arrays.toString(array2));
		 
		
	}
}
