package java_problems_surya;

public class Test2 {
	 public int[] twoSum(int[] nums, int target) {
	        for(int i = 0;i<nums.length-1;i++) {
			for(int j =i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					return new int []{i,j};
				
				}
			}
		}
	    return new int []{};
	    }
public static void main(String[] args) {
	int [] nums = {11,15,2,7}; 
	int target = 9;
	Test2 a = new Test2();
	System.out.println(a.twoSum(nums, target));
}
}
