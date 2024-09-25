package br.com.antonio.orcamento.modules;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "Lançamento")
public class Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate data_lancamento;
    private String tipo_lancamento;
    private BigDecimal valor_lancamento;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(LocalDate data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public String getTipo_lancamento() {
        return tipo_lancamento;
    }

    public void setTipo_lancamento(String tipo_lancamento) {
        this.tipo_lancamento = tipo_lancamento;
    }

    public BigDecimal getValor_lancamento() {
        return valor_lancamento;
    }

    public void setValor_lancamento(BigDecimal valor_lancamento) {
        this.valor_lancamento = valor_lancamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lancamento that = (Lancamento) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
