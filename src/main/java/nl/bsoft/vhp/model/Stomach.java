package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stomach extends Organ {
    public Stomach() {
        super.setName("Stomach");
    }
}
