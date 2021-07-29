
public class AssignmentMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank i = new ICICIBank();
		KotMBank k = new KotMBank();
		System.out.println("Saving interest rate via ICICI abstract class: "+i.getSavingsInterestRate()+ "%");
		System.out.println("Fixed deposit interest rate via ICICI abstract class: "+i.getFixedDepositInterestRate()+"%");
		System.out.println("Saving interest rate via KotMBank abstract class: "+k.getSavingsInterestRate()+"%");
		System.out.println("Fixed deposits interest rate via ICICI abstract class: "+k.getFixedDepositInterestRate()+"%");
		
		GeneralBank g = new ICICIBank();
		GeneralBank g1 = new KotMBank();
		System.out.println("Saving interest rate via GeneralBank abstract class: " +g.getSavingsInterestRate()+"%");
		System.out.println("Fixed deposits interest rate via GeneralBank abstract class: " +g.getFixedDepositInterestRate()+"%");
		System.out.println("Saving interest rate via GeneralBank abstract class: "+g1.getSavingsInterestRate()+"%");
		System.out.println("Fixed deposits interest rate via GeneralBank abstract class: "+g1.getFixedDepositInterestRate()+"%");

	}

}
