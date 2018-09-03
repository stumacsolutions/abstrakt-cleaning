package uk.co.abstrakt.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uk.co.abstrakt.user.data.UserDataEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.EAGER;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "customer")
class CustomerEntity extends UserDataEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "frequency")
    private String frequency;

    @Column(name = "payment_type")
    private String paymentType;

    @OneToMany(cascade = PERSIST, fetch = EAGER)
    private List<AddressEntity> addresses;
}
