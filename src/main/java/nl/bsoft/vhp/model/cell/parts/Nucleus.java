package nl.bsoft.vhp.model.cell.parts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Nucleus extends Cellpart {

    public Nucleus() {
        {
            setName("Nucleus");
            setType ( "nucleus");
        }
    }
}