import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Pattern;

public class Validator {

    public static boolean validate (
            String login,
            String password,
            String confirmPassword
    ){

        try {
            if (!Pattern.matches("^[a-zA-Z0-9_]{1,20}$", login)){
                throw new WrongLoginException("Формат логина не верен!");

            }
            if (!Pattern.matches("^[a-zA-Z0-9_]{1,19}$", password)){
                throw new WrongPasswordException("Формат пороля не верен!");
            }
            if (!password.equals(confirmPassword)){
                throw new WrongPasswordException("Пороли не совпадают!");
            }
        } catch (WrongLoginException wrongLoginException){
            wrongLoginException.printStackTrace();
            return false;
        } catch (WrongPasswordException wrongPasswordException){
            wrongPasswordException.printStackTrace();;
            return false;
        }

        return true;
    }
}

