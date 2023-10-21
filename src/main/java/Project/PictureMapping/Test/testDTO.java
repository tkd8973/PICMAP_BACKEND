package Project.PictureMapping.Test;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="Test")
public class testDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tid;

    private String TEst;
}