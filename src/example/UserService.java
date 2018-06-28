package example;

import com.zguiz.bean.User;

import java.util.Date;

public class UserService {
    public User logintoSystem(String account, String password) {
        if("admin".equals(account)&&"admin".equals(password)){
            return new User(account,password,21,new Date(),true);
        }
        return null;
    }
}
