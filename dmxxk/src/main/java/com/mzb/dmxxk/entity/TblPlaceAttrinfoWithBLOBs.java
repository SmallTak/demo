package com.mzb.dmxxk.entity;

import java.io.Serializable;

/**
 * tbl_place_attrinfo
 * @author 
 */
public class TblPlaceAttrinfoWithBLOBs extends TblPlaceAttrinfo implements Serializable {
    private String placeMeaning;

    private String placeHistory;

    private String comment;

    private String entityProfile;

    private String multimediaInfo;

    private String placeOrigin;

    private String placeOrigin2;

    private static final long serialVersionUID = 1L;

    public String getPlaceMeaning() {
        return placeMeaning;
    }

    public void setPlaceMeaning(String placeMeaning) {
        this.placeMeaning = placeMeaning;
    }

    public String getPlaceHistory() {
        return placeHistory;
    }

    public void setPlaceHistory(String placeHistory) {
        this.placeHistory = placeHistory;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEntityProfile() {
        return entityProfile;
    }

    public void setEntityProfile(String entityProfile) {
        this.entityProfile = entityProfile;
    }

    public String getMultimediaInfo() {
        return multimediaInfo;
    }

    public void setMultimediaInfo(String multimediaInfo) {
        this.multimediaInfo = multimediaInfo;
    }

    public String getPlaceOrigin() {
        return placeOrigin;
    }

    public void setPlaceOrigin(String placeOrigin) {
        this.placeOrigin = placeOrigin;
    }

    public String getPlaceOrigin2() {
        return placeOrigin2;
    }

    public void setPlaceOrigin2(String placeOrigin2) {
        this.placeOrigin2 = placeOrigin2;
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
        TblPlaceAttrinfoWithBLOBs other = (TblPlaceAttrinfoWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlaceCode() == null ? other.getPlaceCode() == null : this.getPlaceCode().equals(other.getPlaceCode()))
            && (this.getStandardName() == null ? other.getStandardName() == null : this.getStandardName().equals(other.getStandardName()))
            && (this.getOriginalName() == null ? other.getOriginalName() == null : this.getOriginalName().equals(other.getOriginalName()))
            && (this.getUseTime() == null ? other.getUseTime() == null : this.getUseTime().equals(other.getUseTime()))
            && (this.getEbBsm() == null ? other.getEbBsm() == null : this.getEbBsm().equals(other.getEbBsm()))
            && (this.getEbXzqhdm() == null ? other.getEbXzqhdm() == null : this.getEbXzqhdm().equals(other.getEbXzqhdm()))
            && (this.getEbPcq() == null ? other.getEbPcq() == null : this.getEbPcq().equals(other.getEbPcq()))
            && (this.getRomanAlphabetSpelling() == null ? other.getRomanAlphabetSpelling() == null : this.getRomanAlphabetSpelling().equals(other.getRomanAlphabetSpelling()))
            && (this.getEthnicMinoritiesWriting() == null ? other.getEthnicMinoritiesWriting() == null : this.getEthnicMinoritiesWriting().equals(other.getEthnicMinoritiesWriting()))
            && (this.getAbbreviations() == null ? other.getAbbreviations() == null : this.getAbbreviations().equals(other.getAbbreviations()))
            && (this.getEastLongitude() == null ? other.getEastLongitude() == null : this.getEastLongitude().equals(other.getEastLongitude()))
            && (this.getNorthLatitude() == null ? other.getNorthLatitude() == null : this.getNorthLatitude().equals(other.getNorthLatitude()))
            && (this.getToEastLongitude() == null ? other.getToEastLongitude() == null : this.getToEastLongitude().equals(other.getToEastLongitude()))
            && (this.getToNorthLatitude() == null ? other.getToNorthLatitude() == null : this.getToNorthLatitude().equals(other.getToNorthLatitude()))
            && (this.getScale() == null ? other.getScale() == null : this.getScale().equals(other.getScale()))
            && (this.getCoordinates() == null ? other.getCoordinates() == null : this.getCoordinates().equals(other.getCoordinates()))
            && (this.getMeasuringMethod() == null ? other.getMeasuringMethod() == null : this.getMeasuringMethod().equals(other.getMeasuringMethod()))
            && (this.getSecretLevel() == null ? other.getSecretLevel() == null : this.getSecretLevel().equals(other.getSecretLevel()))
            && (this.getPlaceType() == null ? other.getPlaceType() == null : this.getPlaceType().equals(other.getPlaceType()))
            && (this.getRegistrationTime() == null ? other.getRegistrationTime() == null : this.getRegistrationTime().equals(other.getRegistrationTime()))
            && (this.getRegistrant() == null ? other.getRegistrant() == null : this.getRegistrant().equals(other.getRegistrant()))
            && (this.getRegistrantUnit() == null ? other.getRegistrantUnit() == null : this.getRegistrantUnit().equals(other.getRegistrantUnit()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getPlaceOriginalSound() == null ? other.getPlaceOriginalSound() == null : this.getPlaceOriginalSound().equals(other.getPlaceOriginalSound()))
            && (this.getPlaceLanguage() == null ? other.getPlaceLanguage() == null : this.getPlaceLanguage().equals(other.getPlaceLanguage()))
            && (this.getFigureNo() == null ? other.getFigureNo() == null : this.getFigureNo().equals(other.getFigureNo()))
            && (this.getEstablishmentYear() == null ? other.getEstablishmentYear() == null : this.getEstablishmentYear().equals(other.getEstablishmentYear()))
            && (this.getAbolishYear() == null ? other.getAbolishYear() == null : this.getAbolishYear().equals(other.getAbolishYear()))
            && (this.getRomeSpelling() == null ? other.getRomeSpelling() == null : this.getRomeSpelling().equals(other.getRomeSpelling()))
            && (this.getPlacementCensusStatus() == null ? other.getPlacementCensusStatus() == null : this.getPlacementCensusStatus().equals(other.getPlacementCensusStatus()))
            && (this.getChineseCharacterWriting() == null ? other.getChineseCharacterWriting() == null : this.getChineseCharacterWriting().equals(other.getChineseCharacterWriting()))
            && (this.getMandarinChinesePronunciation() == null ? other.getMandarinChinesePronunciation() == null : this.getMandarinChinesePronunciation().equals(other.getMandarinChinesePronunciation()))
            && (this.getDataSources() == null ? other.getDataSources() == null : this.getDataSources().equals(other.getDataSources()))
            && (this.getFormerName() == null ? other.getFormerName() == null : this.getFormerName().equals(other.getFormerName()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCnAdministrativeAreaId() == null ? other.getCnAdministrativeAreaId() == null : this.getCnAdministrativeAreaId().equals(other.getCnAdministrativeAreaId()))
            && (this.getDeclareTime() == null ? other.getDeclareTime() == null : this.getDeclareTime().equals(other.getDeclareTime()))
            && (this.getDeclareUnit() == null ? other.getDeclareUnit() == null : this.getDeclareUnit().equals(other.getDeclareUnit()))
            && (this.getDeclareUnitAddress() == null ? other.getDeclareUnitAddress() == null : this.getDeclareUnitAddress().equals(other.getDeclareUnitAddress()))
            && (this.getDeclareStatus() == null ? other.getDeclareStatus() == null : this.getDeclareStatus().equals(other.getDeclareStatus()))
            && (this.getDeclarer() == null ? other.getDeclarer() == null : this.getDeclarer().equals(other.getDeclarer()))
            && (this.getDeclareType() == null ? other.getDeclareType() == null : this.getDeclareType().equals(other.getDeclareType()))
            && (this.getDeclarerPhone() == null ? other.getDeclarerPhone() == null : this.getDeclarerPhone().equals(other.getDeclarerPhone()))
            && (this.getDeclarePostcode() == null ? other.getDeclarePostcode() == null : this.getDeclarePostcode().equals(other.getDeclarePostcode()))
            && (this.getProcessInstanceId() == null ? other.getProcessInstanceId() == null : this.getProcessInstanceId().equals(other.getProcessInstanceId()))
            && (this.getIsShow() == null ? other.getIsShow() == null : this.getIsShow().equals(other.getIsShow()))
            && (this.getGeometry() == null ? other.getGeometry() == null : this.getGeometry().equals(other.getGeometry()))
            && (this.getRegistranter() == null ? other.getRegistranter() == null : this.getRegistranter().equals(other.getRegistranter()))
            && (this.getAdministrativeAreaName() == null ? other.getAdministrativeAreaName() == null : this.getAdministrativeAreaName().equals(other.getAdministrativeAreaName()))
            && (this.getMark() == null ? other.getMark() == null : this.getMark().equals(other.getMark()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getPlaceTypeCode() == null ? other.getPlaceTypeCode() == null : this.getPlaceTypeCode().equals(other.getPlaceTypeCode()))
            && (this.getProvinceName() == null ? other.getProvinceName() == null : this.getProvinceName().equals(other.getProvinceName()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getAreaName() == null ? other.getAreaName() == null : this.getAreaName().equals(other.getAreaName()))
            && (this.getPinyin() == null ? other.getPinyin() == null : this.getPinyin().equals(other.getPinyin()))
            && (this.getAttachmentInformation() == null ? other.getAttachmentInformation() == null : this.getAttachmentInformation().equals(other.getAttachmentInformation()))
            && (this.getFileUrl() == null ? other.getFileUrl() == null : this.getFileUrl().equals(other.getFileUrl()))
            && (this.getLon() == null ? other.getLon() == null : this.getLon().equals(other.getLon()))
            && (this.getToLon() == null ? other.getToLon() == null : this.getToLon().equals(other.getToLon()))
            && (this.getLat() == null ? other.getLat() == null : this.getLat().equals(other.getLat()))
            && (this.getToLat() == null ? other.getToLat() == null : this.getToLat().equals(other.getToLat()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getOldTime() == null ? other.getOldTime() == null : this.getOldTime().equals(other.getOldTime()))
            && (this.getMultimediaName() == null ? other.getMultimediaName() == null : this.getMultimediaName().equals(other.getMultimediaName()))
            && (this.getSoundName() == null ? other.getSoundName() == null : this.getSoundName().equals(other.getSoundName()))
            && (this.getPlaceMeaning() == null ? other.getPlaceMeaning() == null : this.getPlaceMeaning().equals(other.getPlaceMeaning()))
            && (this.getPlaceHistory() == null ? other.getPlaceHistory() == null : this.getPlaceHistory().equals(other.getPlaceHistory()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getEntityProfile() == null ? other.getEntityProfile() == null : this.getEntityProfile().equals(other.getEntityProfile()))
            && (this.getMultimediaInfo() == null ? other.getMultimediaInfo() == null : this.getMultimediaInfo().equals(other.getMultimediaInfo()))
            && (this.getPlaceOrigin() == null ? other.getPlaceOrigin() == null : this.getPlaceOrigin().equals(other.getPlaceOrigin()))
            && (this.getPlaceOrigin2() == null ? other.getPlaceOrigin2() == null : this.getPlaceOrigin2().equals(other.getPlaceOrigin2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlaceCode() == null) ? 0 : getPlaceCode().hashCode());
        result = prime * result + ((getStandardName() == null) ? 0 : getStandardName().hashCode());
        result = prime * result + ((getOriginalName() == null) ? 0 : getOriginalName().hashCode());
        result = prime * result + ((getUseTime() == null) ? 0 : getUseTime().hashCode());
        result = prime * result + ((getEbBsm() == null) ? 0 : getEbBsm().hashCode());
        result = prime * result + ((getEbXzqhdm() == null) ? 0 : getEbXzqhdm().hashCode());
        result = prime * result + ((getEbPcq() == null) ? 0 : getEbPcq().hashCode());
        result = prime * result + ((getRomanAlphabetSpelling() == null) ? 0 : getRomanAlphabetSpelling().hashCode());
        result = prime * result + ((getEthnicMinoritiesWriting() == null) ? 0 : getEthnicMinoritiesWriting().hashCode());
        result = prime * result + ((getAbbreviations() == null) ? 0 : getAbbreviations().hashCode());
        result = prime * result + ((getEastLongitude() == null) ? 0 : getEastLongitude().hashCode());
        result = prime * result + ((getNorthLatitude() == null) ? 0 : getNorthLatitude().hashCode());
        result = prime * result + ((getToEastLongitude() == null) ? 0 : getToEastLongitude().hashCode());
        result = prime * result + ((getToNorthLatitude() == null) ? 0 : getToNorthLatitude().hashCode());
        result = prime * result + ((getScale() == null) ? 0 : getScale().hashCode());
        result = prime * result + ((getCoordinates() == null) ? 0 : getCoordinates().hashCode());
        result = prime * result + ((getMeasuringMethod() == null) ? 0 : getMeasuringMethod().hashCode());
        result = prime * result + ((getSecretLevel() == null) ? 0 : getSecretLevel().hashCode());
        result = prime * result + ((getPlaceType() == null) ? 0 : getPlaceType().hashCode());
        result = prime * result + ((getRegistrationTime() == null) ? 0 : getRegistrationTime().hashCode());
        result = prime * result + ((getRegistrant() == null) ? 0 : getRegistrant().hashCode());
        result = prime * result + ((getRegistrantUnit() == null) ? 0 : getRegistrantUnit().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getPlaceOriginalSound() == null) ? 0 : getPlaceOriginalSound().hashCode());
        result = prime * result + ((getPlaceLanguage() == null) ? 0 : getPlaceLanguage().hashCode());
        result = prime * result + ((getFigureNo() == null) ? 0 : getFigureNo().hashCode());
        result = prime * result + ((getEstablishmentYear() == null) ? 0 : getEstablishmentYear().hashCode());
        result = prime * result + ((getAbolishYear() == null) ? 0 : getAbolishYear().hashCode());
        result = prime * result + ((getRomeSpelling() == null) ? 0 : getRomeSpelling().hashCode());
        result = prime * result + ((getPlacementCensusStatus() == null) ? 0 : getPlacementCensusStatus().hashCode());
        result = prime * result + ((getChineseCharacterWriting() == null) ? 0 : getChineseCharacterWriting().hashCode());
        result = prime * result + ((getMandarinChinesePronunciation() == null) ? 0 : getMandarinChinesePronunciation().hashCode());
        result = prime * result + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        result = prime * result + ((getFormerName() == null) ? 0 : getFormerName().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCnAdministrativeAreaId() == null) ? 0 : getCnAdministrativeAreaId().hashCode());
        result = prime * result + ((getDeclareTime() == null) ? 0 : getDeclareTime().hashCode());
        result = prime * result + ((getDeclareUnit() == null) ? 0 : getDeclareUnit().hashCode());
        result = prime * result + ((getDeclareUnitAddress() == null) ? 0 : getDeclareUnitAddress().hashCode());
        result = prime * result + ((getDeclareStatus() == null) ? 0 : getDeclareStatus().hashCode());
        result = prime * result + ((getDeclarer() == null) ? 0 : getDeclarer().hashCode());
        result = prime * result + ((getDeclareType() == null) ? 0 : getDeclareType().hashCode());
        result = prime * result + ((getDeclarerPhone() == null) ? 0 : getDeclarerPhone().hashCode());
        result = prime * result + ((getDeclarePostcode() == null) ? 0 : getDeclarePostcode().hashCode());
        result = prime * result + ((getProcessInstanceId() == null) ? 0 : getProcessInstanceId().hashCode());
        result = prime * result + ((getIsShow() == null) ? 0 : getIsShow().hashCode());
        result = prime * result + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        result = prime * result + ((getRegistranter() == null) ? 0 : getRegistranter().hashCode());
        result = prime * result + ((getAdministrativeAreaName() == null) ? 0 : getAdministrativeAreaName().hashCode());
        result = prime * result + ((getMark() == null) ? 0 : getMark().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getPlaceTypeCode() == null) ? 0 : getPlaceTypeCode().hashCode());
        result = prime * result + ((getProvinceName() == null) ? 0 : getProvinceName().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getAreaName() == null) ? 0 : getAreaName().hashCode());
        result = prime * result + ((getPinyin() == null) ? 0 : getPinyin().hashCode());
        result = prime * result + ((getAttachmentInformation() == null) ? 0 : getAttachmentInformation().hashCode());
        result = prime * result + ((getFileUrl() == null) ? 0 : getFileUrl().hashCode());
        result = prime * result + ((getLon() == null) ? 0 : getLon().hashCode());
        result = prime * result + ((getToLon() == null) ? 0 : getToLon().hashCode());
        result = prime * result + ((getLat() == null) ? 0 : getLat().hashCode());
        result = prime * result + ((getToLat() == null) ? 0 : getToLat().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getOldTime() == null) ? 0 : getOldTime().hashCode());
        result = prime * result + ((getMultimediaName() == null) ? 0 : getMultimediaName().hashCode());
        result = prime * result + ((getSoundName() == null) ? 0 : getSoundName().hashCode());
        result = prime * result + ((getPlaceMeaning() == null) ? 0 : getPlaceMeaning().hashCode());
        result = prime * result + ((getPlaceHistory() == null) ? 0 : getPlaceHistory().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getEntityProfile() == null) ? 0 : getEntityProfile().hashCode());
        result = prime * result + ((getMultimediaInfo() == null) ? 0 : getMultimediaInfo().hashCode());
        result = prime * result + ((getPlaceOrigin() == null) ? 0 : getPlaceOrigin().hashCode());
        result = prime * result + ((getPlaceOrigin2() == null) ? 0 : getPlaceOrigin2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", placeMeaning=").append(placeMeaning);
        sb.append(", placeHistory=").append(placeHistory);
        sb.append(", comment=").append(comment);
        sb.append(", entityProfile=").append(entityProfile);
        sb.append(", multimediaInfo=").append(multimediaInfo);
        sb.append(", placeOrigin=").append(placeOrigin);
        sb.append(", placeOrigin2=").append(placeOrigin2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}