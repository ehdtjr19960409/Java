package com.app.domain;

public class UserDTO {
//   user_number NUMBER,
//   user_id varchar2(100) NOT NULL,
//   user_pw varchar2(100) NOT NULL,
//   user_name varchar2(100) NOT NULL,
//   user_phone NUMBER UNIQUE,
   int userNumber;
   String userId;
   String userPw;
   String username;
   String userPhone;

   public UserDTO() {
      super();
   }

   public UserDTO(int userNumber, String userId, String userPw, String username, String userPhone) {
      super();
      this.userNumber = userNumber;
      this.userId = userId;
      this.userPw = userPw;
      this.username = username;
      this.userPhone = userPhone;
   }

   @Override
   public String toString() {
      return "UserDTO [userNumber=" + userNumber + ", userId=" + userId + ", userPw=" + userPw + ", username="
            + username + ", userPhone=" + userPhone + "]";
   }

   public int getUserNumber() {
      return userNumber;
   }

   public void setUserNumber(int userNumber) {
      this.userNumber = userNumber;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUserPw() {
      return userPw;
   }

   public void setUserPw(String userPw) {
      this.userPw = userPw;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getUserPhone() {
      return userPhone;
   }

   public void setUserPhone(String userPhone) {
      this.userPhone = userPhone;
   }

}
