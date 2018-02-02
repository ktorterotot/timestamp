package io.kimberly.demo;



import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;


import java.util.LinkedHashMap;
import java.util.Map;




public class TimeSeries{

    @JsonIgnore
    private Map<String, TimeStamp> timeStampMap = new LinkedHashMap<>();

    @JsonAnySetter
    public void setTimeStampMap(String x, TimeStamp t) {
        timeStampMap.put(x, t);
    }

    @JsonAnyGetter
    public Map<String, TimeStamp> getTimeStamp() {
        return timeStampMap;
    }







    @Override
    public String toString() {
        return "TimeStamp{" +
                "timeStamp=" + timeStampMap +
                '}';
    }
}
