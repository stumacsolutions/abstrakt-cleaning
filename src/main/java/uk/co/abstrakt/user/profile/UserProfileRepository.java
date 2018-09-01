package uk.co.abstrakt.user.profile;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import uk.co.abstrakt.security.User;

import java.util.Optional;

@Repository
public interface UserProfileRepository extends PagingAndSortingRepository<UserProfileEntity, Long> {

    Optional<UserProfileEntity> findOneByUser(User user);
}
