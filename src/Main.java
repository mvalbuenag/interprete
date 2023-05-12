import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        MiLenguajeLexer lexer = new MiLenguajeLexer(CharStreams.fromFileName("input/entrada.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiLenguajeParser parser = new MiLenguajeParser(tokens);
        ParseTree tree = parser.s();

        MyVisitor loader = new MyVisitor();
        loader.visit(tree);
    }
}
