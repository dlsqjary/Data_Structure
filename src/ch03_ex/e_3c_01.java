package ch03_ex;

class Id{
	private static int cnt = 0;
	private int id;
	
	//생성자
	public Id() {
		id = ++cnt;
	}
	
	//ID를 반환하는 인스턴스 메소드
	public int getId() {
		return id;
	}
	
	//카운트 횟수를 반환하는 클래스메소드!!!!
	public static int getCounter() {
		return cnt;
	}
}
public class e_3c_01 {
	
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a의 Id: " + a.getId());
		System.out.println("b의 Id: " + b.getId());
		
		System.out.println("cnt횟수: " + Id.getCounter());
	}
}
