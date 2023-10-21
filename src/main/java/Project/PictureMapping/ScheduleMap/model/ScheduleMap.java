package Project.PictureMapping.ScheduleMap.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component // 스프링 빈으로 등록
@Data // 롬복을 사용하여 getter, setter, equals, hashCode, toString 생성
@NoArgsConstructor // 파라미터가 없는 생성자 생성
public class ScheduleMap {
    //식별 아이디
    private Long scheduleMapNumber;
    //여행일정 식별아이디
    private Long scheduleNumber;
    //여행 일정
    private List<String> schedule;
    //여행 일정 내 위치(위도)
    private List<String> lat;
    //여행 일정 내 위치(경도)
    private List<String> lon;

}
