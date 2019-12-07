
public class Lutador {
private String nome;
private String nacionalidade;
private int idade;
private float altura;
private float peso;
private String categoria;
private int vitorias;
private int derrotas;
private int empates;

    //    ==== Métodos ====
    public void apresentar(){
        System.out.println("  =========APRESENTAÇÃO=========");
        System.out.println("Lutador " + this.getNome());
        System.out.println("Vindo de :" + this.getNacionalidade());
        System.out.println(" de " + this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura ");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates() + " vezes");
        System.out.println("--------------------------------");

    }

    public void status(){
        System.out.println("---------------------------");
        System.out.println(this.getNome());
        System.out.println(this.getAltura());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println("---------------------------");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    //              ======= Métodos Especiais =======

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.altura = al;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if ( this.getPeso() < 52.2f ) {
            this.categoria = "Inválido";
        } else if ( this.getPeso() <= 70.3f ) {
            this.categoria = "Leve";
        } else if ( this.getPeso() <= 83.9 ) {
            this.categoria = "Médio";
        } else if ( this.getPeso() <= 120.2 ) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}

