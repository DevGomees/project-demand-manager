package com.example.demand.manager.flow.exceptions;

import java.io.Serial;

/**
 * Esta exceção é lançada quando uma ação viola as regras de integridade de dados no sistema.
 * Por exemplo, tentar excluir um recurso que possui dependências associadas.
 *
 * Exemplo de uso:
 * <pre>
 * if (!project.getTasks().isEmpty()) {
 *     throw new DataIntegrityException("Cannot delete a project with existing tasks.");
 * }
 * </pre>
 */
public class DataIntergrityException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DataIntergrityException(String message) {
        super(message);
    }
}
