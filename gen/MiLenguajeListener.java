// Generated from /home/soporteit/Documentos/Lenguajes/EjemploANTLR/grammar/MiLenguaje.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(MiLenguajeParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(MiLenguajeParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(MiLenguajeParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(MiLenguajeParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(MiLenguajeParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(MiLenguajeParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sinosi}.
	 * @param ctx the parse tree
	 */
	void enterSinosi(MiLenguajeParser.SinosiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sinosi}.
	 * @param ctx the parse tree
	 */
	void exitSinosi(MiLenguajeParser.SinosiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(MiLenguajeParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(MiLenguajeParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(MiLenguajeParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(MiLenguajeParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(MiLenguajeParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(MiLenguajeParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(MiLenguajeParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(MiLenguajeParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(MiLenguajeParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(MiLenguajeParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(MiLenguajeParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(MiLenguajeParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MiLenguajeParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MiLenguajeParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#llamado}.
	 * @param ctx the parse tree
	 */
	void enterLlamado(MiLenguajeParser.LlamadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#llamado}.
	 * @param ctx the parse tree
	 */
	void exitLlamado(MiLenguajeParser.LlamadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#interna}.
	 * @param ctx the parse tree
	 */
	void enterInterna(MiLenguajeParser.InternaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#interna}.
	 * @param ctx the parse tree
	 */
	void exitInterna(MiLenguajeParser.InternaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(MiLenguajeParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(MiLenguajeParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#parametros2}.
	 * @param ctx the parse tree
	 */
	void enterParametros2(MiLenguajeParser.Parametros2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#parametros2}.
	 * @param ctx the parse tree
	 */
	void exitParametros2(MiLenguajeParser.Parametros2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#etiqueta}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta(MiLenguajeParser.EtiquetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#etiqueta}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta(MiLenguajeParser.EtiquetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#goto}.
	 * @param ctx the parse tree
	 */
	void enterGoto(MiLenguajeParser.GotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#goto}.
	 * @param ctx the parse tree
	 */
	void exitGoto(MiLenguajeParser.GotoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiLenguajeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiLenguajeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(MiLenguajeParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(MiLenguajeParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr3(MiLenguajeParser.Expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr3(MiLenguajeParser.Expr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#arit}.
	 * @param ctx the parse tree
	 */
	void enterArit(MiLenguajeParser.AritContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#arit}.
	 * @param ctx the parse tree
	 */
	void exitArit(MiLenguajeParser.AritContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#arit2}.
	 * @param ctx the parse tree
	 */
	void enterArit2(MiLenguajeParser.Arit2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#arit2}.
	 * @param ctx the parse tree
	 */
	void exitArit2(MiLenguajeParser.Arit2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#arit3}.
	 * @param ctx the parse tree
	 */
	void enterArit3(MiLenguajeParser.Arit3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#arit3}.
	 * @param ctx the parse tree
	 */
	void exitArit3(MiLenguajeParser.Arit3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#arit4}.
	 * @param ctx the parse tree
	 */
	void enterArit4(MiLenguajeParser.Arit4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#arit4}.
	 * @param ctx the parse tree
	 */
	void exitArit4(MiLenguajeParser.Arit4Context ctx);
}