package nl.bsoft.vhp.model.cell.parts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cellmembrane extends Cellpart{

    public Cellmembrane() {
        setName("Cellmembrane");
        setType ( "cellmembrane");
    }

}
