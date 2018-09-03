package uk.co.abstrakt.customer;

import lombok.Getter;
import lombok.Setter;
import uk.co.abstrakt.user.data.UserData;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

import static java.util.Collections.singletonList;

@Getter
@Setter
public class Customer extends UserData {

    @NotEmpty
    private String name;

    private String emailAddress;

    private String phoneNumber;

    private String frequency;

    private String paymentType;

    @Valid
    private List<Address> addresses = singletonList(new Address());
}
