package uk.co.abstrakt.user.data;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import uk.co.abstrakt.security.User;

import java.util.Optional;

@NoRepositoryBean
public interface UserDataRepository<E extends UserDataEntity> extends PagingAndSortingRepository<E, Long> {

    Iterable<E> findAllByUser(User user);

    Optional<E> findOneByIdAndUser(long id, User user);
}
