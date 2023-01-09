package io.spectralpowered.injector.mappings;

public class MapperConfig {

    public static MapperConfig create() {
        return new MapperConfig();
    }


    protected boolean fillSuperMappings;
    protected boolean remapTransformer;

    private MapperConfig() {
    }

    public MapperConfig fillSuperMappings(boolean fillSuperMappings) {
        this.fillSuperMappings = fillSuperMappings;
        return this;
    }

    public MapperConfig remapTransformer(boolean remapTransformer) {
        this.remapTransformer = remapTransformer;
        return this;
    }

}
