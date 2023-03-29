package FigurasG;
public class Rectangulo extends Figura {
    private float base;
    private float altura;
    
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    @Override
    public void calcularArea() {
        float area = base * altura;
        System.out.println("La base del rectángulo es " + base + " y su altura es " + altura + ". El área del rectángulo es " + area);
    }
}

