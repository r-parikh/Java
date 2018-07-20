package program10;

import java.util.Arrays;

public class permutation {
	  public static final int NOT_PERMUTATION = 0;
	  public static final int PERMUTATION = 1;
	  
	  public int solution(int[] A) {
	    
	    int[] mark = new int[A.length + 1];
	    int counter = 0;

	    for (int i = 0; i < A.length; ++i) {
	        int value = A[i];
	        if(value >= mark.length) {
	             return NOT_PERMUTATION;
	        }
	        if(mark[value] == 0) {
	            mark[value]=1;
	            ++counter;
	        } else {
	            return NOT_PERMUTATION;
	        }
	    }

	    return counter == A.length ? PERMUTATION : NOT_PERMUTATION;
	  }
	  
	  
	  public static void main(String[] args) {
		  permutation pc = new permutation();
		  
		  int[] A = {4,1,3};
		  System.out.println(pc.solution(A));
	  }
}
