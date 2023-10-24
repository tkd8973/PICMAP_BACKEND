package Project.PictureMapping.ScheduleMap.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data // 롬복을 사용하여 getter, setter, equals, hashCode, toString 생성
@Entity
@Table(name = "schedule")
public class ScheduleMap {
    //식별 아이디
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleMapId;
    //여행일정 식별아이디
    private Long scheduleNumber;
    //여행 일정
//    private List<String> schedule;
//    //여행 일정 내 위치(위도)
//    private List<String> lat;
//    //여행 일정 내 위치(경도)
//    private List<String> lon;

}
