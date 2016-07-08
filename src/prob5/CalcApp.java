package prob5;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		while( true ) {
			System.out.print( ">> " );
			String input = scanner.nextLine();
			if( input.equals( "quit" ) == true ) {
				break;
			}
			
			String[] tokens = input.split( " " );
			
			switch( tokens[1] ) {
				case "+" : {
					Add add = new Add();
					
					int lValue = Integer.parseInt( tokens[0] );
					int rValue = Integer.parseInt( tokens[2] );
					add.setValue( lValue, rValue );
					
					int result = add.calculate();
					System.out.println( ">> " + result );
					
					break;
				}
				case "-" : {
					Sub sub = new Sub();
					
					int lValue = Integer.parseInt( tokens[0] );
					int rValue = Integer.parseInt( tokens[2] );
					sub.setValue( lValue, rValue );
					
					int result = sub.calculate();
					System.out.println( ">> " + result );
					
					break;
				}
				case "*" : {
					Mul mul = new Mul();

					int lValue = Integer.parseInt( tokens[0] );
					int rValue = Integer.parseInt( tokens[2] );
					mul.setValue( lValue, rValue );
					
					int result = mul.calculate();
					System.out.println( ">> " + result );
					break;
				}
				case "/" : {
					Div div = new Div();

					int lValue = Integer.parseInt( tokens[0] );
					int rValue = Integer.parseInt( tokens[2] );
					div.setValue( lValue, rValue );
					
					int result = div.calculate();
					System.out.println( ">> " + result );
					
					break;
				}
				default	: {
					System.out.println( ">> unknown operator");
					break;
				}
			}
		}
			
		scanner.close();
	}

}
