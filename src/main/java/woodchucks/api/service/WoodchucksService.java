package woodchucks.api.service;

import woodchucks.api.objects.common.ID;
import woodchucks.api.objects.operation.Operation;

/**
 * <<Details>>
 *
 * @author reaflash
 * @date 2019-10-26
 */
public interface WoodchucksService {

    public Operation getOperation(ID id);
}
