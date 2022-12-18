public class Database {
    private static Database instance;

    private Database() {}

    public static Database getInstance() {
        if (instance == null) {
            Database instance = new Database();
        }
        return instance;
    }

    public void query() {}
}
