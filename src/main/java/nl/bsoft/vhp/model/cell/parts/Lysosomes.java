package nl.bsoft.vhp.model.cell.parts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lysosomes extends Cellpart {

    public Lysosomes() {
        {
            setName("Lysosomes");
            setType ( "lysosomes");
        }
    }
}
