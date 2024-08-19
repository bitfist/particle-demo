package io.github.bitfist.particle.demo;

import io.github.bitfist.particle.spring.ParticleApplication;
import io.github.bitfist.particle.spring.function.javascript.JavaScriptFileAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ParticleApplication.start(DemoApplication.class, args);
    }

}


