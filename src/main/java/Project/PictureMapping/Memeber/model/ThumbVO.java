package Project.PictureMapping.Memeber.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ThumbVO {
    private Long thumbNumber;
    private String thumbName;
    private String thumbUploadPath;
    private String thumbUuid;
    private boolean thumbImageCheck;
    private Long thumbSize;
    private Long userNumber;
}