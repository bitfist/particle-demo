package io.github.bitfist.particle.demo;

import io.github.bitfist.particle.function.javascript.JavaScriptCode;
import io.github.bitfist.particle.function.javascript.JavaScriptFile;

@JavaScriptFile
public interface JavaScript {

    @JavaScriptCode(
            // language=JavaScript
            """
            document.body.style.backgroundColor = "red";
            """
    )
    void makeBodyRed();

}
