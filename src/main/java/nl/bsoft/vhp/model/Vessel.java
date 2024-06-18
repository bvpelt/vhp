package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Vessel extends BodyPart {

    public Vessel() {
        setName("Blood vessel");
        setType("blood vessel");
    }

}
