package br.com.caio;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by caioaraujo on 14/12/16.
 */
@Data
@Entity
public class User implements Serializable {

    private @Id @GeneratedValue Integer id;

    private String user;

    private String password;

}
