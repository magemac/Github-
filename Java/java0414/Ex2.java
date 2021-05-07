package java0414;

// 클래스 정의  Book (책종류)
//    책제목   문자열 title
//    책가격   정수형 price (한권당 가격)
//    책갯수   정수형 num
//    책의 총액 구해서 리턴하는 메소드  (단위가격*num)
class Book {
	String title;
	int price;
	int num;
	
	int totalAmount() {
		return price * num;
	}
}

public class Ex2 {

	public static void main(String[] args) {
		// Book 사용
		Book b1 = new Book();
		// 출력형식
		// 책제목:  Java     가격: 10000     갯수: 30
		// 총액: 300000
		b1.title = "Java";
		b1.price = 10000;
		b1.num = 30;
		System.out.printf("책제목: %s   가격: %d   갯수: %d\n", b1.title, b1.price, b1.num);
		System.out.printf("총액: %d\n", b1.totalAmount());
		
		// 책제목:  Oracle   가격: 20000     갯수: 20
		// 총액: 400000
		Book b2 = new Book();
		
		b2.title = "Oracle";
		b2.price = 20000;
		b2.num = 20;
		System.out.printf("책제목: %s   가격: %d   갯수: %d\n", b2.title, b2.price, b2.num);
		System.out.printf("총액: %d\n", b2.totalAmount());
	} // main

}
