package io.adorable.utils

import org.dozer.Mapper

class AbstractConverter {

    public static <T, U> List<U> map(final Mapper mapper, final Collection<T> source, final Class<U> destType) {
        final List<U> dest = new ArrayList();
        if (source!=null) {
            for (T element : source) {
                dest.add(mapper.map(element, destType));
            }
        }
        return dest;
    }

}
