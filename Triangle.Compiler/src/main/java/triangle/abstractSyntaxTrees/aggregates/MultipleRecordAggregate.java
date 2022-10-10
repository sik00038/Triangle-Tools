/*
 * @(#)MultipleRecordAggregate.java                2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package triangle.abstractSyntaxTrees.aggregates;

import triangle.abstractSyntaxTrees.expressions.Expression;
import triangle.abstractSyntaxTrees.terminals.Identifier;
import triangle.abstractSyntaxTrees.visitors.RecordAggregateVisitor;
import triangle.syntacticAnalyzer.SourcePosition;

public class MultipleRecordAggregate extends RecordAggregate {

	public MultipleRecordAggregate(Identifier iAST, Expression eAST, RecordAggregate raAST, SourcePosition position) {
		super(position);
		I = iAST;
		E = eAST;
		RA = raAST;
	}

	public <TArg, TResult> TResult visit(RecordAggregateVisitor<TArg, TResult> v, TArg arg) {
		return v.visitMultipleRecordAggregate(this, arg);
	}

	public final Identifier I;
	public Expression E;
	public final RecordAggregate RA;
}
