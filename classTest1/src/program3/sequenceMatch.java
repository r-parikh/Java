package program3;

public class sequenceMatch {
	
	public boolean sequencematch(int[] nums) {
	    boolean result = false;
	    for(int i=0; i < nums.length-2; i++){
	        if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
	            result = true;
	        }
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		sequenceMatch b = new sequenceMatch();
		int[] a = {1,4,1,2,3};
		System.out.println(b.sequencematch(a));
	}

}
