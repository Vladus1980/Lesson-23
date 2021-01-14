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
		System.out.println("������ ������� ��������:");
		String lastName = sc.next();
		System.out.println("������ ��'� ��������:");
		String firstName = sc.next();
		System.out.println("������ ���� ��������");
		int height = sc.nextInt();
		System.out.println("������ ���� ��������");
		int weigh = sc.nextInt();
		System.out.println("������ �� ���� ������� �����: True ��� False ");
		boolean bribe = sc.nextBoolean();
		
		return new Deputat(lastName, firstName, height, weigh, bribe);
	};

	private Scanner Scanner(InputStream in) {
		
		return null;
	}
}
