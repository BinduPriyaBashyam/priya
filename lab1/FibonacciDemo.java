// Java program for the above approach 

class FibonacciDemo{
	public static void Fibonacci(int m) 
	{ 
		int a = 0, b = 1, n=3,c;
		System.out.print(a + " ");
		System.out.print(b + " ");
		while (n <  m) { 
			c = a + b; 
			System.out.print(c + "  ");
			n++;
			a = b; 
			b = c; 
		} 
	} 
	public static void main(String[] args) 
	{
		int m = 10;  
		Fibonacci(m); 
	} 
} 
