package Project.PictureMapping.PicMap.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "image")
public class ImageVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public void create(String fileName, String fileUploadPath, String fileUuid, boolean fileImageCheck) {
        this.fileId = fileId;
        this.fileUploadPath = fileUploadPath;
        this.fileUuid = fileUuid;
        this.fileImageCheck = fileImageCheck;
    }
}