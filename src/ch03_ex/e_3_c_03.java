package ch03_ex;

public class e_3_c_03 {
// 제네릭 클래스의 예
	
	static class GenericClass<T>{	// <T> --파라미터
		private T xyz;
		GenericClass(T t){
			this.xyz = t;
		}
		T getXYZ() {
			return xyz;
		}
	}
	
	public static void main(String[] args) {
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println(s.getXYZ());
		System.out.println(n.getXYZ());
		
	}

}
