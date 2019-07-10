package calc;

public class inArray {
    /**
     * Является ли объект x элементом массива array
     *
     * @param x
     * @param array
     * @param <T>
     * @param <V>
     * @return
     */
    public static <T, V> boolean isIn(T x, V[] array) {
        for (V element : array) {
            if (x.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
