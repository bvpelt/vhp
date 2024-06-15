package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Man extends Body {
    public Man() {
        super.setKind("Man");
    }
}
