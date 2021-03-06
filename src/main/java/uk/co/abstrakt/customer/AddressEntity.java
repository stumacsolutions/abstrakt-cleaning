package uk.co.abstrakt.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "address")
public class AddressEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "flat_position")
    private String flatPosition;

    @Column(name = "number")
    private Integer number;

    @Column(name = "street")
    private String street;

    @Column(name = "area")
    private String area;
}
