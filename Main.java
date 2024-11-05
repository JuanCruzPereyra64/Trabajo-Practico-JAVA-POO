public class Main {
    public static void main(String[] args){
        persona p1 = new persona("Valentina", "Pereyra", 4789523,2007, "Argentina", "M");
        persona p2 = new persona("Marcelo", "Principe",20972327, 1969, "Argentina", "H");

        p1.mostar_datos();
        p2.mostar_datos();
    }
}
