public class Data {

    private static final String VALID_CHARACTERS = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,0,1,2,3,4,5,6,7,8,9,_";

    public Data() {
    }

    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            checkData(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void checkData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
      if (!validate(login)) {
          throw new WrongLoginException("Невалидный логин");
      }
      if (!validate(password)) {
          throw new WrongPasswordException("Невалидный пароль");
      }
      if (!confirmPassword.equals(password)) {
          throw new WrongPasswordException("Пароли не совпадают");
      }
    }

    private static boolean validate(String s) {
        if (s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}

