import java.util.ArrayList;
import java.util.List;

public class ClosableStateReference implements AutoCloseable{
    static List<String> strings = new ArrayList<>();

    private boolean isClosed;

    public boolean isClosed() {
        return isClosed;
    }

    public static List<String> getStrings() {
        return strings;
    }

    public void close() {
        strings.add(this.toString());
        isClosed = true;
    }
}
