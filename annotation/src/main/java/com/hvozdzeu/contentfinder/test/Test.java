package com.hvozdzeu.contentfinder.test;

import com.hvozdzeu.contentfinder.annotation.FinderMany;
import com.hvozdzeu.contentfinder.enums.Priority;

public class Test {

    @FinderMany(
            paths = {
                    "path_1",
                    "path_2",
                    "path_3"
            },
            priority = Priority.LOW
    )
    private String[] paths;

    public String[] getPaths() {
        return paths;
    }

    public void setPaths(String[] paths) {
        this.paths = paths;
    }

}
