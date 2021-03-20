class PrimeNumber{
	public static void GenPrime(int m){
		int i,no=0,count=0;
		String pn= " ";
		for(i=1;i<=m;i++){
			for(no=i;no>=1;no--)
			{
				if(i%no==0)
					count++;
			}
		}
		if(count==2)
			pn=pn + i + " ";
		System.out.println(pn);
	}
	public static void main(String[] args){
		int m=10;
		GenPrime(m);
	}
}
