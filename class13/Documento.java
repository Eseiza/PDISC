public class Documento {
    private String texto;
    private Estado estado;

    public Documento(String texto, Estado estado) {
        this.texto = texto;
        this.estado = estado;
    }

    public String getTexto() {
        return texto;
    }

    public void usarEstado(String res) {
        if (res == null || res.isEmpty()) {
            return;
        }

        char opcion = res.charAt(0);

        if (opcion == 'E') {
            DocEscribir();
        } else if (opcion == 'G') {
            docGuardar();
        }
    }

    private void DocEscribir() {
        estado.Escribir();
    }

    private void docGuardar() {
        if (estado instanceof ModoEdicion) {
            String nuevoTexto = estado.Guardar();
            if (nuevoTexto != null) {
                this.texto = nuevoTexto;
            }
        } else if (estado instanceof SoloLectura) {
            estado.Guardar();
        }
    }
}
