package Tema4.Cosas;

public class Zoologico {

    AnimalPluricelular[] animales;
    CosaPlanta[] vegetacion;

    public Zoologico(int capacidadAnimales, int capacidadPlantas) {
        this.animales = new AnimalPluricelular[capacidadAnimales];
        this.vegetacion = new CosaPlanta[capacidadPlantas];
    }

    public void addCosa(Cosa c) {
        if (c instanceof AnimalPluricelular) {
            animales[0] = (AnimalPluricelular) c;
        } else if (c instanceof CosaPlanta) {
            vegetacion[0] = (CosaPlanta) c;
        }
    }

}
