import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

    List<Pessoa> listaPessoas =  new ArrayList<Pessoa>();

    public BancoDeDados() {
        listaPessoas.add(new Pessoa(listaPessoas.size() + 1, "thiago"));
        listaPessoas.add(new Pessoa(listaPessoas.size() + 1, "joao"));
        listaPessoas.add(new Pessoa(listaPessoas.size() + 1, "thialison"));
    }

    public List<Pessoa> obterTodos() {
        return listaPessoas;
    }

    public Pessoa obterPorId(Integer id) {
        var pessoa = listaPessoas.stream().filter(p -> {
            return p.getId().equals(id);
        }).toList().get(0);
        return pessoa;
    }

    public List<Pessoa> obterPorNome(String nome) {
        var lista = listaPessoas.stream().filter(p -> {
            var nomeMenusculo = nome.toLowerCase();
            var nomePessoaMenusculo = p.getNome().toLowerCase();
            return nomePessoaMenusculo.contains(nomeMenusculo);
        }).toList();

        return lista;
    }
}
