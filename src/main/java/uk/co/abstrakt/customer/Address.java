package uk.co.abstrakt.customer;

import lombok.Getter;
import lombok.Setter;
import uk.co.abstrakt.user.data.UserData;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class Address extends UserData {

    private String flatPosition;

    @NotNull
    private Integer number;

    @NotEmpty
    private String street;

    @NotEmpty
    private String area;
}
