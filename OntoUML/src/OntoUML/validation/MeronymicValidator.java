/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.validation;


/**
 * A sample validator interface for {@link OntoUML.Meronymic}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MeronymicValidator {
	boolean validate();

	boolean validateIsShareable(boolean value);
	boolean validateIsEssential(boolean value);
	boolean validateIsInseparable(boolean value);
	boolean validateIsImmutablePart(boolean value);
	boolean validateIsImmutableWhole(boolean value);
}
