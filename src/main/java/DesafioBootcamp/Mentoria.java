package DesafioBootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public double calcularXp() {
        return 30.0;
    }

    public Mentoria() {
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
        return " Mentoria: { titulo = '" + resultado + "', descrição = '" + this.getDescricao() + "', data = " + this.data + " }";
    }
}
