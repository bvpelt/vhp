package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Skeleton extends BodyPart {

    public Skeleton() {
        setName("Skeleton");
        setType("skeleton");
    }

}
