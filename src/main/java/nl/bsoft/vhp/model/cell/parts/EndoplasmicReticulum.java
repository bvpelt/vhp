package nl.bsoft.vhp.model.cell.parts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EndoplasmicReticulum extends Cellpart {

    public EndoplasmicReticulum() {
        {
            setName("EndoplasmicReticulum");
            setType ( "endoplasmicreticulum");
        }
    }
}