package Project.PictureMapping.Memeber.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Entity
@Table(name = "thumb")
public class ThumbVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long thumbId;
    private String thumbName;
    private String thumbUploadPath;
    private String thumbUuid;
    private boolean thumbImageCheck;
    private Long thumbSize;
    private Long userNumber;
}