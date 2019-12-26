package com.yunfei.entity;

import java.io.Serializable;

/**
 * excel
 * @author 
 */
public class Excel implements Serializable {
    private Integer id;

    private String name;

    private String code;

    private Integer auditnum;

    private Integer codeBefore;

    private String provinceName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getAuditnum() {
        return auditnum;
    }

    public void setAuditnum(Integer auditnum) {
        this.auditnum = auditnum;
    }

    public Integer getCodeBefore() {
        return codeBefore;
    }

    public void setCodeBefore(Integer codeBefore) {
        this.codeBefore = codeBefore;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Excel other = (Excel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getAuditnum() == null ? other.getAuditnum() == null : this.getAuditnum().equals(other.getAuditnum()))
            && (this.getCodeBefore() == null ? other.getCodeBefore() == null : this.getCodeBefore().equals(other.getCodeBefore()))
            && (this.getProvinceName() == null ? other.getProvinceName() == null : this.getProvinceName().equals(other.getProvinceName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getAuditnum() == null) ? 0 : getAuditnum().hashCode());
        result = prime * result + ((getCodeBefore() == null) ? 0 : getCodeBefore().hashCode());
        result = prime * result + ((getProvinceName() == null) ? 0 : getProvinceName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", auditnum=").append(auditnum);
        sb.append(", codeBefore=").append(codeBefore);
        sb.append(", provinceName=").append(provinceName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}