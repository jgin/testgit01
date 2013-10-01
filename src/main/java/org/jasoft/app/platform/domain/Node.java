/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jasoft.app.platform.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author gin
 */
@Entity
@Table
public class Node extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    @NotNull
    private String name;

    @ManyToOne
    @JoinColumn(name = "baseNodeId")
    private Node baseNode;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "baseNode")
    private List<Node> childNodes;
    
    /**
     * Define los atributos de este nodo
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ownerNode")
    private List<NodeAttribute> attributes;
    
    /**
     * Relaciona todos los atributos de cualquier nodo que heredan de este nodo.
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "baseNode")
    private List<NodeAttribute> childAttributes;

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

    /**
     * @return the childNodes
     */
    public List<Node> getChildNodes() {
        return childNodes;
    }

    /**
     * @param childNodes the childNodes to set
     */
    public void setChildNodes(List<Node> childNodes) {
        this.childNodes = childNodes;
    }

    /**
     * @return the attributes
     */
    public List<NodeAttribute> getAttributes() {
        return attributes;
    }

    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(List<NodeAttribute> attributes) {
        this.attributes = attributes;
    }

    /**
     * @return the childAttributes
     */
    public List<NodeAttribute> getChildAttributes() {
        return childAttributes;
    }

    /**
     * @param childAttributes the childAttributes to set
     */
    public void setChildAttributes(List<NodeAttribute> childAttributes) {
        this.childAttributes = childAttributes;
    }
    

}
