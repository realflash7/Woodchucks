package woodchucks.impl.objects.operation;

import woodchucks.api.objects.common.ID;
import woodchucks.api.objects.operation.Operation;
import woodchucks.api.objects.operation.OperationType;

/**
 * <<Details>>
 *
 * @author reaflash
 * @date 2019-10-26
 */
public class OperationImpl implements Operation {

    private ID id;
    private String name;
    private OperationType operationType;

    public OperationImpl(ID id, String name, OperationType operationType) {
        this.id = id;
        this.name = name;
        this.operationType = operationType;
    }

    public ID getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public OperationType getOperationType() {
        return operationType;
    }
}
