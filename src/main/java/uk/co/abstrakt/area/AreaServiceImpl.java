package uk.co.abstrakt.area;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.abstrakt.user.data.AbstractUserDataServiceImpl;

@Component
class AreaServiceImpl extends AbstractUserDataServiceImpl<AreaEntity, Area> implements AreaService {

    @Autowired
    public AreaServiceImpl(ModelMapper mapper, AreaRepository repository) {
        super(mapper, repository, Area.class, AreaEntity.class);
    }
}
