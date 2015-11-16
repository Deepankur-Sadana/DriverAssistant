
package consumer.entities.CreateDietPlan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Meals {

    private List<consumer.entities.CreateDietPlan.Tue> Tue = new ArrayList<consumer.entities.CreateDietPlan.Tue>();
    private List<consumer.entities.CreateDietPlan.Sun> Sun = new ArrayList<consumer.entities.CreateDietPlan.Sun>();
    private List<consumer.entities.CreateDietPlan.Thu> Thu = new ArrayList<consumer.entities.CreateDietPlan.Thu>();
    private List<consumer.entities.CreateDietPlan.Sat> Sat = new ArrayList<consumer.entities.CreateDietPlan.Sat>();
    private List<consumer.entities.CreateDietPlan.Wed> Wed = new ArrayList<consumer.entities.CreateDietPlan.Wed>();
    private List<consumer.entities.CreateDietPlan.Mon> Mon = new ArrayList<consumer.entities.CreateDietPlan.Mon>();
    private List<Frus> Fri = new ArrayList<Frus>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Tue
     */
    public List<consumer.entities.CreateDietPlan.Tue> getTue() {
        return Tue;
    }

    /**
     * 
     * @param Tue
     *     The Tue
     */
    public void setTue(List<consumer.entities.CreateDietPlan.Tue> Tue) {
        this.Tue = Tue;
    }

    /**
     * 
     * @return
     *     The Sun
     */
    public List<consumer.entities.CreateDietPlan.Sun> getSun() {
        return Sun;
    }

    /**
     * 
     * @param Sun
     *     The Sun
     */
    public void setSun(List<consumer.entities.CreateDietPlan.Sun> Sun) {
        this.Sun = Sun;
    }

    /**
     * 
     * @return
     *     The Thu
     */
    public List<consumer.entities.CreateDietPlan.Thu> getThu() {
        return Thu;
    }

    /**
     * 
     * @param Thu
     *     The Thu
     */
    public void setThu(List<consumer.entities.CreateDietPlan.Thu> Thu) {
        this.Thu = Thu;
    }

    /**
     * 
     * @return
     *     The Sat
     */
    public List<consumer.entities.CreateDietPlan.Sat> getSat() {
        return Sat;
    }

    /**
     * 
     * @param Sat
     *     The Sat
     */
    public void setSat(List<consumer.entities.CreateDietPlan.Sat> Sat) {
        this.Sat = Sat;
    }

    /**
     * 
     * @return
     *     The Wed
     */
    public List<consumer.entities.CreateDietPlan.Wed> getWed() {
        return Wed;
    }

    /**
     * 
     * @param Wed
     *     The Wed
     */
    public void setWed(List<consumer.entities.CreateDietPlan.Wed> Wed) {
        this.Wed = Wed;
    }

    /**
     * 
     * @return
     *     The Mon
     */
    public List<consumer.entities.CreateDietPlan.Mon> getMon() {
        return Mon;
    }

    /**
     * 
     * @param Mon
     *     The Mon
     */
    public void setMon(List<consumer.entities.CreateDietPlan.Mon> Mon) {
        this.Mon = Mon;
    }

    /**
     * 
     * @return
     *     The Fri
     */
    public List<Frus> getFri() {
        return Fri;
    }

    /**
     * 
     * @param Fri
     *     The Fri
     */
    public void setFri(List<Frus> Fri) {
        this.Fri = Fri;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
