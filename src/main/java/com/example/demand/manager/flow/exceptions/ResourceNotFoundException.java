package com.example.demand.manager.flow.exceptions;

import lombok.Getter;
import java.io.Serial;

/**
 * Esta exceção é lançada quando um recurso esperado não é encontrado no sistema.
 * O construtor oferece suporte para incluir informações detalhadas como o nome do recurso, 
 * o campo utilizado e o valor associado.
 * 
 * Exemplo de uso:
 * <pre>
 * if (!userRepository.existsById(userId)) {
 *     throw new ResourceNotFoundException("User", "id", userId);
 * }
 * </pre>
 * 
 * @author 
 */
@Getter
public class ResourceNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    private final String resourceName;
    private final String fieldName;
    private final Object fieldValue;

    public ResourceNotFoundException(String message) {
        super(message);
        this.resourceName = null;
        this.fieldName = null;
        this.fieldValue = null;
    }

    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("Resource '%s' not found with '%s' '%s'", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
        this.resourceName = null;
        this.fieldName = null;
        this.fieldValue = null;
    }
}
