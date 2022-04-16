package stomp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TODO Bean Validation
    private String userId;
    private String userPwd;
    private String userName;

    private LocalDate userBth;

    @Enumerated(EnumType.STRING)
    private GenderType userGender;

    private String userEmail;
    private String userTel;

    @Enumerated(EnumType.STRING)
    private MemberType memberType;

    private String imageUrl;

    private String chatUrl;
}
