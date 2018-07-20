package program5;

public class scoreUp {
	
	public int scoreUp(String[] key, String[] answers) {
	    int score = 0;
	    
	    for(int i = 0; i < key.length; i++) {
	        if(key[i].charAt(0) == answers[i].charAt(0)) {
	            score += 4;
	        } else if(answers[i].charAt(0) != '?') {
	            score -= 1;
	        }
	    }
	                                  
	    return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scoreUp su = new scoreUp();
		String[] key = {"a", "a", "b", "b"};
		String[] answers = {"a", "c", "b", "c"};
		System.out.println(su.scoreUp(key, answers));

	}

}
