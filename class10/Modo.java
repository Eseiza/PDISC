public class Modo extends Plataforma {
    @Override
    int Cobrar(int Costo) {
        System.out.println("Se costeo " + Costo);
        return Costo;
    }
}
