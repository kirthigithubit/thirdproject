public class numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Odd Numbers");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n numbers:");	
		int no = sc.nextInt();
	    int[] a=new int[no];
	    for(int i=0;i<no;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    for(int i=0;i<no;i++)
	    {
	    	if(a[i]%7==0)
	    	{
	    	 System.out.println("Odd number is "+a[i]);
	    	}
	    }
		System.out.println("Even Numbers");
		Scanner in=new Scanner(System.in);
		System.out.println("enter the n numbers:");	
		int n = in.nextInt();
	    int[] array=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	array[i]=in.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	    	if(array[i]%4==0)
	    	{
	    	 System.out.println("Even number is "+array[i]);
	    	}
	    }
	}
}
