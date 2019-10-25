package woodchucks.impl.objects.operation;

import woodchucks.api.objects.operation.StakeHolder;
import woodchucks.api.objects.operation.StakeHolderRole;
import woodchucks.api.objects.standard.Person;

import java.util.List;

/**
 * <<Details>>
 *
 * @author reaflash
 * @date 2019-10-26
 */
public class StakeHolderImpl implements StakeHolder {

    private List<Person> members;
    private StakeHolderRole role;

    public StakeHolderImpl(List<Person> members, StakeHolderRole role) {
        this.members = members;
        this.role = role;
    }

    public List<Person> getMembers() {
        return members;
    }

    public StakeHolderRole getRole() {
        return role;

    }
}
