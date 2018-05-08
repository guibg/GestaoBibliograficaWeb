import java.util.ArrayList;

public class Usuario {
	private String login;
	private String senha;

	static ArrayList<Usuario> usuarios = new ArrayList<>();

	public void inserirUsuario(Usuario usuario) {
		usuarios.add(usuario);
		imprimirUsuario();
	}

	public boolean verificarUsuario(Usuario usuario) {
		for (Usuario usuario2 : usuarios) {
			if (usuario.login.equals(usuario2.login)) {
				return true;
			}
		}
		return false;
	}

	public void imprimirUsuario() {
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.login);
		}
	}

	public String getUsuario() {
		return login;
	}

	public void setUsuario(String usuario) {
		this.login = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	private void validarUsuario(Usuario usuario) {

	}
}
