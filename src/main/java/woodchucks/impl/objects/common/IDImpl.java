package woodchucks.impl.objects.common;

import woodchucks.api.objects.common.ID;

/**
 * <<Details>>
 *
 * @author reaflash
 * @date 2019-10-26
 */
public class IDImpl implements ID {

    private String id;

    public IDImpl(String id) {
        this.id = id;
    }
    
    public String get() {
        return id;
    }
}
