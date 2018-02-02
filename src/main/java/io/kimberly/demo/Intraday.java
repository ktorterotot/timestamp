package io.kimberly.demo;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Intraday {

    @JsonProperty("Meta Data")
    private MetaData metaData;

    @JsonProperty("Time Series (1min)")
    private TimeSeries timeSeries;

    public Intraday(){

    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public TimeSeries getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(TimeSeries timeSeries) {
        this.timeSeries = timeSeries;
    }

    @Override
    public String toString() {
        return "Intraday{" +
                "metaData=" + metaData +
                ", timeSeries=" + timeSeries +
                '}';
    }
}
