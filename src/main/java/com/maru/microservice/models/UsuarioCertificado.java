package com.maru.microservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@AllArgsConstructor
@Data
@RedisHash("UsuarioCertificado")
public class UsuarioCertificado implements Serializable {
    public enum Estado {
        CERTIFICADO, NO_CERTIFICADO
    }

    private Integer id;
    private String certificado;
    private Estado estado;
}
