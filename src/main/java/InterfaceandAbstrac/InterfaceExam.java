package InterfaceandAbstrac;

public class InterfaceExam {
}






interface DbConnection {
    void conn();
}


class Mysql implements DbConnection{
   public void conn(){
    System.out.println("Connect with mysql");
    }
}




abstract class Information{
    public String user;


}

class Postgress extends Information implements DbConnection {

    public void conn(){
        System.out.println("Connect with mysql");
    }
}