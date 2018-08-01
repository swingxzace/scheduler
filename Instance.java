public class Instance{
    private int id;
    private int app_id;
    private int machine_id = -1;

    protected void init(int i, int a, int m){
        id         = i;
        app_id     = a;
        machine_id = m;
    }
}