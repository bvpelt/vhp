package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Body {
    private String kind;
    private Set<Organ> organSet = new HashSet<Organ>();

    public Body() {
        organSet.add(new Heart());
    }
}
