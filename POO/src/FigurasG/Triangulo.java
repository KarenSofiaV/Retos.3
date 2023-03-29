package FigurasG;
public class Triangulo extends Figura {
    private float base;
    private float altura;
    private float lado1;
    private float lado2;
    private float lado3;
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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
    public float getLado1() {
        return lado1;
    }
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }
    public float getLado2() {
        return lado2;
    }
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    public float getLado3() {
        return lado3;
    }
    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
    public void calcularArea() {
        float area = (base * altura) / 2;
        System.out.println("La base del triángulo es " + base + ", la altura es " + altura + " y su area es: " + area);
    }
    public void calcularPerimetro() {
        float perimetro = lado1 + lado2 + lado3;
        System.out.println("Los lados del triángulo miden " + lado1 + ", " + lado2 + " y " + lado3 + " y su perimetro es: " + perimetro);
    }
}

