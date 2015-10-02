package br.com.roninfo.builder;

public class Usuario {

    private final String nome;
    private final String cpf;
    private final String dataNascimento;
    private final String bairro;
    private final String cidade;
    private final String estado;
    private final String informacoes;

    public Usuario(UsuarioBuilder usuarioBuilder) {
	this.nome = usuarioBuilder.nome;
	this.cpf = usuarioBuilder.cpf;
	this.dataNascimento = usuarioBuilder.dataNascimento;
	this.bairro = usuarioBuilder.bairro;
	this.cidade = usuarioBuilder.cidade;
	this.estado = usuarioBuilder.estado;
	this.informacoes = usuarioBuilder.informacoes;
    }

    public static class UsuarioBuilder {

	private String nome;
	private String cpf;
	private String dataNascimento;
	private String bairro;
	private String cidade;
	private String estado;
	private String informacoes;

	public UsuarioBuilder(String nome, String cpf) {
	    this.nome = nome;
	    this.cpf = cpf;
	}

	public UsuarioBuilder setNome(String nome) {
	    this.nome = nome;
	    return this;
	}

	public UsuarioBuilder setCpf(String cpf) {
	    this.cpf = cpf;
	    return this;
	}

	public UsuarioBuilder setDataNascimento(String dataNascimento) {
	    this.dataNascimento = dataNascimento;
	    return this;
	}

	public UsuarioBuilder setBairro(String bairro) {
	    this.bairro = bairro;
	    return this;
	}

	public UsuarioBuilder setCidade(String cidade) {
	    this.cidade = cidade;
	    return this;
	}

	public UsuarioBuilder setEstado(String estado) {
	    this.estado = estado;
	    return this;
	}

	public UsuarioBuilder setInformacoes(String informacoes) {
	    this.informacoes = informacoes;
	    return this;
	}

	public Usuario builde() {
	    return new Usuario(this);
	}
    }
}
