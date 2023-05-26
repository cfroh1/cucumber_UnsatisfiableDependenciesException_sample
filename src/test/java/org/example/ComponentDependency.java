package org.example;

import org.picocontainer.Disposable;

public class ComponentDependency implements Disposable {

    private final PojoDependency pojoDependency;

    public ComponentDependency(final PojoDependency pojoDependency) {
        this.pojoDependency = pojoDependency;
    }

    @Override
    public void dispose() {

    }
}
