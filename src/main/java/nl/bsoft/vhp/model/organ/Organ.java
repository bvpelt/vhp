package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/*
The following Organs exists for a human
- Hearth
- Intestine (darmen)
- Kidney
- Liver
- Lung
- Skin
 */
@Getter
@Setter
public class Organ {
    private String name;

    @Override
    public String toString() {
        return "Organ{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organ organ = (Organ) o;
        return Objects.equals(name, organ.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
