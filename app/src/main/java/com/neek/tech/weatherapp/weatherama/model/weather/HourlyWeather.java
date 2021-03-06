package com.neek.tech.weatherapp.weatherama.model.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Hourly weather model.
 */
public class HourlyWeather implements Serializable {

    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("data")
    @Expose
    private List<HourlyData> data = new ArrayList<>();

    /**
     *
     * @return
     * The summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     *
     * @param summary
     * The summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     *
     * @return
     * The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     *
     * @param icon
     * The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     *
     * @return
     * The data
     */
    public List<HourlyData> getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(List<HourlyData> data) {
        this.data = data;
    }


    private class HourlyData implements Serializable {

        @SerializedName("time")
        private Integer time;

        @SerializedName("summary")
        private String summary;

        @SerializedName("icon")
        private String icon;

        @SerializedName("precipIntensity")
        private Double precipIntensity;

        @SerializedName("precipProbability")
        private Double precipProbability;

        @SerializedName("temperature")
        private Double temperature;

        @SerializedName("apparentTemperature")
        private Double apparentTemperature;

        @SerializedName("dewPoint")
        private Double dewPoint;

        @SerializedName("humidity")
        private Double humidity;

        @SerializedName("windSpeed")
        private Double windSpeed;

        @SerializedName("windBearing")
        private Integer windBearing;

        @SerializedName("visibility")
        private double visibility;

        @SerializedName("cloudCover")
        private Double cloudCover;

        @SerializedName("pressure")
        private Double pressure;

        @SerializedName("ozone")
        private Double ozone;

        @SerializedName("precipType")
        private String precipType;

        /**
         *
         * @return
         * The time
         */
        public Integer getTime() {
            return time;
        }

        /**
         *
         * @param time
         * The time
         */
        public void setTime(Integer time) {
            this.time = time;
        }

        /**
         *
         * @return
         * The summary
         */
        public String getSummary() {
            return summary;
        }

        /**
         *
         * @param summary
         * The summary
         */
        public void setSummary(String summary) {
            this.summary = summary;
        }

        /**
         *
         * @return
         * The icon
         */
        public String getIcon() {
            return icon;
        }

        /**
         *
         * @param icon
         * The icon
         */
        public void setIcon(String icon) {
            this.icon = icon;
        }

        /**
         *
         * @return
         * The precipIntensity
         */
        public Double getPrecipIntensity() {
            return precipIntensity;
        }

        /**
         *
         * @param precipIntensity
         * The precipIntensity
         */
        public void setPrecipIntensity(Double precipIntensity) {
            this.precipIntensity = precipIntensity;
        }

        /**
         *
         * @return
         * The precipProbability
         */
        public Double getPrecipProbability() {
            return precipProbability;
        }

        /**
         *
         * @param precipProbability
         * The precipProbability
         */
        public void setPrecipProbability(Double precipProbability) {
            this.precipProbability = precipProbability;
        }

        /**
         *
         * @return
         * The temperature
         */
        public Double getTemperature() {
            return temperature;
        }

        /**
         *
         * @param temperature
         * The temperature
         */
        public void setTemperature(Double temperature) {
            this.temperature = temperature;
        }

        /**
         *
         * @return
         * The apparentTemperature
         */
        public Double getApparentTemperature() {
            return apparentTemperature;
        }

        /**
         *
         * @param apparentTemperature
         * The apparentTemperature
         */
        public void setApparentTemperature(Double apparentTemperature) {
            this.apparentTemperature = apparentTemperature;
        }

        /**
         *
         * @return
         * The dewPoint
         */
        public Double getDewPoint() {
            return dewPoint;
        }

        /**
         *
         * @param dewPoint
         * The dewPoint
         */
        public void setDewPoint(Double dewPoint) {
            this.dewPoint = dewPoint;
        }

        /**
         *
         * @return
         * The humidity
         */
        public Double getHumidity() {
            return humidity;
        }

        /**
         *
         * @param humidity
         * The humidity
         */
        public void setHumidity(Double humidity) {
            this.humidity = humidity;
        }

        /**
         *
         * @return
         * The windSpeed
         */
        public Double getWindSpeed() {
            return windSpeed;
        }

        /**
         *
         * @param windSpeed
         * The windSpeed
         */
        public void setWindSpeed(Double windSpeed) {
            this.windSpeed = windSpeed;
        }

        /**
         *
         * @return
         * The windBearing
         */
        public Integer getWindBearing() {
            return windBearing;
        }

        /**
         *
         * @param windBearing
         * The windBearing
         */
        public void setWindBearing(Integer windBearing) {
            this.windBearing = windBearing;
        }

        /**
         *
         * @return
         * The visibility
         */
        public double getVisibility() {
            return visibility;
        }

        /**
         *
         * @param visibility
         * The visibility
         */
        public void setVisibility(double visibility) {
            this.visibility = visibility;
        }

        /**
         *
         * @return
         * The cloudCover
         */
        public Double getCloudCover() {
            return cloudCover;
        }

        /**
         *
         * @param cloudCover
         * The cloudCover
         */
        public void setCloudCover(Double cloudCover) {
            this.cloudCover = cloudCover;
        }

        /**
         *
         * @return
         * The pressure
         */
        public Double getPressure() {
            return pressure;
        }

        /**
         *
         * @param pressure
         * The pressure
         */
        public void setPressure(Double pressure) {
            this.pressure = pressure;
        }

        /**
         *
         * @return
         * The ozone
         */
        public Double getOzone() {
            return ozone;
        }

        /**
         *
         * @param ozone
         * The ozone
         */
        public void setOzone(Double ozone) {
            this.ozone = ozone;
        }

        /**
         *
         * @return
         * The precipType
         */
        public String getPrecipType() {
            return precipType;
        }

        /**
         *
         * @param precipType
         * The precipType
         */
        public void setPrecipType(String precipType) {
            this.precipType = precipType;
        }

    }
}
