package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stomach extends Organ {
    public Stomach() {

        setName("Stomach");
        setType("stomach");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
