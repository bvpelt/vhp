package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Muscles extends BodyPart {

    public Muscles() {
        setName("Muscles");
        setType("muscles");
    }

}
