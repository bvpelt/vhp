package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;
import nl.bsoft.vhp.model.Body;
import nl.bsoft.vhp.model.cell.BrainCell;
import nl.bsoft.vhp.model.cell.Cell;
import nl.bsoft.vhp.model.cell.LymphCell;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
public class Brain extends Organ {
    private Body body;
    private Set<Cell> cells = new HashSet<Cell>();
    private int energieconsumption = 20; // 20 % of bodies energy consumption (at all ages???)

    public Brain() {
        setName("Brain");
        setType("brain");
        cells.add(new BrainCell());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Brain brain = (Brain) o;
        return energieconsumption == brain.energieconsumption && Objects.equals(body, brain.body) && Objects.equals(cells, brain.cells);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), body, cells, energieconsumption);
    }

    @Override
    public String toString() {
        return "Brain{" +
                "body=" + body.getIdentification() +
                ", cells=" + cells +
                ", energieconsumption=" + energieconsumption +
                '}';
    }
}
