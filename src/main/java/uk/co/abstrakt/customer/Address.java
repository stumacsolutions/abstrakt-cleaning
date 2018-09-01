package uk.co.abstrakt.customer;

import lombok.Getter;
import lombok.Setter;
import uk.co.abstrakt.user.data.UserData;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class Address extends UserData {

    @NotEmpty
    private String line1;

    private String line2;

    private String line3;

    @NotEmpty
    private String city;

    @NotEmpty
    private String postcode;
}
