package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 2/12/2024
 * @project : demo
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private long id;
    private long publicId;
    private String name;
    private String address;
    private double salary;

    private boolean activeState;

    /*---------------------------*/
    private Blob fileName;
    private Blob resourceUrl;
    private Blob directory;
    private Blob hash;
    /*---------------------------*/


}
