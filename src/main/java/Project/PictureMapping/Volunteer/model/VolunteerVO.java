package Project.PictureMapping.Volunteer.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component // 스프링 빈으로 등록
@Data // 롬복을 사용하여 getter, setter, equals, hashCode, toString 생성
@NoArgsConstructor // 파라미터가 없는 생성자 생성
public class VolunteerVO {
    //식별 아이디
    private Long volunteerNumber;
    //제목
    private String title;
    //내용
    private String content;
    //등록날짜 datetime
    private LocalDateTime createTime;
    //수정한 날짜 datetime
    private LocalDateTime updateTime;
    //봉사 시작 시간
    private LocalDateTime voluteerStart;
    //봉사 끝 시간
    private LocalDateTime voluteerEnd;
    //여행 일정 내 위치(위도)
    private List<String> lat;
    //여행 일정 내 위치(경도)
    private List<String> lon;

}
