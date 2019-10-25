package woodchucks.api.objects.operation;

import woodchucks.api.objects.common.ID;


/**
 * <<Details>>
 *
 * @author reaflash
 * @date 2019-10-26
 */
public interface Operation {

    public ID getID();
    public String getName();
    public OperationType getOperationType();
}
