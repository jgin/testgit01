/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jasoft.app.platform.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    
    
    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ownerNode
     */
    public Node getOwnerNode() {
        return ownerNode;
    }

    /**
     * @param ownerNode the ownerNode to set
     */
    public void setOwnerNode(Node ownerNode) {
        this.ownerNode = ownerNode;
    }

    /**
     * @return the baseNode
     */
    public Node getBaseNode() {
        return baseNode;
    }

    /**
     * @param baseNode the baseNode to set
     */
    public void setBaseNode(Node baseNode) {
        this.baseNode = baseNode;
    }
    
}
