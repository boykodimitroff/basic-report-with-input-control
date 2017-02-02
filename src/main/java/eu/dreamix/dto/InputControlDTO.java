package eu.dreamix.dto;

/**
 * Created by bdimitrov on 1/22/17.
 */
public class InputControlDTO {

    private String text;
    private Integer value;

    public InputControlDTO(String text, Integer value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public Integer getValue() {
        return value;
    }
}
