package br.com.roninfo.builder;

public class MainBuilder {

    public static void main(String...args) {
	Usuario usuario = new Usuario.UsuarioBuilder("Roni Palacio","11122233344")
			.setDataNascimento("31/08/1984").setBairro("Pimentas").setCidade("Guarulhos").setEstado("SP").setInformacoes("Sem informações")
			.build();
	System.out.print("Usuario contruido "+usuario.getNome());
    }
}
