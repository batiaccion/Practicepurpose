package OOps;

public class oddeven {

	public static void main(String[] args) {
		
	int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	int arraylen = numbers.length;
	
	for(int i=0;i<arraylen;i++)
	{
		if(numbers[i] % 2==0)
		{
			System.out.println("even number:"+numbers[i]);
			
	
	
		}
else{
		System.out.println("odd number:"+numbers[i]);
	}
		 

	}

}
}
