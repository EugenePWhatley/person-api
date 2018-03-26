package hello.Message;

import hello.Model.Name;

public class NameMessage {
    private String first;
    private String last;

    public Name getName() {
        return new Name(first, last);
    }
}
