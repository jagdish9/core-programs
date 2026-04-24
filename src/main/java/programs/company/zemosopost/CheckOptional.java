package programs.company.zemosopost;

import java.util.Optional;

public class CheckOptional {
    public static void main(String[] args) {
        String str = new String("Mongo");

        String str2 = null;
        Optional<String> s1 = Optional.of(str);
        Optional<String> s2 = Optional.ofNullable(str2);
        Optional<String> s3 = Optional.ofNullable(null);

        System.out.println(s1.get());
        System.out.println(s2);

        if(s1.isPresent()) {
            System.out.println(s1.get());
        }

        s1.ifPresent(f -> System.out.println(f));

        String v1 = s2.orElse("Default data");
        System.out.println(v1);

        String v2 = s2.orElseGet(() -> "Generated default value");
        System.out.println(v2);

        /*String v3 = s2.orElseThrow(() -> new RuntimeException("Value not present"));
        System.out.println(v3);*/

        Optional<String> v4 = s1.map(s -> s.toUpperCase());
        System.out.println(v4.get());

        Optional<String> v5 = s1.flatMap(val -> Optional.of(val.toLowerCase()));
        System.out.println(v5.get());

        /*Optional<String> v6 = s3.ifPresentOrElse(
                val -> System.out.println(val),
                () -> System.out.println("Value not present")
        );

        System.out.print(v6);*/
    }
}
