package nl.bsoft.vhp.model.cell.parts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cytopasm extends Cellpart {

    public Cytopasm() {
        {
            setName("Cytopasm");
            setType ( "cytopasm");
        }
    }
}
