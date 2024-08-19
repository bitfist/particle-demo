package io.github.bitfist.particle.demo;

import io.github.bitfist.particle.spring.window.ParticleWindowURLProvider;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ParticleURLProvider implements ParticleWindowURLProvider {

    @Override
    public String getURL() {
        String path = new File("src/main/resources/index.html").getAbsolutePath();

        if (!path.startsWith("/")) {
            path = "/" + path;
        }

        path = "file://" + path;

        return path;
    }
}
