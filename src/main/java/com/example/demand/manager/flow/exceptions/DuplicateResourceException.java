package com.example.demand.manager.flow.exceptions;

import java.io.Serial;

/**
 * Esta exceção é lançada quando ocorre a tentativa de criar ou registrar um recurso que já existe.
 *
 * Exemplo de uso:
 * <pre>
 * if (projectRepository.existsByName("Project X")) {
 *     throw new DuplicateResourceException("A project with this name already exists.");
 * }
 * </pre>
 */
public class DuplicateResourceException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DuplicateResourceException(String message) {
        super(message);
    }
}
