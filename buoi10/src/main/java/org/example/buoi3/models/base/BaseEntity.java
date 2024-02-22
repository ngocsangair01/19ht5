package org.example.buoi3.models.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("create_by")
    private Long createBy ;

    @JsonProperty("create_at")
    private LocalDateTime createAt = LocalDateTime.now();

    @JsonProperty("update_by")
    private Long updateBy ;

    @JsonProperty("update_at")
    private LocalDateTime updateAt = LocalDateTime.now();

    @JsonProperty("status")
    private Boolean status = true;

    public BaseEntity() {
    }

    public BaseEntity(Long id, Long createBy, LocalDateTime createAt, Long updateBy, LocalDateTime updateAt, Boolean status) {
        this.id = id;
        this.createBy = createBy;
        this.createAt = createAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
