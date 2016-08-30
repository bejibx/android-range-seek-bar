package org.florescu.android.util;

public class EnumUtil {

    /**
     * Restore {@code Enum} from given int number. This is based on enum ordinal. If nothing matches
     * given ordinal, default value will returned.
     *
     * @param enumClass    {@code Enum} class for which to restore value
     * @param i            integer value to restore from.
     * @param defaultValue value which will be returned if there are no actual {@code Enum} value
     *                     for given integer.
     *
     * @return {@code Enum} value representing given integer.
     */
    public static <E extends Enum<E>> E fromInt(Class<E> enumClass, int i, E defaultValue) {
        E[] values = enumClass.getEnumConstants();
        if (values.length > 0 && i >= 0 && i < values.length) {
            return values[i];
        }
        return defaultValue;
    }

    private EnumUtil() {
    }
}
