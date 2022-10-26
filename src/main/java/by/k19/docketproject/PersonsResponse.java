package by.k19.docketproject;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class PersonsResponse {
    private Iterable<Person> persons;

    public PersonsResponse(Iterable<Person> persons) {
        this.persons = persons;
    }
}
