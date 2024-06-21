package nl.bsoft.vhp.model.cell;

import lombok.Getter;
import lombok.Setter;
import nl.bsoft.vhp.model.cell.parts.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
public class Cell {
    private String name;
    private String type;
    private Set<Cellpart> cellparts = new HashSet<>();

    public Cell() {
        name = "Cell";
        type = "cell";
        cellparts.add(new Cellmembrane());
        cellparts.add(new Cytopasm());
        cellparts.add(new EndoplasmicReticulum());
        cellparts.add(new Golgiapparatus());
        cellparts.add(new Lysosomes());
        cellparts.add(new Mitochandria());
        cellparts.add(new Nucleus());
        cellparts.add(new Ribosomes());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return Objects.equals(name, cell.name) && Objects.equals(type, cell.type) && Objects.equals(cellparts, cell.cellparts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, cellparts);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", cellparts=" + cellparts +
                '}';
    }
}
