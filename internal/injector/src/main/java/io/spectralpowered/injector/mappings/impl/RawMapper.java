package io.spectralpowered.injector.mappings.impl;

import io.spectralpowered.injector.mappings.MapperConfig;
import io.spectralpowered.injector.mappings.AMapper;
import io.spectralpowered.injector.utils.mappings.MapRemapper;

public class RawMapper extends AMapper {

    private final MapRemapper remapper;

    public RawMapper(final MapperConfig config, final MapRemapper remapper) {
        super(config);
        this.remapper = remapper;
    }

    @Override
    protected void init() throws Throwable {
        super.remapper.copy(this.remapper);
    }

}
