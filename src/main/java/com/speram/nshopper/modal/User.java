package com.speram.nshopper.modal;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate = new Date();
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate= new Date();
}
