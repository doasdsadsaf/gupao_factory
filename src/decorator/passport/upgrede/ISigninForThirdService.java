package decorator.passport.upgrede;


import decorator.passport.old.ISigninService;
import decorator.passport.old.ResultMsg;

/** 装饰类
 * Created by Tom on 2018/3/17.
 */
public interface ISigninForThirdService extends ISigninService {


    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

    public ResultMsg loginForToken(String token);

    public ResultMsg loginForTelphone(String telphone, String code);

    public ResultMsg loginForRegist(String username, String password);


}
