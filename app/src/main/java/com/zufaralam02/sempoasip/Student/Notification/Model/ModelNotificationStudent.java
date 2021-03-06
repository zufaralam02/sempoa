
package com.zufaralam02.sempoasip.Student.Notification.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class ModelNotificationStudent {

    @SerializedName("result")
    private List<ResultNotificationStudent> mResultNotificationStudent;
    @SerializedName("status_code")
    private Long mStatusCode;
    @SerializedName("status_message")
    private String mStatusMessage;

    public List<ResultNotificationStudent> getResult() {
        return mResultNotificationStudent;
    }

    public void setResult(List<ResultNotificationStudent> resultNotificationStudent) {
        mResultNotificationStudent = resultNotificationStudent;
    }

    public Long getStatusCode() {
        return mStatusCode;
    }

    public void setStatusCode(Long statusCode) {
        mStatusCode = statusCode;
    }

    public String getStatusMessage() {
        return mStatusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        mStatusMessage = statusMessage;
    }

}
