package fhtw.technikumwien.sks.helpers;

import fhtw.sks.generated.Studio;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Flo on 28/11/2016.
 */
@XmlRootElement(name = "studios")
public class StudioRootElement {

    private List<Studio> studios;

    public StudioRootElement() {
    }

    @XmlElement(name="studio")
    public List<Studio> getStudios() {
        return studios;
    }

    public void setStudios(List<Studio> studios) {
        this.studios = studios;
    }
}
