package me.sa1zer_.simplewebserver.models.responses;

public abstract class Response {

    public Status status;

    public Response(Status status) {
        this.status = status;
    }


    public enum Status {

        SUCCESS("success"), ERROR("error");

        private String name;

        Status(String name) {
            this.name = name;
        }
    }
}

