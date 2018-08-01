public class Machine{
    private int id;
    private int cpu;
    private int mem;
    private int disk;

    private int pLimit;
    private int mLimit;
    private int pmLimit;


    protected void init(int i, int c, int m, int d, int pl, int ml, int pml){
        id       = i;
        cpu      = c;
        mem      = m;
        disk     = d;
        pLimit   = pl;
        mLimit   = ml;
        pmLimit  = pml;
    }

    public static void main(String[] args){
        Machine ma = new Machine();
        ma.init(1,2,3,4,5,6,7);
        System.out.println(ma.id);
    }
}