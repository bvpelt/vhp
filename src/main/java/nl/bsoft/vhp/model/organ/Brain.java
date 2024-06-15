package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;
import nl.bsoft.vhp.model.Body;

import java.util.Objects;

@Getter
@Setter
public class Brain extends Organ {
    private Body body;

    public Brain() {
        super.setName("Brain");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Brain brain = (Brain) o;
        return Objects.equals(body, brain.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), body);
    }

    @Override
    public String toString() {
        return "Brain{" +
                "body=" + body.getIdentification() + " " + super.toString() +
                '}';
    }
}
