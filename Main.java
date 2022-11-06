public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        boolean success = Data.validate("test", "test@", "tуst");
        if(success) {
            System.out.println("Данные валидны");
        }else{
            System.out.println("Данные не верны");
        }
    }
}
