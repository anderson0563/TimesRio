package rio.times.repositories;

import javax.persistence.*;

@Entity
@Table(name="Times")
public class Times {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int indice;
    @Column(name="nome")
    private String nome;
    @Column(name="ano")
    private int ano;

    public Times() {
    }

    public Times(int indice, String nome, int ano) {
        this.indice = indice;
        this.nome = nome;
        this.ano = ano;
    }
    public Times(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
