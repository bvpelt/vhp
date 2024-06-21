package nl.bsoft.vhp.model.cell;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BrainCell extends Cell {

    public BrainCell() {
        super.setName("BrainCell");
        super.setType("braincell");
    }
}
