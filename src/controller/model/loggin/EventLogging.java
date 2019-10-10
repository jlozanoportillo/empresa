package controller.model.loggin;

import java.io.Serializable;

public class EventLogging implements Serializable{

  private String dateRegister;
  private String eventSource;
  private Object payload;

  public EventLogging() {
    super();
  }

  public EventLogging(String dateRegister, String eventSource, Object payload) {
    super();
    this.dateRegister = dateRegister;
    this.eventSource = eventSource;
    this.payload = payload;
  }

  public String getDateRegister() {
    return dateRegister;
  }

  public void setDateRegister(String dateRegister) {
    this.dateRegister = dateRegister;
  }

  public String getEventSource() {
    return eventSource;
  }

  public void setEventSource(String eventSource) {
    this.eventSource = eventSource;
  }

  public Object getPayload() {
    return payload;
  }

  public void setPayload(Object payload) {
    this.payload = payload;
  }

}
