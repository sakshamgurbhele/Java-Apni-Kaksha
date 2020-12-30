package takingUserInput4;
import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
				
		float pie = 3.14f;
		
		double areaOfCircle = pie*r*r;
				
		
		System.out.println("The area of Circle is = " + areaOfCircle);
		
	

	}

}
