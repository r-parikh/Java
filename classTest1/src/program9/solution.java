package program9;

public class solution {
	
	public int solution(int[] A) {

	    int count0s = 0;
	    int consecutiveCars = 0;

	    for(int i=0; i<A.length;i++)
	    {
	        if(A[i] == 0)
	        {
	            count0s++;
	        }

	        if(count0s > 0 && A[i]==1 )
	        {
	            consecutiveCars += count0s;

	        }

	         if(consecutiveCars>1000000000)
	         {
	             return -1;
	         }
	    }

	    return consecutiveCars;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solution s = new solution();
		int[] A = {0,1,0,1,1};
		
		System.out.println(s.solution(A));

	}

}
