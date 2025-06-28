package main.java.model;

import java.util.Objects;

public class Client {
    private int id;
    private String name;
    private String email;
    private static int nrClientId=0;

    public Client() {
        this.id = ++nrClientId;
    }

    public Client(String name, String email) {
        this.id = ++nrClientId;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Client c = (Client) super.clone();
        c.id = ++nrClientId;
        c.name = this.name;
        c.email = this.email;
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(email, client.email);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
