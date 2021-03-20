class CubeSum{
	static int sum=0,rem;
	public static int CubeNum(int num){
		while(num!=0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args){
		int sum=CubeNum(1234);
		System.out.println(sum);
	}
}