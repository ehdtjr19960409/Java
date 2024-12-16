package third_listTest;

import java.util.ArrayList;

//1번
public class ArrayListTest {
	public static void main(String[] args) {
		
		//ArrayList 객체 생성
		ArrayList al = new ArrayList();
		System.out.println(al);
		System.out.println(al.toString());
		
		
		//요소 추가 add
		al.add(1);	//객체 자기자신을 넣으면(this Collection)이 나온다
		al.add(2);
		
		System.out.println(al.toString());
		
		al.add(0.5);
		al.add(1);
		al.add(1);
		System.out.println(al.toString());
		
		//ArrayList의 크기를 반복하여 요소 출력
		for(int i = 0; i < al.size() ; i++) {
			System.out.println(i+ " : " + al.get(i));
		}
		
		
		//<Elment> : 제네릭
		ArrayList<Integer> al2 =new ArrayList();
		
		for(int i =0; i< 10; i++) {
			
			al2.add((10-i) * 10);
		}System.out.println(al2);
				
		for(int data : al2) {
			
			System.out.println(data);
		}
		
	}
}
