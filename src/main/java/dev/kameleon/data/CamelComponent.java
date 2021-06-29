package dev.kameleon.data;

import java.util.List;

public class CamelComponent {
    private String component;
    private String name;
    private String type;
    private String description;
    private String supportLevel;
    private List<String> labels;

    public CamelComponent() {
    }

    public CamelComponent(String component, String name, String type, String description, String supportLevel, List<String> labels) {
        this.component = component;
        this.name = name;
        this.type = type;
        this.description = description;
        this.labels = labels;
        this.supportLevel = supportLevel;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public String getSupportLevel() {
        return supportLevel;
    }

    public void setSupportLevel(String supportLevel) {
        this.supportLevel = supportLevel;
    }

    @Override
    public String toString() {
        return "CamelComponent{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", labels=" + labels +
                '}';
    }
}