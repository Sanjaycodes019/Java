class UserManagement{
    String userName;

    public UserManagement(String name){
        this.userName = name;
    }
    public void login(){
        System.out.println(userName + " has logged in!");
    }
}

class AdminUser extends UserManagement{
    public AdminUser(String name){
        super(name);
    }
    void accessAdminPanel(){
        System.out.println(userName + " is accessing the admin panel!");
    }
}

class SuperAdminUser extends AdminUser{
    public SuperAdminUser(String name){
        super(name);
    }
    void manageAllAdmin(){
        System.out.println(userName + " is managing all users!");
    }
}


public class User {
    public static void main(String[] args) {
        SuperAdminUser s1 = new SuperAdminUser("Sanjay");
        s1.login();
        s1.accessAdminPanel();
        s1.manageAllAdmin();
    }
}
