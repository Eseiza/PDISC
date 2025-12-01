public class MP extends Plataforma {
    @Override
    int Cobrar(int costo) {
        System.out.println("Se costeo " + costo);
        return costo;
    }
}
