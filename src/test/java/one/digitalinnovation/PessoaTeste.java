package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("jessica", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(23, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("jessica", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDate.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());

    }
}
