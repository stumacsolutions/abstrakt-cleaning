package uk.co.abstrakt.customer;

import lombok.Getter;
import lombok.Setter;
import uk.co.abstrakt.user.data.UserData;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.singletonList;

@Getter
@Setter
public class Customer extends UserData {

    @NotEmpty
    private String forename;

    @NotEmpty
    private String surname;

    private String emailAddress;

    private String phoneNumber;

    @Valid
    private List<Address> addresses = singletonList(new Address());
}
