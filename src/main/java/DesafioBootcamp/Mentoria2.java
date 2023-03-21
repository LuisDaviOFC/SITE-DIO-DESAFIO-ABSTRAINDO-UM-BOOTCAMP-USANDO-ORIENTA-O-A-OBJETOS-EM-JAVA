package DesafioBootcamp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria2 extends Conteudo {

    //MODIFICAÇÃO DA DATA
    LocalDate data = LocalDate.now();
    DateTimeFormatter dataModificado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dataFormatado = data.format(dataModificado);
    //MODIFICAÇÃO DA DATA

    public double calcularXp() {
        return 30.0;
    }

    public Mentoria2() {
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //FORMATAÇÃO DAS INFORMAÇÕES NA TELA
    public String toString() {
        String resultado = this.getTitulo();
        return " Mentoria: { titulo = '" + resultado + "', descrição = '" + this.getDescricao() + ", Data: " + dataFormatado;
    }
}
