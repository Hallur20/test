
import java.util.HashMap;

public class Lager {

    public HashMap<String, MoreStuff> makeMap() {
        HashMap<String, MoreStuff> hm = new HashMap<>();
        hm.put("1", new MoreStuff("Hallur", 26, "hvn15@hotmail.com"));
        hm.put("2", new MoreStuff("Karl", 23, "karl@mail.com"));
        hm.put("3", new MoreStuff("blabla",2390, "bla@mail.com"));
        return hm;
    }
}
