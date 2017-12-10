package statistics;

import java.util.ArrayList;
import java.util.List;
import statistics.matcher.*;

public class QueryBuilder {

    Matcher matcher;
    private List<Matcher> list;
    Matcher[] matchers;

    public QueryBuilder() {
        list = new ArrayList<Matcher>();
    }

    public Matcher build() {
        this.matchers = new Matcher[list.size()];
        this.matchers = list.toArray(matchers);
        list.clear();
        return new And(matchers);
    }

    QueryBuilder playsIn(String team) {
        this.list.add(new PlaysIn(team));
        return this;
    }

    QueryBuilder hasFewerThan(int value, String category) {
        this.list.add(new HasFewerThan(value, category));
        return this;
    }

    QueryBuilder hasAtLeast(int value, String category) {
        this.list.add(new HasAtLeast(value, category));
        return this;
    }

    QueryBuilder oneOf(Matcher m1, Matcher m2) {
        this.list.add(new Or(m1, m2));
        return this;
    }

}
