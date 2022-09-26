import Calculadora.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

public class CalculadoraTest {
    double numero1 = 10;
    double numero2 = 5;

    @Test
    public void testeSoma() {
        //Given
        Adicao soma = new Adicao(numero1, numero2);
        //When
        soma.calcular();
        //Then
        Assert.assertFalse(soma.calcular() == 10);
        Assert.assertTrue(soma.calcular() == 15);
        Assert.assertNotEquals(15, soma.calcular());
        Assert.assertEquals(soma.calcular(),15,0.01);
        Assert.assertThat(soma.toString(), is("Soma de " + numero1 + " + " + numero2 + " = " + 15.0));
        Assert.assertThat(soma.toString(), is(not("Soma de " + numero1 + " + " + numero2 + " = " + 10.0)));
        Assert.assertNotNull("o valor não é nulo", soma.calcular());

    }
    @Test
    public void testeSubtracao() {
        //Given
        Subtracao subtracao = new Subtracao(numero1,numero2);
        //When
        subtracao.calcular();
        //Then
        Assert.assertFalse(subtracao.calcular() == 10);
        Assert.assertTrue(subtracao.calcular() == 5);
        Assert.assertNotEquals(10,subtracao.calcular());
        Assert.assertEquals(subtracao.calcular(),5,0.01);
        Assert.assertThat(subtracao.toString(),is("Subtração de " + numero1 + " - " + numero2 + " = " + 5.0));
        Assert.assertThat(subtracao.toString(),is(not("Subtração de " + numero1 + " - " + numero2 + " = " + 10.0)));
        Assert.assertNotNull("o valor não é nulo", subtracao.calcular());
    }

    @Test
    public void testeMultiplicacao() {
        //Given
        Multiplicacao multiplicacao = new Multiplicacao(numero1,numero2);
        //When
        multiplicacao.calcular();
        //Then
        Assert.assertFalse(multiplicacao.calcular() == 10);
        Assert.assertTrue(multiplicacao.calcular() == 50);
        Assert.assertNotEquals(10,multiplicacao.calcular());
        Assert.assertEquals(multiplicacao.calcular(),50,0.01);
        Assert.assertThat(multiplicacao.toString(),is("Multiplicação de " + numero1 + " * " + numero2 + " = " + 50.0));
        Assert.assertThat(multiplicacao.toString(),is(not("Multiplicação de " + numero1 + " * " + numero2 + " = " + 10.0)));
        Assert.assertNotNull("o valor não é nulo", multiplicacao.calcular());
    }

    @Test
    public void testeDivisao() {
        //Given
        Divisao divisao = new Divisao(numero1,numero2);
        //When
        divisao.calcular();
        //Then
        Assert.assertFalse(divisao.calcular() == 10);
        Assert.assertTrue(divisao.calcular() == 2);
        Assert.assertNotEquals(10,divisao.calcular());
        Assert.assertEquals(divisao.calcular(),2,0.01);
        Assert.assertThat(divisao.toString(),is("Divisão de  " + numero1 + " / " + numero2 + " = " + 2.0));
        Assert.assertThat(divisao.toString(),is(not("Divisão de " + numero1 + " / " + numero2 + " = " + 10.0)));
        Assert.assertNotNull("o valor não é nulo", divisao.calcular());
    }


    @Test
    public void testeHistoricoCalc() {
        //Given
        HistoricoCalc historicoCalc = new HistoricoCalc();
        List<OperaçãoMatematica> operacoes = new ArrayList<>();
        Adicao soma = new Adicao(numero1,numero2);
        //When
        soma.calcular();
        historicoCalc.execute(soma);
        // Then
        Assert.assertEquals(historicoCalc.getOperacoes().toString(), "[Soma de 10.0 + 5.0 = 15.0]");
        Assert.assertTrue(historicoCalc.getOperacoes() == historicoCalc.getOperacoes());

    }

}
