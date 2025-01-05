package in.my.home.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginDTO {
   private int idnum;
   private String id;
   private String pw;
   private String nickname;
   private String birth;
   private String gender;
   private int age;
   private String email;
   private String phone;

}
