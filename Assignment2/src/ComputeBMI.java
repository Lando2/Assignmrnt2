import javax.swing.JOptionPane;
public class ComputeBMI {
	public static void main(String[] args) {

		double kilogram = .45359237;
		double meter = .0254; 
		double bmi;
		
		String weight = JOptionPane.showInputDialog("Enter your weight in pounds ");
		double wholeweight = Double.parseDouble(weight);
		
		String height = JOptionPane.showInputDialog("Enter your height in inches ");
		double wholeheight = Double.parseDouble(height);
		
		wholeweight = wholeweight * kilogram;
		
		wholeheight = wholeheight * meter;
		
		bmi = wholeweight/Math.pow(wholeheight, 2);
		
		JOptionPane.showMessageDialog(null,"Your Body Mass Index is "+ bmi);
		
		
		
		
		
	}
}