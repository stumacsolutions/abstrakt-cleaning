package uk.co.abstrakt.user.profile;

import java.util.Optional;

public interface UserProfileService {

    Optional<UserProfile> get();

    void save(UserProfile userProfile);
}
