package uk.co.abstrakt.customer;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.abstrakt.user.data.AbstractUserDataServiceImpl;

@Component
class CustomerServiceImpl extends AbstractUserDataServiceImpl<CustomerEntity, Customer> implements CustomerService {

    @Autowired
    public CustomerServiceImpl(ModelMapper mapper, CustomerRepository repository) {
        super(mapper, repository, Customer.class, CustomerEntity.class);
    }
}
