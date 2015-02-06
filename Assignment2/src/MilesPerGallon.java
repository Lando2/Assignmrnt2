import java.text.DecimalFormat;
import java.util.Scanner;

public class MilesPerGallon {
	public static void main(String[] args) {
		
		double miles, gallons, mpg;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter miles driven: ");
		miles= input.nextDouble();
		System.out.println("Enter gallons of fuel used: ");
		gallons = input.nextDouble();
		DecimalFormat formatter = new DecimalFormat ("0.0000");
		mpg = miles/gallons;
		System.out.println("The miles per gallon is "+ formatter.format(mpg));
		
 }
}