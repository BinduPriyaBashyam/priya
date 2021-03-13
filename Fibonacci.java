class Fibonacci{
	public static void main(String[] args){
		int a=0,b=1,c,n=3;
		System.out.println(a);
		System.out.println(b);
    	while(n<=10)
		{
			c=a+b;
			System.out.println(c);
			n++;
			a=b;
			b=c;
		}
	}
}