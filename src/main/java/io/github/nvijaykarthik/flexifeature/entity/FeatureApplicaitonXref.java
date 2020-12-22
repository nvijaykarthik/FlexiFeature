package io.github.nvijaykarthik.flexifeature.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class FeatureApplicaitonXref {
    
    @Column
    private String featureName;
    @Column 
    private String app;
    @Column
    private String appType;// Group or App
}
