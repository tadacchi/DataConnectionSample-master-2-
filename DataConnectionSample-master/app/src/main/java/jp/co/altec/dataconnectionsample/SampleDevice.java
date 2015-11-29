package jp.co.altec.dataconnectionsample;

import android.util.Log;

/**
 * Created by tokue on 2015/09/13.
 */
public class SampleDevice {
    private String deviceName;
    private String deviceIpAddress;

    public String getDeviceIpAddress() {
        return deviceIpAddress;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String remoteDeviceInfo) {
        deviceName = remoteDeviceInfo;
    }

    public void setDeviceIpAddress(String remoteDeviceInfo) {
        Log.d("IPアドレス:",remoteDeviceInfo);
        deviceIpAddress = remoteDeviceInfo;
    }

    @Override
    public String toString() {
        return "SampleDevice { " +
                                "device name : " + deviceName +
                                " device Ip Address : " + deviceIpAddress +
                             "}";
    }
}
