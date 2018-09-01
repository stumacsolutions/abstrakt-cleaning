package uk.co.abstrakt.user.profile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uk.co.abstrakt.security.User;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user_profile")
public class UserProfileEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;
}
