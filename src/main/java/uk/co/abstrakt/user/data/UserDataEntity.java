package uk.co.abstrakt.user.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uk.co.abstrakt.security.User;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class UserDataEntity {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(optional = false)
    private User user;
}
