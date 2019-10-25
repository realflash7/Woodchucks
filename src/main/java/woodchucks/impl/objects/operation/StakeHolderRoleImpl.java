package woodchucks.impl.objects.operation;

import woodchucks.api.objects.operation.StakeHolderRole;
import woodchucks.api.objects.standard.Person;

import java.util.Date;
import java.util.List;

/**
 * <<Details>>
 *
 * @author reaflash
 * @date 2019-10-26
 */
public class StakeHolderRoleImpl implements StakeHolderRole {

    private String name;
    private Date fromDate;
    private Date toDate;
    private Boolean isRoleCurrentlyActive;


    public StakeHolderRoleImpl(String name, Date fromDate, Date toDate, Boolean isRoleCurrentlyActive) {
        this.name = name;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.isRoleCurrentlyActive = isRoleCurrentlyActive;
    }

    public String getName() {
        return name;
    }
    public Date fromDate() {
        return fromDate;
    }
    public Date toDate() {
        return toDate;
    }
    public Boolean getIsRoleCurrentlyActive() {
        return isRoleCurrentlyActive;
    }
}
