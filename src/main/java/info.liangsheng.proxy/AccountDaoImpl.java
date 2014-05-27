package info.liangsheng.proxy;
/**
 * Created by liangsheng on 5/27/14.
 */
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void update() {
        System.out.println("AccountDaoImpl.update");
    }

    @Override
    public void delete() {
        System.out.println("AccountDaoImpl.delete");
    }
}
