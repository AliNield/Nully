
public class Nully {

public static Object[] checkNotNulls(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] == null) {
                throw new NullPointerException("Null found at position: " + i);
            }
        }
        return objects;
    }
}
