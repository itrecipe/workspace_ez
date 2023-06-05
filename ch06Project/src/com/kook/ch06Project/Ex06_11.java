package com.kook.ch06Project;
//국쌤 변형 예제(원본과살짝다름)
public class Ex06_11 { //main메서드를 갖고 있는 메인 클래스이므로 접근제어자가 public

	public static void main(String[] args) {
		//MainClass의 main메서드는 주로 자기 프로젝트의 다른 클래스의 객체를 생성하고
		//그 객체의 메서드들을 호출하여 프로젝트 일을 처리
		Data0611_1 d1 = new Data0611_1();
		d1.value = 10; //객체 생성후 객체의 멤버변수를 초기화
		
		Data0611_2 d2 = new Data0611_2(10);
		//2개의 생성자 중 파라미터가 1개인 생성자를 사용
		
		Data0611_2 d3 = new Data0611_2();
		// 2개의 생성자 중 파라미터가 없는 생성자 사용
		d3.value = 50;
	}
}

//원래 클래스 1개당 해당 클래스의 java파일이 한개여야 하나 다른 클래스의 java 파일에 포함해도 무방
class Data0611_1{
	int value; //클래스의 멤버, 인스턴스 변수
	//생성자가 명시적으로 없으므로 자바가 컴파일시 기본 생성자를 추가 해줌
}

class Data0611_2 {
	int value;
	
	//명시적으로 생성자를 만들어 주면 자바 컴파일러가 자동 제공해주던 기본 생성자는 사라짐
	//다른 생성자가 있을시 기본 생성자도 명시적으로 작성해 주는 것을 권고
	
	Data0611_2(){
		super(); //super은 안써줘도 상관없지만 명시해주는것을 권고한다고 함
	}
	
	Data0611_2(int x){
		super(); //상위클래스의 생성자를 호출(자동 호출로 작성 안해줘도 자바 컴파일러가 해줌)
		value = x; //객체 생성시 멤버변수 초기화;
	}
}