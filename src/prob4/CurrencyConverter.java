package prob4;

public class CurrencyConverter {

	private static double rate = 0.;

	public static void setRate( double rate ) {
		CurrencyConverter.rate = rate;
	}
	
	public static int toDollar( int kwr ) {
		return (int)( kwr / rate );
	}

	public static int toKWR( int dollar ) {
		return (int)( dollar * rate );
	}

	public static void main(String[] args) {
		setRate( 1208.50 );
		System.out.println( "백만원은 " + toDollar( 1000000 ) + "달러 입니다." );
		System.out.println( "백달러는 " + toKWR( 100 ) + "원 입니다." );
	}
}
