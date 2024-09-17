import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;


public class Argon2 {

    public static String hashPassword(String password){

        PasswordEncoder passwordEncoder = new Argon2PasswordEncoder(60,30,1,1024,1024);
        String hashedPassword = passwordEncoder.encode(password);

        return hashedPassword;

    }

    public static boolean matchesPassword(String password , String hash) {
        PasswordEncoder passwordEncoder = new Argon2PasswordEncoder(60,30,1,1024,1024);
        return passwordEncoder.matches(password, hash);
    }

}
