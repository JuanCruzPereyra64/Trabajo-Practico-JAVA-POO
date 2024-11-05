import java.security.KeyStore;

//149597870
public class Main {
    public static void main(String[] args) {
        Planeta planeta1 = new Planeta("Tierra", 1, 5.9736, 1.08321, 12742, 150000000, true, Planeta.Tipo_planeta.TERRESTRE,1, 365);
        Planeta planeta2 = new Planeta("Jupiter", 1, 1.899, 1.4313, 139820, 750000000, true, Planeta.Tipo_planeta.GASEOSO, 12, 4333 );

        boolean exterior_planeta1 = false, exterior_planeta2 = false;

        planeta1.mostrar_datos();
        planeta2.mostrar_datos();

        System.out.println(" ");

        System.out.println("La densidad de la Tierra es de: " + planeta1.calcular_densidad(5.9736, 1.08321));
        System.out.println("La densidad de Jupiter es de: " + planeta2.calcular_densidad(1.899, 1.4313));

        exterior_planeta1 = planeta1.exterior_interior(1.002);
        exterior_planeta2 = planeta2.exterior_interior(5.013);

        System.out.println(" ");

        if(exterior_planeta1 != false){
            System.out.println("El planeta Tierra es exterior");
        }else {
            System.out.println("El planeta Tierra no es exterior");
        }

        if (exterior_planeta2 != false){
            System.out.println("El planeta Jupiter es exterior");
        }else {
            System.out.println("El planeta Jupiter no es exterior");
        }
    }
}
