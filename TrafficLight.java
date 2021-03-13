import java.util.Scanner;
class TrafficLight{
	public static void main(String[] args){
		System.out.println("Enter the light");
		Scanner sc=new Scanner(System.in);
		int light=sc.nextInt();
		if(light==1)
			System.out.println("Stop");      //for red light
		else if(light==2)
			System.out.println("Go");        //for green light
		else
			System.out.println("Ready");     //for yellow light
	}
}