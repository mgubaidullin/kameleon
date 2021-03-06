package dev.kameleon.model;

import java.util.List;

public class CamelVersion {
    private String name;
    private String suffix;
    private List<String> javaVersions;
    private String defaultJava;
    private String runtimeVersion; // ex. Quarkus version
    private String archetypeGroupId;
    private String archetypeArtifactId;
    private List<CamelComponent> components;

    public CamelVersion() {
    }

    public CamelVersion(String name, String suffix, List<String> javaVersions, String defaultJava, String runtimeVersion,
                        String archetypeGroupId, String archetypeArtifactId, List<CamelComponent> components) {
        this.name = name;
        this.suffix = suffix;
        this.javaVersions = javaVersions;
        this.defaultJava = defaultJava;
        this.runtimeVersion = runtimeVersion;
        this.archetypeGroupId = archetypeGroupId;
        this.archetypeArtifactId = archetypeArtifactId;
        this.components = components;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public List<String> getJavaVersions() {
        return javaVersions;
    }

    public void setJavaVersions(List<String> javaVersions) {
        this.javaVersions = javaVersions;
    }

    public String getDefaultJava() {
        return defaultJava;
    }

    public void setDefaultJava(String defaultJava) {
        this.defaultJava = defaultJava;
    }

    public String getRuntimeVersion() {
        return runtimeVersion;
    }

    public void setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
    }

    public String getArchetypeGroupId() {
        return archetypeGroupId;
    }

    public void setArchetypeGroupId(String archetypeGroupId) {
        this.archetypeGroupId = archetypeGroupId;
    }

    public String getArchetypeArtifactId() {
        return archetypeArtifactId;
    }

    public void setArchetypeArtifactId(String archetypeArtifactId) {
        this.archetypeArtifactId = archetypeArtifactId;
    }

    public List<CamelComponent> getComponents() {
        return components;
    }

    public void setComponents(List<CamelComponent> components) {
        this.components = components;
    }
}
