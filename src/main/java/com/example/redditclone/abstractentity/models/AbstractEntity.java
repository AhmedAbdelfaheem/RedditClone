package com.example.redditclone.abstractentity.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Table(name = "abstract_entity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractEntity implements Serializable {

    @Id
    @GenericGenerator(
            name = "sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "user_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @GeneratedValue(
            generator = "sequential-identity",
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    private Long id;

    @JsonIgnore
    private LocalDateTime createdAt;

    @JsonIgnore
    private LocalDateTime updatedAt;

    @JsonIgnore
    private LocalDateTime deletedAt;

}
