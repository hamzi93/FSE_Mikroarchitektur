package at.itKolleg;

public class Credentials {

    private String host;
    private String pwd;
    private String user;

    public Credentials(String host, String pwd, String user) {
        this.host = host;
        this.pwd = pwd;
        this.user = user;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
