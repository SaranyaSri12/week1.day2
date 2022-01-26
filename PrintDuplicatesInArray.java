package week1.day1;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length =arr.length;//get the length of array
		int count=0;
		int i,j;
		
		for(i=0;i<length-1;i++)
		{
			for(j=i+1;j<length;j++)
			{
				if(arr[i]==arr[j])
				{
					count =count+1;
					if(count>=1) {
					
					System.out.println(arr[j]);
					}
					
				}
			
			}
			
		}
		
		
		
		
	}

}
