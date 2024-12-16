package com.task.userService.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.task.userVo.UserVo;

public class UserServiceController {
		Scanner sc = new Scanner(System.in);
	
//	- UserService 클래스
//	회원정보를 저장할 List를 private으로 선언한다
//	아이디 중복검사 메소드
//	회원가입 메소드
//	로그인 메소드
	
// 회원정보를 저장할 list를 private으로 선언
	private ArrayList list;
	
	
// ID중복검사(){
//	  * 회원가입 메소드 -> void sign()
//	    * 리턴타입 void
//	    * 매개변수 X
//	    * 
//	    * syso(id를 입력하세요);
//	    * String id = sc.next();
//	    * 
//	    * idCheck(id);
//	    * 
//	    * syso(비밀번호를 입력하세요);
//	    * 
//	    * String passwd = sc.next();
//	    * 
//	    * syso(이름를 입력하세요);
//	    * String name = sc.next();
//	    * 
//	    * syso(나이를 입력하세요);
//	    * int age = sc.nextInt();
//	    * 
//	    * UserV0 v1 = new UserV0(id, passwd, name, age);
//	    * 
//	    * list.add(v1);
//	    * 
//	    * syso(회원가입 성공)

	//* 아이디 중복검사 메소드
//	boolean idCheck(Object o) {
//		for(Object object : list) {
//			
//			if(object.get(id)==o.id) {
//				return false;
//			}else {
//				return true;
	
	
//			}
//			
//		}
//	}
	
// * 회원가입 메소드	
	void sign() {
		System.out.println("번호를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		System.out.print("id를 입력하세요 : ");
		String id = sc.next();
		
		
		System.out.print("비밀번호를 입력하세요 : ");
		String passwd = sc.next();
		
		System.out.print("이름 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("나이 입력하세요 : ");
		int age = sc.nextInt();
		
		UserVo v1 = new UserVo(num, id, passwd, name, age);
		
		list.add(v1);
		System.out.println("회원가입 성공");
		
	}
	
	
// * 로그인 메소드
	
	
	
	
	
}
