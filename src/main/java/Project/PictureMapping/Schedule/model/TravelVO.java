package Project.PictureMapping.Schedule.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component // 스프링 빈으로 등록
@Data // 롬복을 사용하여 getter, setter, equals, hashCode, toString 생성
@NoArgsConstructor // 파라미터가 없는 생성자 생성
public class TravelVO {
    //식별아이디 number
    private Long scheduleNumber;
    //유저닉네임 varchar2 50
    private String nickname;
    //여행목록 varchar2 500 List
    private List<String> scheduleList;
    //여행일정 varchar2 500 List
    private List<String> schedule;
    //생성날짜 datetime
    private LocalDateTime createTime;
    //수정한 날짜 datetime
    private LocalDateTime updateTime;
    //여행 가는 날
    private LocalDateTime scheduleStart;
    //여행 끝나는 날
    private LocalDateTime scheduleEnd;
    // 공유하기
    private boolean shared;
//    //추천봉사 식별아이디 number 제목, 내용, 시간을 가져와야함
//    private

//    // (일정에 대한 시간 datetime List) 보류
//    // 시작시간 datetime
//    private LocalDateTime travelStart;
//    //끝시간 datetime
//    private LocalDateTime travelEnd;
//    //일정 시간
//    private LocalDateTime scheTime;


}
