package com.esfe.Asistencia.Utilidades;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.esfe.Asistencia")
@EnableJpaRepositories(basePackages = "com.esfe.Asistencia.Repositorios")
@EntityScan(basePackages = "com.esfe.Asistencia.Modelos")
public class AsistenciaApplication {
    public static void main(String[] args) {
        SpringApplication.run(AsistenciaApplication.class, args);
    }
}

