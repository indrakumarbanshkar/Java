public class StaticRefrenceDirectly {
    static StaticRefrenceDirectly obj;
    static{
        System.out.println(StaticRefrenceDirectly.obj);/*Object Address*/
        StaticRefrenceDirectly.obj= new StaticRefrenceDirectly();
    }

    public static void main(String[] args) {
        System.out.println(StaticRefrenceDirectly.obj);/* Null */
    }
}
