public abstract class Estado {
    private String NuevoTexto;

    public Estado() {
    }

    public String getNuevoTexto() {
        return NuevoTexto;
    }

    public void setNuevoTexto(String NuevoTexto) {
        this.NuevoTexto = NuevoTexto;
    }

    public void Escribir() {
    }

    public String Guardar() {
        return null;
    }
}
