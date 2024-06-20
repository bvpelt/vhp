package nl.bsoft.vhp.model.cell;

import lombok.Getter;
import lombok.Setter;
import nl.bsoft.vhp.model.BodyPart;

import java.util.Objects;

@Getter
@Setter
public class Cell {
    private String name;
    private String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return Objects.equals(name, cell.name) && Objects.equals(type, cell.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
