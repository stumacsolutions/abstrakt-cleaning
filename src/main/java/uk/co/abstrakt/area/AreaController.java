package uk.co.abstrakt.area;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.co.abstrakt.user.data.AbstractUserDataController;

@Controller
@RequestMapping(path = "/area")
class AreaController extends AbstractUserDataController<Area> {

    @Autowired
    public AreaController(AreaService service) {
        super(service, Area.class);
    }
}
