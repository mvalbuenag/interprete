
public class MyVisitor<T> extends MiLenguajeBaseVisitor<T> {

    @Override
    public T visitS(MiLenguajeParser.SContext ctx) {
        System.out.println("Hola mundo");
        return null;
    }
}
