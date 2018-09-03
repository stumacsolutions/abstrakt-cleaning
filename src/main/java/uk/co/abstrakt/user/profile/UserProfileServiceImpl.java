package uk.co.abstrakt.user.profile;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static uk.co.abstrakt.security.User.getCurrentUser;

@Component
@RequiredArgsConstructor
class UserProfileServiceImpl implements UserProfileService {

    private final ModelMapper mapper;
    private final UserProfileRepository repository;

    @Override
    public Optional<UserProfile> get() {
        Optional<UserProfileEntity> optional = repository.findOneByUser(getCurrentUser());
        return optional.map(this::map);
    }

    @Override
    public void save(UserProfile userProfile) {
        repository.save(map(userProfile));
    }

    private UserProfile map(UserProfileEntity source) {
        return mapper.map(source, UserProfile.class);
    }

    private UserProfileEntity map(UserProfile source) {
        UserProfileEntity entity = mapper.map(source, UserProfileEntity.class);
        entity.setUser(getCurrentUser());
        return entity;
    }
}
