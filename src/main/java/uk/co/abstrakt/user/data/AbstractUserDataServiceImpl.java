package uk.co.abstrakt.user.data;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import uk.co.abstrakt.security.User;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;
import static java.util.stream.StreamSupport.stream;

@RequiredArgsConstructor
public abstract class AbstractUserDataServiceImpl<E extends UserDataEntity, D extends UserData>
    implements UserDataService<D> {

    private final ModelMapper mapper;
    private final UserDataRepository<E> repository;
    private final Class<D> domainClass;
    private final Class<E> entityClass;

    @Override
    public void add(D data) {
        E entity = map(data);
        entity.setUser(getCurrentUser());
        repository.save(entity);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<D> get(long id) {
        Optional<E> maybeEntity = repository.findOneByIdAndUser(id, getCurrentUser());
        return maybeEntity.map(this::map);
    }

    @Override
    public List<D> listAll() {
        Iterable<E> data = repository.findAllByUser(getCurrentUser());
        return stream(data.spliterator(), false)
            .map(this::map)
            .collect(toList());
    }

    private User getCurrentUser() {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();
        return (User) authentication.getPrincipal();
    }

    private E map(D source) {
        return mapper.map(source, entityClass);
    }

    private D map(E source) {
        return mapper.map(source, domainClass);
    }
}
