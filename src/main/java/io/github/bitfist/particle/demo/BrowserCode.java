package io.github.bitfist.particle.demo;

import io.github.bitfist.particle.function.java.BrowserMapping;
import org.springframework.stereotype.Component;

@Component
@BrowserMapping
public class BrowserCode {

    private final JavaScript javaScript;

    private int number = 0;

    public BrowserCode(JavaScript javaScript) {
        this.javaScript = javaScript;
    }

    @BrowserMapping
    public int increment() {
        number++;
        return number;
    }

    @BrowserMapping
    public void makeRed() {
        javaScript.makeBodyRed();
    }
}
