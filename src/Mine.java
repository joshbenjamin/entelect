/**
 * A mine is a factory that has resources
 */
public class Mine extends Factory{
    public int resources;

    public Mine(String index, String tag, String x, String y, String resources) {
        super(index, tag, x, y);
        this.resources = Integer.parseInt(resources);
    }

    @Override
    public String toString() {
        return super.toString() + " Resources: " +resources;
    }
}
