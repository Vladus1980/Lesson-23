package Ex01;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class Fraction {
	
	
	String nameFraction;

	public Fraction(String nameFraction) {
		super();
		this.nameFraction = nameFraction;
	}

	public String getNameFraction() {
		return nameFraction;
	}

	public void setNameFraction(String nameFraction) {
		this.nameFraction = nameFraction;
	}

	@Override
	public String toString() {
		return "Fraction [nameFraction=" + nameFraction + "]";
	}
	
	List<Deputat> deputat = new ArrayList<>();
	
	Supplier<Deputat> addDeputat = () ->{
		Scanner sc = Scanner(System.in);
		System.out.println("¬вед≥ть пр≥звище депутата:");
		String lastName = sc.next();
		System.out.println("¬вед≥ть ≥м'€ депутата:");
		String firstName = sc.next();
		System.out.println("¬вед≥ть зр≥ст депутата");
		int height = sc.nextInt();
		System.out.println("¬вед≥ть вагу депутата");
		int weigh = sc.nextInt();
		System.out.println("¬вед≥ть чи бере депутат хабар≥: True або False ");
		boolean bribe = sc.nextBoolean();
		
		return new Deputat(lastName, firstName, height, weigh, bribe);
	};

	private Scanner Scanner(InputStream in) {
		
		return null;
	}
}
