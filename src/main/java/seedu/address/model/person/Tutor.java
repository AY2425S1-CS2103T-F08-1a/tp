package seedu.address.model.person;

import seedu.address.model.tag.Tag;

import java.util.Set;

public class Tutor extends Person {
    public Tutor(Name name, Phone phone, Email email, Address address, Set<Tag> tags) {
        super(name, phone, email, address, tags);
    }


}
