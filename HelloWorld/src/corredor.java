
public class corredor {
	 private String nome;
	    private String genero;
	    private String endereco;
	    private String telefone;
	    private String cpf;
	    Pessoa(String nome, String genero, String endereco, String telefone,String cpf){
	        this.nome = nome;
	        this.genero = genero;
	        this.endereco = endereco;
	        this.telefone = telefone;
	        this.cpf = cpf;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public String getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

}
