package me.sa1zer_.simplewebserver.models.requests;

import me.sa1zer_.simplewebserver.models.responses.RegistrationResponse;
import me.sa1zer_.simplewebserver.models.responses.Response;

public class RegistrationRequest extends Request {

    private String login;
    private String password;
    private String email;
    private boolean sex;
    private long date;

    public RegistrationRequest(String login, String password, String email, boolean sex, long date) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.date = date;
    }

    @Override
    public Response requestDo() {
        return new RegistrationResponse(Response.Status.SUCCESS);
    }
}
