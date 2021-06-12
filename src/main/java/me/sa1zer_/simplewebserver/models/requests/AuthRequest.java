package me.sa1zer_.simplewebserver.models.requests;

import me.sa1zer_.simplewebserver.models.responses.AuthResponse;
import me.sa1zer_.simplewebserver.models.responses.Response;

public class AuthRequest extends Request {

    private String userName;
    private String password;

    public AuthRequest(String name, String password) {
        this.userName = name;
        this.password = password;
    }

    @Override
    public Response requestDo() {
        return new AuthResponse(Response.Status.SUCCESS);
    }
}
