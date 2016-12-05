package Model;

public class Cliente {
    
    private String nome;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String celular;
    private String facebook;
    private boolean whats;
    private boolean pessoafisica;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public boolean isWhats() {
        return whats;
    }

    public void setWhats(boolean whats) {
        this.whats = whats;
    }

    public boolean isPessoafisica() {
        return pessoafisica;
    }

    public void setPessoafisica(boolean pessoafisica) {
        this.pessoafisica = pessoafisica;
    }
    
}
