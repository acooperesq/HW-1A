
public class HW_1A_Resubmit {

	public static void main(String[] args) {
		
		
	// test score
		
		double t1, t2, t3, t4, t5, t6;
		
		// assignment score
		double a1, a2, a3, a4, a5, a6;
		
		// calculations
		double avg_test, avg_assignment, mast_avg;
		
		// TEST SCORES RESPECTIVE WEIGHTS
		// 		assigning the respective weights to the various test scores in order of presentation
	
		
		//  each one of these is multiplied by the "raw" test scores
		
		t1 = 0.10 *75;
		t2 = 0.20 *95;
		t3 = 0.25 *85;
		t4 = 0.25 *55;
		t5 = 0.10 *65;
		t6 = 0.10 *70;
		
				
		//ASSIGNMENT SCORES RESPECTIVE WEIGHTS
				// 		assigning the respective weights to the various assignment scores in order of presentation
				 
		
		a1 = 0.05 *55;
		a2 = 0.10 *65;
		a3 = 0.15 *65;
		a4 = 0.25 *60;
		a5 = 0.25 *55;
		a6 = 0.20 *50;
		
		
		// CALCULATE WEIGHTED AVERAGE OF SIX TEST SCORES
		
			avg_test = (t1 +t2 +t3 +t4 + t5 + t6) / 6.0;
			
			System.out.println("Weighted Average test score:  " + avg_test); 
			 
		
		//	CALCULATE WEIGHTED AVERAGE OF SIX ASSIGNMENT SCORES			
			avg_assignment = (a1 +a2 +a3 +a4 + a5 + a6) / 6.0;
			System.out.println("Weighted Average assignment score:  " + avg_assignment); 
			
	
		//	CALCULATE MASTER AVERAGE BETWEEN TWO WEIGHTED AVERAGES
			
			mast_avg = ( avg_test + avg_assignment)/2;
			System.out.println("Master Average:  " + mast_avg);

	}

}
