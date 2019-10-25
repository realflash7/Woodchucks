package woodchucks.api.objects.operation;


import woodchucks.api.objects.standard.Person;

import java.util.List;

/**
 * <<Details>>
 *
 * @author reaflash
 * @date 2019-10-26
 */
public interface StakeHolder {

    List<Person> getMembers();
    StakeHolderRole getRole();
}
