package com.example.demand.manager.flow.exceptions;

import java.io.Serial;

/**
 * Esta exceção é lançada quando uma ação é proibida devido à falta de permissões
 * ou credenciais insuficientes do usuário.
 *
 * Exemplo de uso:
 * <pre>
 * if (!user.hasPermission("EDIT_PROJECT")) {
 *     throw new AuthorizationException("User does not have permission to edit this project.");
 * }
 * </pre>
 */
public class AuthorizationException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public AuthorizationException(String message) {
        super(message);
    }
}
