package java_problems_surya;

public class Test3 {
	public static void main(String[] args) {
		int[] nums = {1,1,2,3,3};
		 int k=0;
	        for(int i =1;i<nums.length;i++){
	            if(nums[k]!=nums[i]){
	                k++;
	                nums[k]=nums[i];
	                System.out.println(k);
	            }
	        }
//	        System.out.println(k+1);
//	        for (int i : nums) {
//				System.out.println(i);
//			}
	}

}
	