package woodchucks.api.objects.operation;

import woodchucks.api.objects.common.ID;


/**
 * <<Details>>
 *
 * @author reaflash
 * @date 2019-10-26
 */
public interface Operation {

    ID getID();
    String getName();
    OperationType getOperationType();
}
