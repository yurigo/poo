import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class Bcrypt {

    private  int workload = 10;

    public Bcrypt(int workload){
        this.workload = workload;
    }

    public String hashPassword(String password){

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(workload);
        String hashedPassword = passwordEncoder.encode(password);

        return hashedPassword;

    }

    public boolean matchesPassword(String password , String hash) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(workload);
        return passwordEncoder.matches(password, hash);
    }

}
