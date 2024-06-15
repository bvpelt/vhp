package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Woman extends Body {
    public Woman() {
        super.setKind("Woman");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

