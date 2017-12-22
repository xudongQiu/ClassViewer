package org.glavo.viewer.nui;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Command {

    @Getter
    @Setter
    private List<String> args;

    public Command(String... args) {
        this.args = Collections.unmodifiableList(Arrays.asList(args));
    }
}
