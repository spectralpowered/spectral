package kyle.mappings.impl;

import kyle.mappings.AMapper;
import kyle.mappings.MapperConfig;
import kyle.utils.mappings.MapRemapper;

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
