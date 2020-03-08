package decorator.passport.old;

/** 登录接口
 * Created by Tom on 2018/3/17.
 */
public interface ISigninService {
    public ResultMsg regist(String username, String password);


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password);
}
