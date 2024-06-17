package aula1.exemplo.Exemplo2.model;

public class Usuario {
    private Integer id;
    private String login;
    private String senha;


    public Usuario(){}
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public Usuario(Integer id, String login, String senha){
        this.id = id;
        this.login = login;
        this.senha = senha;
    }

    @Override
    public String toString(){
        return "Usuario{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
    
    public Integer getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public String getSenha(){
        return senha;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
