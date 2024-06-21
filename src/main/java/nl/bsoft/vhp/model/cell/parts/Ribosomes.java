package nl.bsoft.vhp.model.cell.parts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ribosomes extends Cellpart {

    public Ribosomes() {
        {
            setName("Ribosomes");
            setType ( "ribosomes");
        }
    }
}