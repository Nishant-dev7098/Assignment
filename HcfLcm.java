package com.training.practice;

public class HcfLcm {
	 static int gcd(int a, int b)
	    {
	        if (a == 0)
	            return b;
	        return gcd(b % a, a);
	    }
	 
	    // Function to find gcd of array of
	    // numbers
	    static int findGCD(int arr[], int n)
	    {
	        int result = arr[0];
	        for (int element: arr){
	            result = gcd(result, element);
	 
	            if(result == 1)
	            {
	               return 1;
	            }
	        }
	 
	        return result;
	    }
	    
	    public static long lcm_of_array_elements(int[] element_array)
	    {
	        long lcm_of_array_elements = 1;
	        int divisor = 2;
	         
	        while (true) {
	            int counter = 0;
	            boolean divisible = false;
	             
	            for (int i = 0; i < element_array.length; i++) {
	 
	                // lcm_of_array_elements (n1, n2, ... 0) = 0.
	                // For negative number we convert into
	                // positive and calculate lcm_of_array_elements.
	 
	                if (element_array[i] == 0) {
	                    return 0;
	                }
	                else if (element_array[i] < 0) {
	                    element_array[i] = element_array[i] * (-1);
	                }
	                if (element_array[i] == 1) {
	                    counter++;
	                }
	 
	                // Divide element_array by devisor if complete
	                // division i.e. without remainder then replace
	                // number with quotient; used for find next factor
	                if (element_array[i] % divisor == 0) {
	                    divisible = true;
	                    element_array[i] = element_array[i] / divisor;
	                }
	            }
	 
	            // If divisor able to completely divide any number
	            // from array multiply with lcm_of_array_elements
	            // and store into lcm_of_array_elements and continue
	            // to same divisor for next factor finding.
	            // else increment divisor
	            if (divisible) {
	                lcm_of_array_elements = lcm_of_array_elements * divisor;
	            }
	            else {
	                divisor++;
	            }
	 
	            // Check if all element_array is 1 indicate
	            // we found all factors and terminate while loop.
	            if (counter == element_array.length) {
	                return lcm_of_array_elements;
	            }
	        }
	    }
	    public static void main(String[] arr) {
	    	int[] element_array = { 2, 7, 3, 9, 4 };
	        System.out.println(lcm_of_array_elements(element_array));
	        int arr1[] = { 2, 4, 6, 8, 16 };
	        int n = arr1.length;
	        System.out.println(findGCD(arr1, n));
	    	
	    	
	    }
}
