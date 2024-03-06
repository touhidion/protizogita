package io.github.touhidion.protizogita.dto;

import io.github.touhidion.protizogita.enums.ResponseType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ApiResponse {
    private ResponseType responseType;
    private String message;
    private Object result;
    private Object error;
    private Integer code;

}
