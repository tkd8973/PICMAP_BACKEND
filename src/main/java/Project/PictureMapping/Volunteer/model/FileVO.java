package Project.PictureMapping.Volunteer.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
@Data
public class FileVO {
    //    파일 번호
    private Long fileNumber;
    //    파일 이름
    private String fileId;
    //    파일 업로드 경로
    private String fileUploadPath;
    //    파일 고유 번호
    private String fileUuid;
    //    파일 이미지 체크
    private boolean fileImageCheck;
    //    파일 사이즈
    private Long fileSize;
    //    유저 번호
    private Long userNumber;
    //    업로드 시간
    private LocalDateTime uploadTime;
    //여행 일정 내 위치(위도)
    private String lat;
    //여행 일정 내 위치(경도)
    private String lon;
}