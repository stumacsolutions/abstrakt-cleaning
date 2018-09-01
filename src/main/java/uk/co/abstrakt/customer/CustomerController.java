package uk.co.abstrakt.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.co.abstrakt.user.data.AbstractUserDataController;

@Controller
@RequestMapping(path = "/customer")
class CustomerController extends AbstractUserDataController<Customer> {

    @Autowired
    public CustomerController(CustomerService service) {
        super(service, Customer.class);
    }
}
