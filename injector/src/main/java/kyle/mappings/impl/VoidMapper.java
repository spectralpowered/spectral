package kyle.mappings.impl;

import kyle.mappings.AMapper;
import kyle.mappings.MapperConfig;

/**
 * Only used internally when no {@link AMapper} has been specified in {@link kyle.TransformerManager}
 */
public class VoidMapper extends AMapper {

    public VoidMapper() {
        super(MapperConfig.create());
    }

    @Override
    protected void init() {
    }

}
