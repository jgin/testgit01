package org.jasoft.app.platform.domain;

import java.util.Map;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Los menús de la aplicación se manejarán totalmente dinámicos
 * Se podrá elegir que nodos irán en qué carpetas (categorías)
 * Incluso podría ir un listado de instancias de nodos
 * 
 * Cómo estará enlazado con el controlador y la vista?
 * - Entidad y acción?
 * 
 * @author Gin
 */
@Entity
@Table
public class MenuItem extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "parentMenuItemId")
    private MenuItem parentMenuItem;
    
    @Column
    private String title;
    
}
