package com.example.demand.manager.flow.exceptions;

import java.io.Serial;

/**
 * Esta exceção é lançada quando uma ação não permitida é executada no sistema.
 * Por exemplo, tentar criar uma tarefa para um projeto já encerrado.
 *
 * Exemplo de uso:
 * <pre>
 * if (project.isClosed()) {
 *     throw new ActionNotAllowedException("Cannot add tasks to a closed project.");
 * }
 * </pre>
 */
public class ActionNotAllowedException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    public ActionNotAllowedException(String message) {
        super(message);
    }
}
