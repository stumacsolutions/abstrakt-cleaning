package uk.co.abstrakt.customer;

import org.springframework.stereotype.Repository;
import uk.co.abstrakt.user.data.UserDataRepository;

@Repository
interface CustomerRepository extends UserDataRepository<CustomerEntity> {
}
