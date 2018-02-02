package io.kimberly.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Time;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)

public class TimeStamp extends TimeSeries{


    @JsonProperty("1. open")
    private String open;
    @JsonProperty("2. high")
    private String high;
    @JsonProperty("3. low")
    private String low;
    @JsonProperty("4. close")
    private String close;
    @JsonProperty("5. volume")
    private String volume;

    public TimeStamp(){

    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }






    @Override
    public String toString() {
        return "TimeStamp{" +
                "open='" + open + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", close='" + close + '\'' +
                ", volume='" + volume + '\'' +
                '}';
    }
}
