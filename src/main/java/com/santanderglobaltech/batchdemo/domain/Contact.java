package com.santanderglobaltech.batchdemo.domain;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String bb_id_interaction;
    @NotNull
    private String login_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBb_id_interaction() {
        return bb_id_interaction;
    }

    public void setBb_id_interaction(String bb_id_interaction) {
        this.bb_id_interaction = bb_id_interaction;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", bb_id_interaction='" + bb_id_interaction + '\'' +
                ", login_name='" + login_name + '\'' +
                '}';
    }
}
