package io.github.nvijaykarthik.flexifeature.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeatureApplicaitonXref {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String featureName;
    @Column 
    private String app;
    @Column
    private String appType;// Group or App

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    @Override
    public String toString() {
        return "FeatureApplicaitonXref [app=" + app + ", appType=" + appType + ", featureName=" + featureName + ", id="
                + id + "]";
    }
}
