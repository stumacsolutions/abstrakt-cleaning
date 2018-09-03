package uk.co.abstrakt.area;

import lombok.Getter;
import lombok.Setter;
import uk.co.abstrakt.user.data.UserData;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class Area extends UserData {

    @NotEmpty
    private String name;
}
