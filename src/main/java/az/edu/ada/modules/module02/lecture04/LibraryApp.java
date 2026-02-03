package az.edu.ada.modules.module02.lecture04;

class Connector{
    public String conn=null;
    
    public Connector(){
    }
    
    public void connect(String url){
        conn=url;
    }
    
    public void disconnect(){
        conn=null;
    }
}

class DBManager{
    static private Connector connector= new Connector();
    
    public DBManager(){
    }
    
    static public int connect(String url){
        if (DBManager.connector.conn!=null){
            return 1;
        }
        DBManager.connector.connect("url");
        return 0;
    }
    
    static public int disconnect(){
        if(DBManager.connector.conn==null){
            return 1;
        }
        DBManager.connector.disconnect();
        return 0;
    }
}

class DB{
    public DB(){
        
    }
    
    public void addBook(){
        DBManager.connect("book");
        // add book logic
        System.out.println("added book");
        DBManager.disconnect();
    }
}

class Main {
    public static void main(String[] args) {
        DB db=new DB();
        db.addBook();
    }
}
