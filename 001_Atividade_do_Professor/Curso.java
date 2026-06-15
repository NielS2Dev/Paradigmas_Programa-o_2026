public class Curso{

    private String nome;
    private int codigo;
    private int anoAprovacao;

    // Aqui coloquei o construtor como está na minha atividade
    // "A classe só poderá ser instanciada caso os atributos acima sejam informados"

    public Curso(String nome, int codigo, int anoAprovacao){
        this.nome = nome;
        this.codigo = codigo;
        this.anoAprovacao = anoAprovacao;
    }

    // Agora vou fazer os metódos para ler os atributos fora dessa classe.
    //Os get seria para retornar o valores
    public String getNome(){
        return this.nome;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public int GetAnoAprovacao(){
        return this.anoAprovacao;
    }

    // Aqui vou usar os setters para definir o valor dos atributos.
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setAnoAprovacao(int anoAprovacao) {
        this.anoAprovacao = anoAprovacao;
    }
}

