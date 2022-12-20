package ac.InterfacesYGenerics.genericClass;

public class Main {
    public static void main(String[] args) {

        Camion transporteCaballos = new Camion(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma", "Caballo"));

        for (Object o: transporteCaballos) {
            //El método .add del objeto camion recibe un objeto tipo Object, por lo que éste es necesario
            //hacerle un cast para convertirlo a tipo Animal
            Animal a = (Animal) o;

            System.out.println("Nombre: " + a.getNombre() + " -- Tipo: " + a.getTipo());
        }

        Camion transpMaquinas = new Camion(3);
        transpMaquinas.add(new Maquinaria("Bulldozer"));
        transpMaquinas.add(new Maquinaria("Grúa Horquilla"));
        transpMaquinas.add(new Maquinaria("Perforadora"));

        for (Object o: transpMaquinas) {
            Maquinaria m = (Maquinaria) o;
            System.out.println("Tipo de maquinaria: " + m.getTipo());
        }

        Camion transpAuto = new Camion(3);
        transpAuto.add(new Automovil("Tesla"));
        transpAuto.add(new Automovil("Renault"));
        transpAuto.add(new Automovil("Opel"));

        for (Object o: transpAuto) {
            Automovil a = (Automovil) o;
            System.out.println("Marca: " + a.getMarca());
        }

    }
}
