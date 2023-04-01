public class Main {
    public static void main(String[] args) {

        String login = "user";
        String password = "password1";
        String confirmPassword = "password";


        System.out.println(Validator.validate(login,password,confirmPassword));

    }
}