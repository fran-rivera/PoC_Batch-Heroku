package com.santanderglobaltech.batchdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Interaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bb_id_chat;
    private String bb_id_interaction;
    private LocalDateTime logindate;
    private String login_name;
    private String first_name;
    private String last_name;
    private int outbound_characters;
    private String company_name;
    private String email_address;
    private String corporate_email_address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBb_id_chat() {
        return bb_id_chat;
    }

    public void setBb_id_chat(String bb_id_chat) {
        this.bb_id_chat = bb_id_chat;
    }

    public String getBb_id_interaction() {
        return bb_id_interaction;
    }

    public void setBb_id_interaction(String bb_id_interaction) {
        this.bb_id_interaction = bb_id_interaction;
    }

    public LocalDateTime getLogindate() {
        return logindate;
    }

    public void setLogindate(LocalDateTime logindate) {
        this.logindate = logindate;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getOutbound_characters() {
        return outbound_characters;
    }

    public void setOutbound_characters(int outbound_characters) {
        this.outbound_characters = outbound_characters;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getCorporate_email_address() {
        return corporate_email_address;
    }

    public void setCorporate_email_address(String corporate_email_address) {
        this.corporate_email_address = corporate_email_address;
    }

    @Override
    public String toString() {
        return "Interaction{" +
                "id=" + id +
                ", bb_id_chat='" + bb_id_chat + '\'' +
                ", bb_id_interaction='" + bb_id_interaction + '\'' +
                ", logindate=" + logindate +
                ", login_name='" + login_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", outbound_characters=" + outbound_characters +
                ", company_name='" + company_name + '\'' +
                ", email_address='" + email_address + '\'' +
                ", corporate_email_address='" + corporate_email_address + '\'' +
                '}';
    }
}
