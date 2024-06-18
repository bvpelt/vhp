package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Muscles extends BodyPart {

    public Muscles() {
        setName("Muscles");
        setType("muscles");
    }

}
