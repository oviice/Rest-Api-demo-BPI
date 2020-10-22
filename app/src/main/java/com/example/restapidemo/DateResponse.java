package com.example.restapidemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DateResponse {
    @SerializedName("$id")
    @Expose
    private String $id;
    @SerializedName("currentDateTime")
    @Expose
    private String currentDateTime;
    @SerializedName("utcOffset")
    @Expose
    private String utcOffset;
    @SerializedName("isDayLightSavingsTime")
    @Expose
    private Boolean isDayLightSavingsTime;
    @SerializedName("dayOfTheWeek")
    @Expose
    private String dayOfTheWeek;
    @SerializedName("timeZoneName")
    @Expose
    private String timeZoneName;
    @SerializedName("currentFileTime")
    @Expose
    private String currentFileTime;
    @SerializedName("ordinalDate")
    @Expose
    private String ordinalDate;
    @SerializedName("serviceResponse")
    @Expose
    private Object serviceResponse;

    public String get$id() {
        return $id;
    }

    public void set$id(String $id) {
        this.$id = $id;
    }

    public String getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(String currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    public Boolean getIsDayLightSavingsTime() {
        return isDayLightSavingsTime;
    }

    public void setIsDayLightSavingsTime(Boolean isDayLightSavingsTime) {
        this.isDayLightSavingsTime = isDayLightSavingsTime;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getTimeZoneName() {
        return timeZoneName;
    }

    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    public String getCurrentFileTime() {
        return currentFileTime;
    }

    public void setCurrentFileTime(String currentFileTime) {
        this.currentFileTime = currentFileTime;
    }

    public String getOrdinalDate() {
        return ordinalDate;
    }

    public void setOrdinalDate(String ordinalDate) {
        this.ordinalDate = ordinalDate;
    }

    public Object getServiceResponse() {
        return serviceResponse;
    }

    public void setServiceResponse(Object serviceResponse) {
        this.serviceResponse = serviceResponse;
    }
}
