public class Carta {
    private String nome;
    private String codigo;

    public Carta(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }


    @Override
    public String toString(){
        return "[" + codigo +"]" + " |- " + nome + " -|\n";
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    
}
