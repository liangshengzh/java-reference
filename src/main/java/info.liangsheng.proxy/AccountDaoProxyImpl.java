package info.liangsheng.proxy;
/**
 * Created by liangsheng on 5/27/14.
 */
public class AccountDaoProxyImpl implements IAccountDao {
    private IAccountDao accountDao;

    public AccountDaoProxyImpl(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void update() {
        System.out.println("AccountDaoProxyImpl.update");
        accountDao.update();
    }

    @Override
    public void delete() {
        System.out.println("AccountDaoProxyImpl.delete");
        accountDao.delete();
    }
}
