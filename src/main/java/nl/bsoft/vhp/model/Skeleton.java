package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;
import nl.bsoft.vhp.model.organ.*;
import nl.bsoft.vhp.model.organ.gland.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

@Getter
@Setter
public class Skeleton extends BodyPart {

    public Skeleton() {
        setName("Skeleton");
        setType("skeleton");
    }

}
