package org.glavo.viewer.util;

import lombok.experimental.UtilityClass;
import lombok.val;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

@UtilityClass
public final class CollectionUtils {
    public <T> List<T> toList(Iterator<T> iterator) {
        val list = new ArrayList<T>();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }
}
