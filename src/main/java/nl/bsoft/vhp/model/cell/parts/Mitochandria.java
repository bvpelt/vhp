package nl.bsoft.vhp.model.cell.parts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mitochandria extends Cellpart {

    public Mitochandria() {
        {
            setName("Mitochandria");
            setType ( "mitochandria");
        }
    }
}
