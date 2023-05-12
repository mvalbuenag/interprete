// Generated from /home/soporteit/Documentos/Lenguajes/EjemploANTLR/grammar/MiLenguaje.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(MiLenguajeParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(MiLenguajeParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(MiLenguajeParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sinosi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinosi(MiLenguajeParser.SinosiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(MiLenguajeParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(MiLenguajeParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(MiLenguajeParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(MiLenguajeParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(MiLenguajeParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(MiLenguajeParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MiLenguajeParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#llamado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamado(MiLenguajeParser.LlamadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#interna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterna(MiLenguajeParser.InternaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(MiLenguajeParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#parametros2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros2(MiLenguajeParser.Parametros2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#etiqueta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiqueta(MiLenguajeParser.EtiquetaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#goto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto(MiLenguajeParser.GotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MiLenguajeParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(MiLenguajeParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr3(MiLenguajeParser.Expr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArit(MiLenguajeParser.AritContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#arit2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArit2(MiLenguajeParser.Arit2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#arit3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArit3(MiLenguajeParser.Arit3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#arit4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArit4(MiLenguajeParser.Arit4Context ctx);
}