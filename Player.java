public class Player {
	String nick;
	String genero;
	String raca;
	String dif;
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setDif(String dif) {
		this.dif = dif;
	}
	public String getRaca() {
		return raca;
	}
	public String getGenero () {
		return genero;
	}
	public String getNick() {
		return nick;
	}
	public String getDif() {
		return dif;
	}

	public void imprimirdados() {
		System.out.println("-DADOS DO PERSONAGEM-");
		System.out.println("Nick: "+getNick());
		System.out.println("Raça: "+getRaca());
		System.out.println("Genero: "+getGenero());
		System.out.println("Dificuldade: "+getDif());
	}
}