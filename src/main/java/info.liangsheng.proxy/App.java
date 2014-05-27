package info.liangsheng.proxy;

public class App
{
    public static void main( String[] args )
    {
        IAccountDao accountDao= new AccountDaoProxyImpl(new AccountDaoImpl());
        accountDao.update();
        accountDao.delete();
    }
}
