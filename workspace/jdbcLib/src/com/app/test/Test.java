package com.app.test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.DBConnector;
import com.app.dao.LibDAO;
import com.app.domain.BookDTO;
import com.app.domain.RentalDTO;
import com.app.domain.UserDTO;

public class Test {
	public static void main(String[] args) {
		
		try {
			Connection conn = DBConnector.getConnection();
			System.out.println("연결 성공");
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결실패");
		}
		
		BookDTO bookDTO = new BookDTO();
		LibDAO bookDAO = new LibDAO();
		
		UserDTO userDTO = new UserDTO();
		RentalDTO rentalDTO = new RentalDTO();
		LibDAO libDAO = new LibDAO();	     
	    List<BookDTO> list = new ArrayList<>();

		
		
		//책번호로 도서조회
		
		BookDTO book = bookDAO.bookSearch(1);
		System.out.println(book);
		
		
//        - 대여상태확인 rentalCheck 태현
      RentalDTO rental = libDAO.rentalCheck(1);
      System.out.println(rental);
    

      
      //도서 목록 조회
      list = libDAO.bookList();
      list.forEach(System.out::println);
   }


}

