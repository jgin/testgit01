/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jasoft.app.platform.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author gin
 */
@Entity
@Table
public class NodeAttribute implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    @NotNull
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "nodeId")
    private Node ownerNode;
    
    @ManyToOne
    @JoinColumn(name = "baseNodeId")
    private Node baseNode;
    
    @Column
    @Enumerated(EnumType.STRING)
    private Type attributeType;
    
    
    public enum Type {
        STRING,
        INTEGER,
        FLOAT,
        DATE,
        TIME,
        DATETIME
    }
    
    
}
