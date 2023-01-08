package io.spectralpowered.injector.mappings.impl;

import io.spectralpowered.injector.InjectionManager;
import io.spectralpowered.injector.mappings.MapperConfig;
import io.spectralpowered.injector.mappings.AMapper;

/**
 * Only used internally when no {@link AMapper} has been specified in {@link InjectionManager}
 */
public class VoidMapper extends AMapper {

    public VoidMapper() {
        super(MapperConfig.create());
    }

    @Override
    protected void init() {
    }

}
