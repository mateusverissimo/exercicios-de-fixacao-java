package collections;

import java.util.Objects;

public class Usuario {

    int id;
    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
