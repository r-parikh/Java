package program8;

public class solution {
	
	public int solution(int[] A) 
	{
	    int i = 0, count = 0, N = A.length;
	    int[] B = new int[100001];      

	    for (i = 0; i < N; i++)         
	        if (A[i] > 0 && A[i] < 100001)
	        {
	            B[A[i]] = A[i];         
	            count++;                
	        }

	    for (i = 1; i < count + 1; i++) {  
	        if (B[i] == 0)               
	            return i;
	        }                           
	    return count + 1;               
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solution sn = new solution();
		int[] A = {1,3,6,4,1,2};
		
		System.out.println(sn.solution(A));

	}

}
