package nl.bsoft.vhp.model;

import lombok.Getter;
import lombok.Setter;
import nl.bsoft.vhp.model.organ.*;
import nl.bsoft.vhp.model.organ.gland.*;

import java.util.*;

@Getter
@Setter
public class Body {
    private Long identification;
    private String kind;
    private Set<BodyPart> bodyParts = new HashSet<BodyPart>();

    public Body() {
        Random r = new Random();
        this.identification = r.nextLong();

        bodyParts.add(new Lymph());
        bodyParts.add(new Muscles());
        bodyParts.add(new Skeleton());
        bodyParts.add(new Vessel());
        // Organs
        Brain brain = new Brain();
        brain.setBody(this);
        bodyParts.add(brain);
        bodyParts.add(new Heart());
        bodyParts.add(new Intestines());
        bodyParts.add(new Kidneys());
        bodyParts.add(new Liver());
        bodyParts.add(new Lungs());
        bodyParts.add(new Skin());
        bodyParts.add(new Stomach());
        // Glands
        bodyParts.add(new Adrenal());
        bodyParts.add(new Pancreas());
        bodyParts.add(new Parathyroid());
        bodyParts.add(new Pineal());
        bodyParts.add(new Pituitary());
        bodyParts.add(new Thymus());
        bodyParts.add(new Thyroid());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Body body = (Body) o;
        return Objects.equals(identification, body.identification) && Objects.equals(kind, body.kind) && Objects.equals(bodyParts, body.bodyParts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, kind, bodyParts);
    }

    @Override
    public String toString() {
        return "Body{" +
                "identification=" + identification +
                ", kind='" + kind + '\'' +
                ", bodyParts=" + bodyParts.stream()
                .sorted(Comparator.comparing(BodyPart::getName)).toList() +
                '}';
    }
}
