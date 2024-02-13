interface JDBC {// Utilization layer
    void insrtData();
    void fetchData();
}

class Connector{ // Object creation layer
    static JDBC connect(String type) {
        if (type.equals("MySql")) {
            System.out.println("The app connected with MySql server.");
            return new MySql();
        } else if(type.equals("Oracle")){
            System.out.println("The app connected with Oracle server.");
            return new Oracle();
        } 
        System.out.println("The app is not connected to the database server.");
        return null;
    }
}

class Oracle implements JDBC { //Implementaion layer
    public void insrtData(){
        System.out.println("Inserting data into Oracle database");
    }

    public void fetchData(){
        System.out.println("Fetching data from Oracle database");
    }
}

class MySql implements JDBC{
    public void insrtData(){
        System.out.println("Inserting data into MySQL database");
    }

    public void fetchData(){
        System.out.println("Fetching data from MySQL database");
    }
}
class App {
    public static void main(String[] args) {
        JDBC database = Connector.connect("Oracle");
        database.insrtData();
        database.fetchData();
    }
    
}