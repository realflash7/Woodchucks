package woodchucks.api.objects.operation;

import java.util.Date;

/**
 * <<Details>>
 *
 * @author reaflash
 * @date 2019-10-26
 */
public interface StakeHolderRole {

    String getName();
    Date fromDate();
    Date toDate();
    Boolean getIsRoleCurrentlyActive();
}
