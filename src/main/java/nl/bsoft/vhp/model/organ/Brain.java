package nl.bsoft.vhp.model.organ;

import lombok.Getter;
import lombok.Setter;
import nl.bsoft.vhp.model.Body;

import java.util.Objects;

@Getter
@Setter
public class Brain extends Organ {
    private Body body;
    private int energieconsumption = 20; // 20 % of bodies energy consumption (at all ages???)

    public Brain() {
        setName("Brain");
        setType("brain");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Brain brain = (Brain) o;
        return energieconsumption == brain.energieconsumption && Objects.equals(body, brain.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), body, energieconsumption);
    }

    @Override
    public String toString() {
        String general = super.toString()
                + " Brain{" +
                "body=" + body.getIdentification() +
                ", energieconsumption=" + energieconsumption +
                '}';

        return general;
    }
}
