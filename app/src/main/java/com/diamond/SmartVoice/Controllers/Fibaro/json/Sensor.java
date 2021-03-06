package com.diamond.SmartVoice.Controllers.Fibaro.json;

import com.google.gson.annotations.SerializedName;

/**
 * @author Dmitriy Ponomarev
 */
public class Sensor {
    @SerializedName("temperature")
    private int temperature;

    @SerializedName("humidity")
    private int humidity;

    @SerializedName("light")
    private int light;
}
