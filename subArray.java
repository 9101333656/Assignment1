package HashMap;

import java.util.HashMap;

public class subArray {

	
		public static int solution(int[] arr,int k) {
			int ans=0;
			
			HashMap<Integer,Integer>map = new HashMap<>();//stores the frequency 
			map.put(0, 1);
			int sum = 0;
			int rem = 0;
			
			for (int i=0; i< arr.length; i++) {
				sum= sum+arr[i];
				rem = sum%k;
				if (rem < 0) {
					rem= rem+k;
				}
				if (map.containsKey(rem)) {
					ans= ans+map.get(rem);
					map.put(rem, map.get(rem)+ 1);
				}
				else {
					map.put(rem, 1);
				}
			}
			return ans;
		}
		
		public static void main (String [] args) {
			int val[]= {5,10,11,9,5};
			int n= 5;
			int[] arr = new int [n];
			for (int i=0; i<n; i++) {
				arr[i] = val[i];
			}
			int k = 5;
			System.out.println(solution(arr,k));
			
		}
	}


