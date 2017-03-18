package temp.task1;

/**
 * Created by forest on 18.03.2017.
 */
public abstract class Bird {
    private String feathers;
    private String layEggs;

    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return getClass().getSimpleName()+" - "+getFeathers()+", "+getLayEggs()+". ";
    }
}
