package in.my.home.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.parameters.P;

@Entity
@NoArgsConstructor
@Data
@Table(name = "member")
@SequenceGenerator(name = "idnum",sequenceName = "idnum",allocationSize = 1,initialValue = 1)
public class LoginEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "idnum")
    private int idnum;

    @NotBlank(message = "아이디는 필수 입력입니다.")
    private String id;

    @NotBlank(message = "비밀번호는 필수 입력입니다.")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\s+$).{8,16}",message = "비밀번호는 8~ 16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
    @Column()
    private String pw;

    @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-zA-Z0-9-_]{2,10}$",message = "닉네임은 특수문자를 제외한 2~10자리여야 합니다.")
    @NotBlank(message = "닉네임은 필수 입력입니다.")
    private String nickname;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,6}$",message = "이메일 형식이 올바르지 않습니다.")
    private String email;



}
