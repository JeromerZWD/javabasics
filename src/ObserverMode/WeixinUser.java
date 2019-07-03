package ObserverMode;



public class WeixinUser implements Observer {
    /*
    * 用户名
    * */
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    /**
     *更新信息
     */
    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
