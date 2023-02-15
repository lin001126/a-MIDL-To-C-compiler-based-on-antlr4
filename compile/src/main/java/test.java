public class test {
    public static void main(String[] args){
        String s = "’a’";
        try{
            Integer i1 = Integer.valueOf(s);
            System.out.println(i1);
        }catch (Exception e){
            System.out.println("not integer");
        }

//        Integer i2 = new Integer(s);
//        Integer i3 = Integer.parseInt(s);
//
//        System.out.println(i2);
//        System.out.println(i3);
    }
}
