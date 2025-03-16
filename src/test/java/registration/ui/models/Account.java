package registration.ui.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean isReadTerms;
}
