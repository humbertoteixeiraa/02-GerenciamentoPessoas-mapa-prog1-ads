
package mapa;

public abstract class Pessoa {//CLASSE ABSTRATA
    
    //ATRIBUTOS
    protected String nome;
    protected String documento;
    
    //MÉTODO ABSTRATO
    public abstract void exibeDados();
    
    //MÉTODOS GETTERS e SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
}