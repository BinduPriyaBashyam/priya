class Armstrong{
	public static void main(String[] args){
		int dup,rem,sum=0,n=153;
		dup=n;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(sum==dup)
			System.out.println("Armstrong");
		else
			System.out.println("not");
	}
}