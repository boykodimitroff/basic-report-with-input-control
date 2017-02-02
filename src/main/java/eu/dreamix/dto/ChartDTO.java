package eu.dreamix.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bdimitrov on 1/22/17.
 */
public class ChartDTO {

    private List<String> xAxis;
    private List<Double> yAxis;

    public List<String> getxAxis() {
        return xAxis;
    }

    public List<Double> getyAxis() {
        return yAxis;
    }

    public void addXaxisValue(String value) {
        if(xAxis == null) {
            xAxis = new ArrayList<>();
            xAxis.add(value);
        } else {
            xAxis.add(value);
        }
    }

    public void addYaxisValue(Double value) {
        if(yAxis == null) {
            yAxis = new ArrayList<>();
            yAxis.add(value);
        } else {
            yAxis.add(value);
        }
    }
}
