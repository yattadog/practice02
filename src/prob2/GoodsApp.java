package prob2;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		final int COUNT_GOODS = 3;

		// 스캐너 생성
		Scanner scanner = new Scanner( System.in );
		
		// 상품 객체를 담을 배열
		Goods[] arrayGoods = new Goods[COUNT_GOODS];
		
		// 상품정보 입력
		for( int i = 0; i < COUNT_GOODS; i++ ) {
			String info = scanner.nextLine();
			String[] infos = info.split( " " );
			
			Goods goods = new Goods();
			//상품이름
			goods.setName( infos[ 0 ] );
			//가격
			goods.setPrice( Integer.parseInt( infos[ 1 ] ) ); 
			//재고량
			goods.setCountStock( Integer.parseInt( infos[ 2 ] ) );
			
			// 배열에 저장
			arrayGoods[ i ] = goods;
		}
		
		// 스캐너 닫기
		scanner.close();

		// 상품정보 출력
		for( Goods goods : arrayGoods ) {
			System.out.println( 
					goods.getName() + 
					"(가격:" + goods.getPrice() + "원)이 " + 
					goods.getCountStock() + "개 입고 되었습니다." );
		}
		
	}

}
