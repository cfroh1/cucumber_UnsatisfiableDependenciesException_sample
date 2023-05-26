package org.example;

import io.cucumber.java.en.Given;

public class MyStepdefs {

    private final ComponentDependency componentDependency;

    public MyStepdefs(final ComponentDependency componentDependency) {
        this.componentDependency = componentDependency;
    }

    @Given("Some step")
    public void someStep() {
    }
}
