/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jasoft.app.platform.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author mario
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
    
    @Column
    @JsonIgnore
    private Boolean active;
    
    @Column
    @JsonIgnore
    private Timestamp createdAt;
    
    @Column
    @JsonIgnore
    private Long createdByUser;
    
    @Column
    @JsonIgnore
    private String createdByIp;
    
    @Column
    @JsonIgnore
    private Timestamp updatedAt;
    
    @Column
    @JsonIgnore
    private Long updatedByUser;
    
    @Column
    @JsonIgnore
    private String updatedByIp;
    
    @Column
    @JsonIgnore
    private Timestamp deletedAt;
    
    @Column
    @JsonIgnore
    private Long deletedByUser;
    
    @Column
    @JsonIgnore
    private String deletedByIp;

    public BaseEntity() {
        this.active=true;
    }

    
    
    /**
     * @return the deleted
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * @param active the deleted to set
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * @return the createdAt
     */
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the createdByUser
     */
    public Long getCreatedByUser() {
        return createdByUser;
    }

    /**
     * @param createdByUser the createdByUser to set
     */
    public void setCreatedByUser(Long createdByUser) {
        this.createdByUser = createdByUser;
    }

    /**
     * @return the createdByIp
     */
    public String getCreatedByIp() {
        return createdByIp;
    }

    /**
     * @param createdByIp the createdByIp to set
     */
    public void setCreatedByIp(String createdByIp) {
        this.createdByIp = createdByIp;
    }

    /**
     * @return the updatedAt
     */
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return the updatedByUser
     */
    public Long getUpdatedByUser() {
        return updatedByUser;
    }

    /**
     * @param updatedByUser the updatedByUser to set
     */
    public void setUpdatedByUser(Long updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

    /**
     * @return the updatedByIp
     */
    public String getUpdatedByIp() {
        return updatedByIp;
    }

    /**
     * @param updatedByIp the updatedByIp to set
     */
    public void setUpdatedByIp(String updatedByIp) {
        this.updatedByIp = updatedByIp;
    }

    /**
     * @return the deletedAt
     */
    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    /**
     * @param deletedAt the deletedAt to set
     */
    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * @return the deletedByUser
     */
    public Long getDeletedByUser() {
        return deletedByUser;
    }

    /**
     * @param deletedByUser the deletedByUser to set
     */
    public void setDeletedByUser(Long deletedByUser) {
        this.deletedByUser = deletedByUser;
    }

    /**
     * @return the deletedByIp
     */
    public String getDeletedByIp() {
        return deletedByIp;
    }

    /**
     * @param deletedByIp the deletedByIp to set
     */
    public void setDeletedByIp(String deletedByIp) {
        this.deletedByIp = deletedByIp;
    }
    
}
