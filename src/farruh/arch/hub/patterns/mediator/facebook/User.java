package farruh.arch.hub.patterns.mediator.facebook;

abstract class User {

    protected FacebookGroupMediator facebookGroupMediator;
    protected String name;

    public User(FacebookGroupMediator facebookGroupMediator,String name){
        this.facebookGroupMediator = facebookGroupMediator;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void recieve(String msg);
}
