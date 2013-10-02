package org.jasoft.app.platform.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Vistas que podrán tener los nodos para ser mostradas ante las opciones de menu
 * y en acciones personalizadas (botones quizá)
 * @author Gin
 */
@Entity
@Table
public class View extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    
}
