package io.spectralpowered.injector.mappings.impl;

import io.spectralpowered.injector.TransformerManager;
import io.spectralpowered.injector.mappings.AMapper;
import io.spectralpowered.injector.mappings.MapperConfig;

/**
 * Only used internally when no {@link AMapper} has been specified in {@link TransformerManager}
 */
public class VoidMapper extends AMapper {

    public VoidMapper() {
        super(MapperConfig.create());
    }

    @Override
    protected void init() {
    }

}
