package br.com.alurafood.pagamentos.dto;

import br.com.alurafood.pagamentos.model.ItemDoPedido;
import br.com.alurafood.pagamentos.model.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class PagamentoDto {

    private Long id;

    private BigDecimal valor;

    private String nome;

    private String numero;

    private LocalDateTime expiracao;

    private String codigo;

    private Status status;

    private Long pedidoId;

    private Long formaDePagamentoId;

    private List<ItemDoPedido> itens;
}
