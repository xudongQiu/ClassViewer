package org.glavo.viewer;

import lombok.val;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ServiceLoader;

public abstract class FileType<T extends FileComponent> {
    public static List<FileType> fileTypes() {
        return Collections.unmodifiableList(fileTypes);
    }

    private static final ArrayList<FileType> fileTypes = new ArrayList<>();

    static {
        for (val type : ServiceLoader.load(FileType.class)) {
            fileTypes.add(type);
        }
    }
}
