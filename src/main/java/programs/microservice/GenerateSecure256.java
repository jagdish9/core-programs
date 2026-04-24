package programs.microservice;

public class GenerateSecure256 {
    public static void main(String[] args) {
        System.out.println(
                java.util.Base64.getEncoder().encodeToString(
                        io.jsonwebtoken.security.Keys.secretKeyFor(
                                io.jsonwebtoken.SignatureAlgorithm.HS256
                        ).getEncoded()
                )
        );
    }
}
