/*
* generated by Xtext
*/
package com.zenika.docker.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.zenika.docker.dsl.services.DockerfileDslGrammarAccess;

public class DockerfileDslParser extends AbstractContentAssistParser {
	
	@Inject
	private DockerfileDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.zenika.docker.dsl.ui.contentassist.antlr.internal.InternalDockerfileDslParser createParser() {
		com.zenika.docker.dsl.ui.contentassist.antlr.internal.InternalDockerfileDslParser result = new com.zenika.docker.dsl.ui.contentassist.antlr.internal.InternalDockerfileDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
					put(grammarAccess.getCmdAccess().getGroup(), "rule__Cmd__Group__0");
					put(grammarAccess.getCmdAccess().getGroup_5(), "rule__Cmd__Group_5__0");
					put(grammarAccess.getFromAccess().getGroup(), "rule__From__Group__0");
					put(grammarAccess.getDockerfileAccess().getInstructionsAssignment(), "rule__Dockerfile__InstructionsAssignment");
					put(grammarAccess.getCmdAccess().getExecutableAssignment_3(), "rule__Cmd__ExecutableAssignment_3");
					put(grammarAccess.getCmdAccess().getParamsAssignment_4(), "rule__Cmd__ParamsAssignment_4");
					put(grammarAccess.getCmdAccess().getParamsAssignment_5_1(), "rule__Cmd__ParamsAssignment_5_1");
					put(grammarAccess.getFromAccess().getNameAssignment_1(), "rule__From__NameAssignment_1");
					put(grammarAccess.getFromAccess().getTagAssignment_2(), "rule__From__TagAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.zenika.docker.dsl.ui.contentassist.antlr.internal.InternalDockerfileDslParser typedParser = (com.zenika.docker.dsl.ui.contentassist.antlr.internal.InternalDockerfileDslParser) parser;
			typedParser.entryRuleDockerfile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DockerfileDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DockerfileDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}