package Project.PictureMapping.Memeber.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component // 스프링 빈으로 등록
@Data // 롬복을 사용하여 getter, setter, equals, hashCode, toString 생성
@NoArgsConstructor // 파라미터가 없는 생성자 생성
public class UserVO {
    //식별아이디 number
    private Long userNumber;
//    //프로필사진 varchar2 500 - ThumVO로 연결
//    private String profileImage;
    //닉네임 varchar2 50
    private String nickName;
    //이메일 varchar2 100
    private String email;
    //아이디 varchar2 50
    private String id;
    //비밀번호 varchar2 50
    private String password;
    //이름 varchar2 50
    private String username;
    //전화번호 varchar2 50
    private String phoneNumber;
    //사용한 태그 varchar2 500
    private List<String> tagList;
    //가입한 날짜 datetime
    private LocalDateTime startDate;
    //수정한 날짜? Datetime
    private LocalDateTime updateDate;
}
