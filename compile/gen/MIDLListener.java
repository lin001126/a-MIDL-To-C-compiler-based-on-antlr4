// Generated from C:/Users/zjj/Desktop/bianyi3\MIDL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MIDLParser}.
 */
public interface MIDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MIDLParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(MIDLParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(MIDLParser.SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definitiontotype}
	 * labeled alternative in {@link MIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinitiontotype(MIDLParser.DefinitiontotypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definitiontotype}
	 * labeled alternative in {@link MIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinitiontotype(MIDLParser.DefinitiontotypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definitiontomodle}
	 * labeled alternative in {@link MIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinitiontomodle(MIDLParser.DefinitiontomodleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definitiontomodle}
	 * labeled alternative in {@link MIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinitiontomodle(MIDLParser.DefinitiontomodleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(MIDLParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(MIDLParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_decltostruct}
	 * labeled alternative in {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decltostruct(MIDLParser.Type_decltostructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_decltostruct}
	 * labeled alternative in {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decltostruct(MIDLParser.Type_decltostructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_decl1}
	 * labeled alternative in {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl1(MIDLParser.Type_decl1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code type_decl1}
	 * labeled alternative in {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl1(MIDLParser.Type_decl1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void enterStruct_type(MIDLParser.Struct_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void exitStruct_type(MIDLParser.Struct_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#member_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_list(MIDLParser.Member_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#member_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_list(MIDLParser.Member_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(MIDLParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(MIDLParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#scoped_name}.
	 * @param ctx the parse tree
	 */
	void enterScoped_name(MIDLParser.Scoped_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#scoped_name}.
	 * @param ctx the parse tree
	 */
	void exitScoped_name(MIDLParser.Scoped_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code base_type_spectofloat}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterBase_type_spectofloat(MIDLParser.Base_type_spectofloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code base_type_spectofloat}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitBase_type_spectofloat(MIDLParser.Base_type_spectofloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code base_type_spectoint}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterBase_type_spectoint(MIDLParser.Base_type_spectointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code base_type_spectoint}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitBase_type_spectoint(MIDLParser.Base_type_spectointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code base_type_spectochar1}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterBase_type_spectochar1(MIDLParser.Base_type_spectochar1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code base_type_spectochar1}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitBase_type_spectochar1(MIDLParser.Base_type_spectochar1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code base_type_spectostring1}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterBase_type_spectostring1(MIDLParser.Base_type_spectostring1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code base_type_spectostring1}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitBase_type_spectostring1(MIDLParser.Base_type_spectostring1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code base_type_spectoboolean1}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterBase_type_spectoboolean1(MIDLParser.Base_type_spectoboolean1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code base_type_spectoboolean1}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitBase_type_spectoboolean1(MIDLParser.Base_type_spectoboolean1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code floating_pt_typetof1}
	 * labeled alternative in {@link MIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 */
	void enterFloating_pt_typetof1(MIDLParser.Floating_pt_typetof1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code floating_pt_typetof1}
	 * labeled alternative in {@link MIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 */
	void exitFloating_pt_typetof1(MIDLParser.Floating_pt_typetof1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code floating_pt_typetod1}
	 * labeled alternative in {@link MIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 */
	void enterFloating_pt_typetod1(MIDLParser.Floating_pt_typetod1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code floating_pt_typetod1}
	 * labeled alternative in {@link MIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 */
	void exitFloating_pt_typetod1(MIDLParser.Floating_pt_typetod1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code floating_pt_typetolong1}
	 * labeled alternative in {@link MIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 */
	void enterFloating_pt_typetolong1(MIDLParser.Floating_pt_typetolong1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code floating_pt_typetolong1}
	 * labeled alternative in {@link MIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 */
	void exitFloating_pt_typetolong1(MIDLParser.Floating_pt_typetolong1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void enterInteger_type(MIDLParser.Integer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void exitInteger_type(MIDLParser.Integer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void enterSigned_int(MIDLParser.Signed_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void exitSigned_int(MIDLParser.Signed_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_int(MIDLParser.Unsigned_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_int(MIDLParser.Unsigned_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#declarators}.
	 * @param ctx the parse tree
	 */
	void enterDeclarators(MIDLParser.DeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#declarators}.
	 * @param ctx the parse tree
	 */
	void exitDeclarators(MIDLParser.DeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(MIDLParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(MIDLParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declarator(MIDLParser.Simple_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declarator(MIDLParser.Simple_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#array_declarator}.
	 * @param ctx the parse tree
	 */
	void enterArray_declarator(MIDLParser.Array_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#array_declarator}.
	 * @param ctx the parse tree
	 */
	void exitArray_declarator(MIDLParser.Array_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#exp_list}.
	 * @param ctx the parse tree
	 */
	void enterExp_list(MIDLParser.Exp_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#exp_list}.
	 * @param ctx the parse tree
	 */
	void exitExp_list(MIDLParser.Exp_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr(MIDLParser.Or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr(MIDLParser.Or_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(MIDLParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(MIDLParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(MIDLParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(MIDLParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(MIDLParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(MIDLParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(MIDLParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(MIDLParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void enterMult_expr(MIDLParser.Mult_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void exitMult_expr(MIDLParser.Mult_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(MIDLParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(MIDLParser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal1}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral1(MIDLParser.Literal1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal1}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral1(MIDLParser.Literal1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code literal2}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral2(MIDLParser.Literal2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal2}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral2(MIDLParser.Literal2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code literal3}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral3(MIDLParser.Literal3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal3}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral3(MIDLParser.Literal3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code literal4}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral4(MIDLParser.Literal4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal4}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral4(MIDLParser.Literal4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code literal5}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral5(MIDLParser.Literal5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code literal5}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral5(MIDLParser.Literal5Context ctx);
}