package io.github.nvijaykarthik.flexifeature.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Features")
@Getter
@Setter
@NoArgsConstructor
public class FeaturesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String featureName;
    @Column
    private String featureDescription;
    @Column
    private Boolean enabled;
    @Column(nullable = true)
    private String scheduler;
    @Column
    private LocalDateTime modifiedTime;

}
