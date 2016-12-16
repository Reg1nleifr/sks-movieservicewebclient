package fhtw.technikumwien.sks.helpers;

import fhtw.sks.generated.Actor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Flo on 28/11/2016.
 */
@XmlRootElement(name="actors")
public class ActorRootElement {

    private List<Actor> actors;

    public ActorRootElement() {
    }

    @XmlElement(name="actor")
    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
