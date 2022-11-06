package StringMethod;

public class Assignment2 {

	
	public static int minNum(int samDaily,int kettyDaily, int difference) {
		
		
		int samsolved=difference+samDaily;
		int kellysolved=kettyDaily;
		int count=1;
		
		if(samDaily==kettyDaily){ 
			return -1;
			} 
		
		while(samsolved-kellysolved>=0){
			
			samsolved=samsolved+samDaily;
			 kellysolved=kellysolved+kettyDaily; 
			 count++; 
			 }
		 return count; 
		 }
	
	public static void main(String[] args) {
		
		int difference=5;
		int samDaily=3;
		int kettyDaily=5;
		System.out.println(minNum(samDaily,kettyDaily,difference));
	}
		}

