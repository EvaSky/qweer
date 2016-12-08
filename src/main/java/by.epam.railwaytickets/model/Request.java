package by.epam.railwaytickets.model;

import java.util.Objects;

/**
 * Created by Volha_Shakhrai on 12/7/2016.
 */
public class Request {

    private int id;
    private User sender;
    private User receiver;
    private RequestStatus status;

    public Request() {
    }

    public Request(int id, User sender, User receiver, RequestStatus status) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
    }

    public Request(User sender, User receiver, RequestStatus status) {
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Request request = (Request) o;
        return id == request.id &&
                Objects.equals(sender, request.sender) &&
                Objects.equals(receiver, request.receiver) &&
                status == request.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sender, receiver, status);
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", status=" + status +
                '}';
    }
}
