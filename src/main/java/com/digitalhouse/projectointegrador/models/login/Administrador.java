package com.digitalhouse.projectointegrador.models.login;

import javax.persistence.*;

@Entity
@Table
public class Administrador extends Usuario{

    public Administrador() {
    }

    public Administrador(String usuario, String password) {
        super(usuario, password);
    }

}
