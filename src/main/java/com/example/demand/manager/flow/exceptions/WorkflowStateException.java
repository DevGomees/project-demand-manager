package com.example.demand.manager.flow.exceptions;

import java.io.Serial;

/**
 * Esta exceção é lançada quando ocorre uma violação no fluxo de estado de um processo.
 * Por exemplo, mover uma tarefa para um estado inválido ou fora de sequência.
 *
 * Exemplo de uso:
 * <pre>
 * if (task.getState() == TaskState.CLOSED) {
 *     throw new WorkflowStateException("Cannot reopen a task that is closed.");
 * }
 * </pre>
 */
public class WorkflowStateException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public WorkflowStateException(String message) {
        super(message);
    }
}
