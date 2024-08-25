package io.github.bitfist.particle.demo;

import io.github.bitfist.particle.spring.ParticleApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        ParticleApplication.run(DemoApplication.class, args);
    }

}


