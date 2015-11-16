
package consumer.entities.ActivePlan;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Meals {

    private List<Tue> Tue = new ArrayList<Tue>();
    private List<Sun> Sun = new ArrayList<Sun>();
    private List<Thu> Thu = new ArrayList<Thu>();
    private List<consumer.entities.ActivePlan.Sat> Sat = new ArrayList<consumer.entities.ActivePlan.Sat>();
    private List<consumer.entities.ActivePlan.Wed> Wed = new ArrayList<consumer.entities.ActivePlan.Wed>();
    private List<consumer.entities.ActivePlan.Mon> Mon = new ArrayList<consumer.entities.ActivePlan.Mon>();
    private List<consumer.entities.ActivePlan.Fri> Fri = new ArrayList<consumer.entities.ActivePlan.Fri>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The Tue
     */
    public List<Tue> getTue() {
        return Tue;
    }

    /**
     * @param Tue The Tue
     */
    public void setTue(List<Tue> Tue) {
        this.Tue = Tue;
    }

    public Meals withTue(List<Tue> Tue) {
        this.Tue = Tue;
        return this;
    }

    /**
     * @return The Sun
     */
    public List<Sun> getSun() {
        return Sun;
    }

    /**
     * @param Sun The Sun
     */
    public void setSun(List<Sun> Sun) {
        this.Sun = Sun;
    }

    public Meals withSun(List<Sun> Sun) {
        this.Sun = Sun;
        return this;
    }

    /**
     * @return The Thu
     */
    public List<Thu> getThu() {
        return Thu;
    }

    /**
     * @param Thu The Thu
     */
    public void setThu(List<Thu> Thu) {
        this.Thu = Thu;
    }

    public Meals withThu(List<Thu> Thu) {
        this.Thu = Thu;
        return this;
    }

    /**
     * @return The Sat
     */
    public List<consumer.entities.ActivePlan.Sat> getSat() {
        return Sat;
    }

    /**
     * @param Sat The Sat
     */
    public void setSat(List<consumer.entities.ActivePlan.Sat> Sat) {
        this.Sat = Sat;
    }

    public Meals withSat(List<consumer.entities.ActivePlan.Sat> Sat) {
        this.Sat = Sat;
        return this;
    }

    /**
     * @return The Wed
     */
    public List<consumer.entities.ActivePlan.Wed> getWed() {
        return Wed;
    }

    /**
     * @param Wed The Wed
     */
    public void setWed(List<consumer.entities.ActivePlan.Wed> Wed) {
        this.Wed = Wed;
    }

    public Meals withWed(List<consumer.entities.ActivePlan.Wed> Wed) {
        this.Wed = Wed;
        return this;
    }

    /**
     * @return The Mon
     */
    public List<consumer.entities.ActivePlan.Mon> getMon() {
        return Mon;
    }

    /**
     * @param Mon The Mon
     */
    public void setMon(List<consumer.entities.ActivePlan.Mon> Mon) {
        this.Mon = Mon;
    }

    public Meals withMon(List<consumer.entities.ActivePlan.Mon> Mon) {
        this.Mon = Mon;
        return this;
    }

    /**
     * @return The Fri
     */
    public List<consumer.entities.ActivePlan.Fri> getFri() {
        return Fri;
    }

    /**
     * @param Fri The Fri
     */
    public void setFri(List<consumer.entities.ActivePlan.Fri> Fri) {
        this.Fri = Fri;
    }

    public Meals withFri(List<consumer.entities.ActivePlan.Fri> Fri) {
        this.Fri = Fri;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Meals withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
