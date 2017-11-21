package Main;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Start {
	
	static double ras;
	static double zatrat;
	static double cena;
	static double rast;
	public static void main(String[] args) {
		
		
		run();
	}
	
	private static void run(){
		
		
		System.out.println("������� ���������� ");
		
		try
		{
			ras = extracted().nextDouble();
		}
		catch(InputMismatchException e)
		{
			System.out.println("������������ �������� ");
			run();
		}
		
		try
		{
			System.out.println("������� ������ ������� �� 100 ��");
			zatrat = extracted().nextDouble();
		}
		catch(InputMismatchException e)
		{
			System.out.println("������������ �������� ");
			run();
		}
		
		try
		{
			System.out.println("������� ���� �� 1 ���� �������");
			cena = extracted().nextDouble();
		}
		catch(InputMismatchException e)
		{
			System.out.println("����������� ������� ����");
			run();
		}
		
		System.out.println("����� ��������� ������� - "+calculateTotalSumm(ras,zatrat));
		System.out.println("��������� ������� - "+calculateOverPaid(calculateTotalSumm(ras,zatrat), cena));
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
		
		
	
		public static double calculateTotalSumm(double ras, double zatrat){
			return rast=((zatrat/100)*(ras));
		}
	public static double calculateOverPaid( double rast, double cena){
		return (rast*cena);
	}
	}
	
	
	
