package werkCollege6;

import java.util.Date;

public class Main {
	public static void main(String args[]){
		System.out.println("WerkCollege 6");
		
		Passagier passagier1 = new Passagier("Jos", new Date());
		System.out.println(passagier1.getOpstartDatumDossier());
	}

}
