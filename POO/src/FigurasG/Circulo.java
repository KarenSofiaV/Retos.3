package FigurasG;

public class Circulo extends Figura {
    private float radio;
    
    public Circulo(float radio) {
        this.radio = radio;
    }
    
    public float getRadio() {
        return radio;
    }
    
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
        float area = (float) (Math.PI * Math.pow(radio, 2));
        System.out.println("El radio del círculo es " + radio + ". El área del círculo es " + area);
    }
}
